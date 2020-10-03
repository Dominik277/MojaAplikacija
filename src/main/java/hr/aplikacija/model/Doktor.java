/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Dominik
 */
@Entity
@Table(name = "doktor")
public class Doktor extends Osoba {

    private String email;
    
    @OneToMany(mappedBy = "doktor")
    private List<Pregled> pregledi=new ArrayList<>();

    public List<Pregled> getPregledi() {
        return pregledi;
    }

    public void setPregledi(List<Pregled> pregledi) {
        this.pregledi = pregledi;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
