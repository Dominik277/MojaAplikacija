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
        
    }

    @Override
    protected void kontrolaDelete() throws MyException {
        
    }
    
    private void kontrolaNaziv() throws MyException{
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().isEmpty()){
            throw new MyException("Naziv usluge se mora unijeti");
        }
    }
    
    private void kontrolaCijena() throws MyException{
        PomocnaMetoda.kontrolaNull(entitet.getCijena(), "Cijena obavezna");
        if(entitet.getCijena().compareTo(BigDecimal.ZERO)<=0){
            throw new MyException("Cijena ne može biti manja ili jednaka nuli");
        }
    }
    
}
