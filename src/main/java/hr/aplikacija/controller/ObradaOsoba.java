/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Osoba;
import hr.aplikacija.utility.MyException;
import hr.aplikacija.utility.Oib;
import hr.aplikacija.utility.PomocnaMetoda;

/**
 *
 * @author Dominik
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T>{
    
    @Override
    protected void kontrolaCreate() throws MyException{
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
    }
    
    @Override
    protected void kontrolaUpdate() throws MyException{
        
    }
    
    @Override
    protected void kontrolaDelete() throws MyException{
        
    }
    
    private void kontrolaIme() throws MyException{
        PomocnaMetoda.neMozeBitiBroj(entitet.getIme(), "Ime ne moze biti broj");
        if(entitet.getIme()==null || entitet.getIme().isEmpty()){
            throw new MyException("Ime se mora unijeti");
        }
    }
    
    private void kontrolaPrezime() throws MyException{
        PomocnaMetoda.neMozeBitiBroj(entitet.getIme(), "Prezime ne moze biti broj");
        if(entitet.getPrezime()==null || entitet.getPrezime().isEmpty()){
            throw new MyException("Prezime se mora unijeti");
        }
    }
    
    private void kontrolaOib() throws MyException{
        if(entitet.getOib()==null || entitet.getOib().isEmpty()){
            throw new MyException("Unos OIB-a je obavezan");
        }
        if(!Oib.isValjan(entitet.getOib())){
            throw new MyException("OIB nije valjan");
        }
        
    }
    
}
