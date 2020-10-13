/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.start;

import hr.aplikacija.controller.ObradaDoktor;
import hr.aplikacija.controller.ObradaPacijent;
import hr.aplikacija.model.Doktor;
import hr.aplikacija.model.Pacijent;
import hr.aplikacija.utility.HibernateUtil;
import hr.aplikacija.utility.MyException;
import hr.aplikacija.utility.PocetniInsert;
import hr.aplikacija.view.Autorizacija;
import hr.aplikacija.view.Izbornik;
import hr.aplikacija.view.SplashScreen;
import java.util.ArrayList;
import java.util.List;
//import hr.aplikacija.utility.PocetniInsert;

/**
 *
 * @author Dominik
 */
public class Start {
    
    public static void main(String[] args){
    
        //new Izbornik().setVisible(true);
        //new Autorizacija().setVisible(true);
        new SplashScreen().setVisible(true);
        
        //PocetniInsert.dodajPacijente();
        
        
        //PocetniInsert.izvedi();
        //PocetniInsert.adminOperater();
        
        //HibernateUtil.getSessionFactory().openSession();
  
       // PROVJERA
                
//        Doktor doktor = new Doktor();
//        doktor.setIme("Ivan");
//        doktor.setPrezime("Ivić");
//        doktor.setOib("154311451");
//        doktor.setEmail("ivanivic@edunova.hr");
//        
//        ObradaDoktor obradaDoktor = new ObradaDoktor();
//        obradaDoktor.setEntitet(doktor);
//        try {
//            obradaDoktor.create();
//        } catch (Exception e) {
//            System.out.println(ex.getPoruka);
//        }
//        
        

//      PROVJERA

//        Pacijent pacijent = new Pacijent();
//        pacijent.setIme("Jure");
//        pacijent.setPrezime("Jurić");
//        pacijent.setEmail("jurejuric@edunova.hr");
//        pacijent.setOib("98605780570");
//        pacijent.setBroj("51345");
//        
//        ObradaPacijent op = new ObradaPacijent();
//        op.setEntitet(pacijent);
//        try {
//            op.create();
//        } catch (Exception e) {
//            System.out.println(ex.getPoruka);
//        }
//        
        
        
        
        
//        Doktor doktor = new Doktor();
//
//        ObradaDoktor obradaDoktor = new ObradaDoktor(doktor);
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
