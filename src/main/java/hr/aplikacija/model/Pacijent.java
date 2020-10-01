/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author Dominik
 */
@Entity
@Table(name = "pacijent")
public class Pacijent extends Osoba {

    private String broj;
    
    @ManyToMany(mappedBy = "pacijenti")
    private List<UslugaPregled> uslugaPregledi = new ArrayList<>();

    public List<UslugaPregled> getUslugaPregledi() {
        return uslugaPregledi;
    }

    public void setUslugaPregledi(List<UslugaPregled> uslugaPregledi) {
        this.uslugaPregledi = uslugaPregledi;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

}
