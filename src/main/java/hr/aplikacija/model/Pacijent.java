/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Dominik
 */

@Entity
public class Pacijent extends Entitet{
    
    private String ime;
    private String prezime;
    private String adresa;
    private String grad;
    //private String drzava;
    private String email;
    private String oib;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

   // public String getDrzava() {
   //     return drzava;
   // }

   // public void setDrzava(String drzava) {
   //     this.drzava = drzava;
   // }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

}
