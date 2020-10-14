/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.controller;

import hr.aplikacija.model.Operater;
import hr.aplikacija.utility.MyException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Dominik
 */
public class ObradaOperater extends ObradaOsoba<Operater> {

    public Operater autoriziraj(String email, char[] lozinka) {

        Operater operater = (Operater) session.createQuery(
                "from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();

        if (operater == null) {
            return null;
        }
        return BCrypt.checkpw(new String(lozinka), operater.getLozinka())
                ? operater : null;
    }

    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }

    @Override
    protected void kontrolaCreate() throws MyException {
        super.kontrolaCreate();
        kontrolaIme();
        kontrolaUloga();
        kontrolaOibBazaKreiraj();
        kontrolaLozinka();
        kontrolaUlogaOdabran();
    }

    @Override
    protected void kontrolaUpdate() throws MyException {
        super.kontrolaUpdate();
        kontrolaOibBazaPromjeni();
    }

    @Override
    protected void kontrolaDelete() throws MyException {
        
    }

    private void kontrolaUloga() throws MyException{
        if(entitet.getUloga()==null){
            throw new MyException("Uloga je obavezna, ne može biti prazna!");
        }
    }
    
    private void kontrolaLozinka() throws MyException {
        if(entitet.getLozinka().isEmpty() || entitet.getLozinka()== null){
            throw new MyException("Lozinka je obavezna, ne može biti prazna!");
        }
    }

    private void kontrolaOibBazaKreiraj() throws MyException {
        List<Operater> lista = session.createQuery(""
            + "from Operater o "
            + "where o.oib=:oib ")
            .setParameter("oib", entitet.getOib())
            .list();
        if(lista.size()>0){
            throw new MyException("Oib je dodjeljen " + lista.get(0) 
                    .getImePrezime() + ", unesite drugi Oib!");
        }
    }

    private void kontrolaOibBazaPromjeni() throws MyException{
        List<Operater> lista = session.createQuery(""
            + "from Operater o "
            + "where o.oib=:oib and o.id!=:id")
            .setParameter("oib", entitet.getOib())
            .setParameter("id", entitet.getId())
            .list();
        if(lista.size()>0){
            throw new MyException("Oib je dodjeljen " + lista.get(0) 
                    .getImePrezime() + ", unesite drugi Oib!");
        }
    }

    private void kontrolaUlogaOdabran() throws MyException {
        if(entitet.getUloga()==null){
            throw new MyException("Potrebno je odabrati ulogu");
        }
    }
    
    

}
