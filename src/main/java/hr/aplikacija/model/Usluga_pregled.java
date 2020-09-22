/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dominik
 */
@Entity
public class Usluga_pregled extends Entitet{
    
    @ManyToOne
    private Pregled pregled;
    
    @ManyToOne
    private Usluga usluga;
    
}
