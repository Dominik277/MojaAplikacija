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
        kontrolaDatum();
    }

    @Override
    protected void kontrolaUpdate() throws MyException {
        kontrolaNaziv();
        kontrolaOpis();
        kontrolaSimptomi();
        kontrolaDatum();
    }

    @Override
    protected void kontrolaDelete() throws MyException {
//        if(entitet.getPacijent().equals(null)){
//            throw new MyException("Pacijent se ne može brisati");
//        }
    if(entitet.getUslugaPregledi().size()>0){
        throw new MyException("Pregled se ne može obrisati!");
    }
 }

    private void kontrolaNaziv() throws MyException{
        PomocnaMetoda.neMozeBitiBroj(entitet.getNaziv(), "Naziv ne moze biti broj");
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().isEmpty()){
            throw new MyException("Naziv se mora unijeti");
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

    private void kontrolaNull(Object o, String poruka) throws MyException{
        if(o==null){
            throw new MyException(poruka);
        }
    }

    private void kontrolaDatum() throws MyException {
        kontrolaNull(entitet.getDatum(), "Unos datuma je obavezan");
    }
    
    private void kontrolaDoktor() throws MyException{
        if(!(entitet.getDoktor()!=null && entitet.getDoktor().getId()>0)){
            throw new MyException("Obavezan odabir doktora!");
        }
    }
    
}
