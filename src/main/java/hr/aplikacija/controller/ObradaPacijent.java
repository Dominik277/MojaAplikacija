/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Pacijent;
import hr.aplikacija.utility.MyException;
import hr.aplikacija.utility.Oib;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class ObradaPacijent extends Obrada<Pacijent>{

    @Override
    public List<Pacijent> getPodaci() {
        return session.createQuery("from Pacijent").list();
    }

    @Override
    protected void kontrolaCreate() throws MyException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaEmail();
        kontrolaOib();
        kontrolaBroj();
    }

    @Override
    protected void kontrolaUpdate() throws MyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaDelete() throws MyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void kontrolaIme() throws MyException{
        if(entitet.getIme()== null || entitet.getIme().isEmpty()){
           throw new MyException("Ime mora biti uneseno");
    }
        if(entitet.getIme().length()>50){
           throw new MyException("Ime ne moze biti duze od 50 znakova ");
       }
         boolean broj = false;
       try{
          new BigDecimal(entitet.getIme());
           broj = true;
       }catch(Exception e){
       }
           if(broj){
               throw new MyException("Ime ne moze biti broj");
           }
}
    
    private void kontrolaPrezime() throws MyException{
       if(entitet.getPrezime()== null || entitet.getPrezime().isEmpty()){
           throw new MyException("Prezime mora biti uneseno");
       }
   }
    
//    private void kontrolaOib() throws MyException{
//       kontrolaNull(entitet.getOib(), "Oib je obavezan");
//       if(entitet.getOib().compareTo(BigDecimal.ZERO)<0){
//           throw new MyException("OIB ne moze biti 0");
//       }
//   }
    
    protected void kontrolaOib() throws MyException{
     if(entitet.getOib()==null || entitet.getOib().isEmpty()){
         throw new MyException("Unos OIB-a je obavezan");
     }
    if(!Oib.isValjan(entitet.getOib())){
         throw new MyException("OIB nije valjan");
     }
    }
    
    private void kontrolaBroj() throws MyException{
       kontrolaNull(entitet.getBroj(), "Broj telefona je obavezan");
       if(entitet.getBroj().compareTo(Long.MAX_VALUE)<0){
           throw new MyException("Ukupan broj predjenih kilometara ne moze biti manji od 0");
       }
   }
    
//    private void kontrolaEmail() throws MyException{
//       if(entitet.getEmail().compareTo(BigDecimal.ZERO)<0){
//           throw new MyException("Ukupan broj predjenih kilometara ne moze biti manji od 0");
//       }
//   }
    
    private void kontrolaEmail() throws MyException{
        if(entitet.getEmail()== null){
            throw new MyException("Email nije unesen");
        }
    }
    
    
    private void kontrolaNull(Object o, String poruka)throws MyException{
         if(o==null){
           throw new MyException(poruka);
           }
       }
}
