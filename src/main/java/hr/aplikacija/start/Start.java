/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.start;

import hr.aplikacija.controller.ObradaDoktor;
import hr.aplikacija.model.Doktor;
import hr.aplikacija.utility.HibernateUtil;
import hr.aplikacija.utility.MyException;
import hr.aplikacija.utility.PocetniInsert;
//import hr.aplikacija.utility.PocetniInsert;

/**
 *
 * @author Dominik
 */
public class Start {
    
    public static void main(String[] args){
    
        //PocetniInsert.izvedi();
        
        //HibernateUtil.getSessionFactory().openSession();
        
        Doktor doktor = new Doktor();

        ObradaDoktor obradaVozac = new ObradaDoktor(doktor);

        try {
            obradaVozac.create();
        } catch (MyException ex) {
            System.out.println(ex.getPoruka());
        }
     }  
    
}
