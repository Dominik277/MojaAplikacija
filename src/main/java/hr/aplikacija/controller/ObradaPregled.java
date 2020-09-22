/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Pregled;
import hr.aplikacija.utility.MyException;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class ObradaPregled extends Obrada<Pregled>{

    @Override
    public List<Pregled> getPodaci() {
        return null;
        
    }

    @Override
    protected void kontrolaCreate() throws MyException {
        
    }

    @Override
    protected void kontrolaUpdate() throws MyException {
        
    }

    @Override
    protected void kontrolaDelete() throws MyException {
        
    }
    
}
