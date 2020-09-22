/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Doktor;
import hr.aplikacija.utility.MyException;

/**
 *
 * @author Dominik
 */
public class ObradaDoktor extends Obrada<Doktor>{
    
    public ObradaDoktor(Doktor doktor){
        super(doktor);
    }
    
    @Override
    protected void kontrolaCreate() throws MyException{
        if(entitet.getIme()==null){
            throw new MyException("Ime nije uneseno.");
        }
    }
    
    @Override
    protected void kontrolaUpdate() throws MyException{
        
    }
    
    @Override
    protected void kontrolaDelete() throws MyException{
        
    }
}
