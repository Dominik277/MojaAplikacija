/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Doktor;
import hr.aplikacija.utility.MyException;
import hr.aplikacija.utility.Oib;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class ObradaDoktor extends Obrada<Doktor>{
    
    public ObradaDoktor(Doktor doktor){
        super(doktor);
    }
    
    public ObradaDoktor(){
        super();
    }
    
     @Override
    public List<Doktor> getPodaci() {
        return session.createQuery("from Doktor").list();
    }
    
    @Override
    protected void kontrolaCreate() throws MyException{
//        if(entitet.getIme()==null){
//            throw new MyException("Ime nije uneseno.");
//        }

        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaEmail();
    }
    
    @Override
    protected void kontrolaUpdate() throws MyException{
        
    }
    
    @Override
    protected void kontrolaDelete() throws MyException{
        
    }

    private void kontrolaIme()throws MyException{
        if(entitet.getIme()== null || entitet.getIme().isEmpty()){
         throw new MyException("Ime se mora unijeti");
     }
    }
    
    private void kontrolaPrezime() throws MyException{
     if(entitet.getPrezime()== null || entitet.getPrezime().isEmpty()){
         throw new MyException("Prezime se mora unijeti");
     }
 }
    
    protected void kontrolaOib() throws MyException{
     if(entitet.getOib()==null || entitet.getOib().isEmpty()){
         throw new MyException("Unos OIB-a je obavezan");
     }
    if(!Oib.isValjan(entitet.getOib())){
         throw new MyException("OIB nije valjan");
     }
    }
    
    private void kontrolaEmail() throws MyException{
        if(entitet.getEmail()== null){
            throw new MyException("Email nije unesen");
        }
    }
}
