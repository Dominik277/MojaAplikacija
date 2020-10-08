/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Usluga;
import hr.aplikacija.utility.MyException;
import hr.aplikacija.utility.PomocnaMetoda;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class ObradaUsluga extends Obrada<Usluga> {

    @Override
    public List<Usluga> getPodaci() {
        return session.createQuery("from Usluga").list();
    }

    @Override
    protected void kontrolaCreate() throws MyException {
        
        kontrolaNaziv();
        kontrolaCijena();
        
    }

    @Override
    protected void kontrolaUpdate() throws MyException {
//        kontrolaNaziv();
//        kontrolaCijena();
          kontrolaCreate();
    }

    @Override
    protected void kontrolaDelete() throws MyException {
        
    }
    
    private void kontrolaNaziv() throws MyException{
        kontrolaNull(entitet.getNaziv(), "Naziv nije definiran");
        
        if(entitet.getNaziv().isEmpty()){
            throw new MyException("naziv", "Naziv nije postavljen,unijeti naziv");
        }
        boolean broj=false;
        try {
            new BigDecimal(entitet.getNaziv());
            broj=true;
        } catch (Exception e) {
        }
        if(broj){
            throw new MyException("Naziv ne može biti broj,unijeti naziv");
        }
        if(entitet.getNaziv().length()>50){
            throw new MyException("Dužina naziva ne može biti veća od 50 znakova");
        }
    }
    
    private void kontrolaCijena() throws MyException{
        kontrolaNull(entitet.getCijena(), "Cijena nije definirana");
        if(entitet.getCijena().compareTo(BigDecimal.ZERO)<=0){
            throw new MyException("Cijena ne može biti manja ili jednaka nuli");
        }
        if(entitet.getCijena().compareTo(new BigDecimal(100000))==1){
            throw new MyException("Cijena ne može biti veća od 100.000,00 kn");
        }
    }
    
    private void kontrolaNull(Object o, String poruka) throws MyException{
        if(o==null){
            throw new MyException(poruka);
        }
    }
    
}
