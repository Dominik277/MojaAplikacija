/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Operater;
import hr.aplikacija.utility.MyException;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class ObradaOperater extends ObradaOsoba<Operater>{
        

    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }
    
    @Override
    protected void kontrolaCreate() throws MyException{
        super.kontrolaCreate();
    }
    
    @Override
    protected void kontrolaUpdate() throws MyException{
        super.kontrolaUpdate();
    }
    
    @Override
    protected void kontrolaDelete() throws MyException{
        super.kontrolaDelete();
    }
    
}
