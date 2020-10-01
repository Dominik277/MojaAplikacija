/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Pregled;
import hr.aplikacija.utility.MyException;
import hr.aplikacija.utility.PomocnaMetoda;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class ObradaPregled extends Obrada<Pregled>{

    @Override
    public List<Pregled> getPodaci() {
        return session.createQuery("from Pregled").list();
        
    }

    @Override
    protected void kontrolaCreate() throws MyException {
        kontrolaNaziv();
        kontrolaOpis();
        kontrolaSimptomi();
        //kontrolaDatum();
    }

    @Override
    protected void kontrolaUpdate() throws MyException {
        
    }

    @Override
    protected void kontrolaDelete() throws MyException {
//        if(entitet.getPregledi.size()>0){
//            throw new MyException("");
//        }
    }

    private void kontrolaNaziv() throws MyException{
        PomocnaMetoda.neMozeBitiBroj(entitet.getNaziv(), "Naziv ne moze biti broj");
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().isEmpty()){
            throw new MyException("Naziv tvrtke se mora unijeti");
        }
    }

    private void kontrolaOpis() throws MyException{
        PomocnaMetoda.neMozeBitiBroj(entitet.getOpis(), "Opis ne moze biti broj");
        if(entitet.getOpis()==null || entitet.getOpis().trim().isEmpty()){
            throw new MyException("Opis mora biti unesen");
        }
    }

    private void kontrolaSimptomi() throws MyException{
        PomocnaMetoda.neMozeBitiBroj(entitet.getSimptomi(), "Simptomi ne mogu biti broj");
        if(entitet.getSimptomi()==null || entitet.getSimptomi().trim().isEmpty()){
            throw new MyException("Simptomi moraju biti uneseni");
        }
    }

//    private void kontrolaDatum() throws MyException{
//         
//    }
    
}
