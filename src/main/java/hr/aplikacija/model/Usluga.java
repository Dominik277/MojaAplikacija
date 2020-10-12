/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Dominik
 */
@Entity
@Table(name="usluga")
public class Usluga extends Entitet{
    
    private String naziv;
    private BigDecimal cijena;
    
//   @ManyToMany(mappedBy = "usluge")
//   private List<Pregled> pregledi = new ArrayList<>();
//
//    public List<Pregled> getPregledi() {
//        return pregledi;
//    }
//
//    public void setPregledi(List<Pregled> pregledi) {
//        this.pregledi = pregledi;
//    }
    
//    @OneToMany(mappedBy = "usluga")
//    private List<UslugaPregled> uslugaPregledi = new ArrayList<>();
//
//    public List<UslugaPregled> getUslugaPregledi() {
//        return uslugaPregledi;
//    }
//
//    public void setUslugaPregledi(List<UslugaPregled> uslugaPregledi) {
//        this.uslugaPregledi = uslugaPregledi;
//    }
    
//    @OneToMany(mappedBy = "usluga")
//    private List<UslugaPregled> uslugePregledi = new ArrayList<>();
//
//    public List<UslugaPregled> getUslugePregledi() {
//        return uslugePregledi;
//    }
//
//    public void setUslugePregledi(List<UslugaPregled> uslugePregledi) {
//        this.uslugePregledi = uslugePregledi;
//    }
   
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    
    @Override
    public String toString(){
        return getNaziv();
    }
    
}
