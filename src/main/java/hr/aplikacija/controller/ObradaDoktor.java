/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Doktor;
import hr.aplikacija.utility.MyException;
import hr.aplikacija.utility.Oib;
import hr.aplikacija.utility.PomocnaMetoda;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class ObradaDoktor extends ObradaOsoba<Doktor> {
    
    @Override
    public List<Doktor> getPodaci() {
        return session.createQuery("from Doktor").list();
    }

    public List<Doktor> getPodaci(String uvjet) {
        return session.createQuery("from Doktor d "
              + " where concat(d.ime, ' ', d.prezime, ' ', d.oib) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
    }

    @Override
    protected void kontrolaCreate() throws MyException {
        super.kontrolaCreate();
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaEmail();
        kontrolaOibBazaKreiraj();
       
    }

    @Override
    protected void kontrolaUpdate() throws MyException {
        
        super.kontrolaUpdate();
//        kontrolaIme();
//        kontrolaPrezime();
//        kontrolaOib();
//        kontrolaEmail();
        kontrolaOibBazaPromjeni();
    }

    @Override
    protected void kontrolaDelete() throws MyException {
        if(entitet.getPregledi().size()>0){
            throw new MyException("Doktor se ne može obrisati jer je na jednom ili više pregleda");
        }
    }

 
    protected void kontrolaIme() throws MyException {
        PomocnaMetoda.neMozeBitiBroj(entitet.getIme(), "Ime ne moze biti broj");
        if (entitet.getIme() == null || entitet.getIme().trim().isEmpty()) {
            throw new MyException("Ime mora biti uneseno");
        }
        if (entitet.getIme().length() > 50) {
            throw new MyException("Ime ne moze biti duze od 50 znakova ");
        }
    }

    protected void kontrolaPrezime() throws MyException {
        PomocnaMetoda.neMozeBitiBroj(entitet.getPrezime(), "Prezime ne moze biti broj");
        if (entitet.getPrezime() == null || entitet.getPrezime().trim().isEmpty()) {
            throw new MyException("Prezime mora biti uneseno");
        }
        if (entitet.getPrezime().length() > 50) {
            throw new MyException("Prezime ne moze biti duze od 50 znakova ");
        }
    }

    protected void kontrolaOib() throws MyException {
        if (entitet.getOib() == null || entitet.getOib().trim().isEmpty()) {
            throw new MyException("Unos OIB-a je obavezan");
        }
        if (!Oib.isValjan(entitet.getOib())) {
            throw new MyException("OIB nije valjan");
        }
    }

    protected void kontrolaEmail() throws MyException {
        if (entitet.getEmail() == null || entitet.getEmail().trim().isEmpty()) {
            throw new MyException("Email mora biti unesen");
        }
        if (entitet.getEmail().length() > 50) {
            throw new MyException("Email ne moze biti duzi od 50 znakova ");
        }
    }
    
    private void kontrolaOibBazaKreiraj() throws MyException{
       List<Doktor> lista = session.createQuery(""
               + " from Doktor d "
               + " where d.oib=:oib "
               )
               .setParameter("oib", entitet.getOib())
               .list();
       if(lista.size()>0){
           throw new MyException("Oib je dodjeljen " + lista.get(0).getImePrezime()+ ", odaberite drugi OIB");
       }
    }
    
    
    private void kontrolaOibBazaPromjeni() throws MyException{
       List<Doktor> lista = session.createQuery(""
               + " from Doktor d "
               + " where d.oib=:oib and d.id!=:id"
               )
               .setParameter("oib", entitet.getOib())
               .setParameter("id", entitet.getId())
               .list();
       if(lista.size()>0){
           throw  new MyException("Oib je dodjeljen " + lista.get(0).getImePrezime()+ ", odaberite drugi OIB");
       }
       
    }

    
}
