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
import java.util.ArrayList;
import java.util.List;
//import hr.aplikacija.utility.PocetniInsert;

/**
 *
 * @author Dominik
 */
public class Start {
    
    public static void main(String[] args){
    
        //PocetniInsert.izvedi();
        
        //HibernateUtil.getSessionFactory().openSession();
        
//        Doktor doktor = new Doktor();
//
//        ObradaDoktor obradaVozac = new ObradaDoktor(doktor);
//
//        try {
//            obradaVozac.create();
//        } catch (MyException ex) {
//            System.out.println(ex.getPoruka());
//        }

//        Doktor doktor = new Doktor();
//
//        ObradaDoktor obradaDoktor = new ObradaDoktor(doktor);
//        List<Doktor> listaDoktora = new ArrayList<>();
//
//        long pocetak = System.currentTimeMillis();
//
//        for (int i =0; i<1000; i++){
//        doktor = new Doktor();
//        doktor.setIme("Marko");
//
//
//        listaDoktora.add(doktor);
//             try {
//            obradaDoktor.createAll(listaDoktora);
//        } catch (MyException ex) {
//            System.out.println(ex.getPoruka());
//        }
//     }  
//    long kraj = System.currentTimeMillis();
//
//        System.out.println(kraj - pocetak);
    
//    Doktor doktor = new Doktor();
//    doktor.setIme("Marko");
//    doktor.setPrezime("Marić");
//    doktor.setEmail("mmarko@edunova.hr");
//    doktor.setOib("14324");
//    
//    ObradaDoktor od = new ObradaDoktor();
//    od.setEntitet(doktor);
//        try {
//            od.create();
//        } catch (MyException ex) {
//            System.out.println(ex.getPoruka());
//        }
    
 }
}
