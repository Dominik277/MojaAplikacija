/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Dominik
 */
@Entity
@Table(name="pregled")
public class Pregled extends Entitet{
    
    private String naziv;
    private String opis;
    private String simptomi;
    private Date datum;
    
    

    @ManyToOne
    private Doktor doktor;
    
    @ManyToOne
    private Pacijent pacijent;
    
    @OneToMany(mappedBy = "pregled")
    private List<UslugaPregled> uslugaPregledi = new ArrayList<>();

    public List<UslugaPregled> getUslugaPregledi() {
        return uslugaPregledi;
    }

    public void setUslugaPregledi(List<UslugaPregled> uslugaPregledi) {
        this.uslugaPregledi = uslugaPregledi;
    }
    
//    @ManyToMany
//    @JoinTable(
//        name = "clan",
//        joinColumns = @JoinColumn(name = "pregled"),
//        inverseJoinColumns = @JoinColumn(name = "usluga"))
    
//    private List<Usluga> usluge = new ArrayList<>();
//
//    public List<Usluga> getUsluge() {
//        return usluge;
//    }
//
//    public void setUsluge(List<Usluga> usluge) {
//        this.usluge = usluge;
//    }
    
//    @ManyToMany
//    private List<Usluga> usluge = new ArrayList<>();

//   public List<Usluga> getUsluge() {
//        return usluge;
//    }

//    public void setUsluge(List<Usluga> usluge) {
//        this.usluge = usluge;
//   }
    
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Pacijent getPacijent() {
        return pacijent;
    }

    public void setPacijent(Pacijent pacijent) {
        this.pacijent = pacijent;
    }
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getSimptomi() {
        return simptomi;
    }

    public void setSimptomi(String simptomi) {
        this.simptomi = simptomi;
    }

    @Override
    public String toString() {
        if(getPacijent()==null){
            return getNaziv();
        }
        return getNaziv()+ " (" + getPacijent().getIme() + ")";
    } 
    
    
//    public String toString2() {
//        if(getUslugaPregledi()==null){
//            return getNaziv();
//        }
//        return getNaziv()+ " (" + getUslugaPregledi().get(0)+ ")";
//    }
//    
    
    
    

}
