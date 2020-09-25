/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Dominik
 */

@Entity
@Table(name="doktor")
public class Doktor extends Osoba{
    
    
    private String email;
    

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
