/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Pacijent;
import hr.aplikacija.utility.MyException;
import hr.aplikacija.utility.Oib;
import hr.aplikacija.utility.PomocnaMetoda;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class ObradaPacijent extends Obrada<Pacijent> {

    @Override
    public List<Pacijent> getPodaci() {
        return session.createQuery("from Pacijent").list();
    }

    public List<Pacijent> getPodaci(String uvjet) {

        return session.createQuery("from Pacijent p "
                + " where concat(p.ime, ' ',p.prezime, ' ', p.oib) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

    @Override
    protected void kontrolaCreate() throws MyException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaEmail();
        kontrolaOib();
        kontrolaOibBazaKreiraj();
        kontrolaBroj();
    }

    @Override
    protected void kontrolaUpdate() throws MyException {
        kontrolaOibBazaPromjeni();
        
    }

    @Override
    protected void kontrolaDelete() throws MyException {
        if (entitet.getPregledi().size() > 0) {
            throw new MyException("Pacijent se ne može obrisati....");
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
        if (entitet.getIme().length() > 50) {
            throw new MyException("Ime ne moze biti duze od 50 znakova ");
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

    protected void kontrolaBroj() throws MyException {
        kontrolaNull(entitet.getBroj(), "Broj je je obavezan");
        if (entitet.getBroj() == null || entitet.getBroj().trim().isEmpty()) {
            throw new MyException("Broj ne moze biti jednak ili manji od nule");
        }
    }

    protected void kontrolaEmail() throws MyException {
        if (entitet.getEmail() == null) {
            throw new MyException("Email nije unesen");
        }
        if (entitet.getEmail().length() > 50) {
            throw new MyException("Email ne moze biti duzi od 50 znakova ");
        }
    }

    protected void kontrolaNull(Object o, String poruka) throws MyException {
        if (o == null) {
            throw new MyException(poruka);
        }
    }

    private void kontrolaOibBazaKreiraj() throws MyException {
        List<Pacijent> lista = session.createQuery(""
                + " from Pacijent p "
                + " where p.oib=:oib "
        )
                .setParameter("oib", entitet.getOib())
                .list();
        if (lista.size() > 0) {
            throw new MyException("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", odaberite drugi OIB");
        }
    }

    private void kontrolaOibBazaPromjeni() throws MyException {
        List<Pacijent> lista = session.createQuery(""
                + " from Pacijent p "
                + " where p.oib=:oib and p.id!=:id"
        )
                .setParameter("oib", entitet.getOib())
                .setParameter("id", entitet.getId())
                .list();
        if (lista.size() > 0) {
            throw new MyException("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", odaberite drugi OIB");
        }
    }
}
