/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.utility;

import com.github.javafaker.Faker;
import hr.aplikacija.model.Doktor;
import hr.aplikacija.model.Pacijent;
import hr.aplikacija.model.Pregled;
import hr.aplikacija.model.Usluga;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.Session;

/**
 *
 * @author Dominik
 */
public class PocetniInsert {

    public static void izvedi() {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Pregled kardiologija = createPregled("Kardiologija", "Pregled srca", "Česta slabina i vrtoglavica",new Date());
        Pregled otorinolaringologija = createPregled("Otorinolaringologija", "Pregled uha,grla i nosa", "Upala grla,upala uha i slomljen nos",new Date());
        Pregled neurologija = createPregled("Neurologija", "Liječenje poremečaja živčanog sustava i mozga", "Česta vrtoglavica i slabina",new Date());
        Pregled traumatologija = createPregled("Traumatologija", "Hitni slučajevi i prijelomi", "Posjekotine,porezotine,prijelomi",new Date());
        
        session.beginTransaction();
        
        session.save(kardiologija);
        session.save(otorinolaringologija);
        session.save(neurologija);
        session.save(traumatologija);
        //session.getTransaction().commit();
        
        Usluga slusanjeSrca = createUsluga("Slušanje rada srca",new BigDecimal(249.00) , true);
        Usluga lomNoge = createUsluga("Stavaljanje noge u gips",new BigDecimal(49.00) , false);
        Usluga posjekotina = createUsluga("Dezinfekcija i šivanje rane", new BigDecimal(29.00), false);
        Usluga operacijaSrca = createUsluga("Operacija srca", new BigDecimal(2499.00), true);
        Usluga operacijaPluca = createUsluga("Operacija pluća", new BigDecimal(2199.00), true);
        Usluga opercijaKoljena = createUsluga("Operacija koljena", new BigDecimal(1999.00), true);
        
        session.save(slusanjeSrca);
        session.save(lomNoge);
        session.save(posjekotina);
        session.save(operacijaSrca);
        session.save(operacijaPluca);
        session.save(opercijaKoljena);
        
        Faker faker = new Faker();
        
        String[] oibi = {"44879378548", "38714462960", "48653367511",
            "07463739447", "55376858772", "57121746664", "45088797644", "97067197029",
            "36388448333", "13633152331"};
        
        Doktor doktor;
        Pacijent pacijent;
        Usluga usluga;
        
        for(int i=0;i<10;i++){
            doktor = new Doktor();
            doktor.setIme(faker.name().firstName());
            doktor.setPrezime(faker.name().lastName());
            doktor.setOib(oibi[i]);
            doktor.setEmail(doktor.getIme().toLowerCase()+"."+doktor.getPrezime().toLowerCase()+"@edunova.hr"); 
            session.save(doktor);
        }
        
        for(int i=0;i<10;i++){
            pacijent = new Pacijent();
            pacijent.setIme(faker.name().firstName());
            pacijent.setPrezime(faker.name().lastName());
            pacijent.setOib(oibi[i]);
            pacijent.setBroj(faker.number().randomNumber());
            session.save(pacijent);
        }
        
        session.getTransaction().commit();
    }
    
    private static Pregled createPregled(String naziv,String opis,String simptomi,Date datum){
       
        Pregled pregled = new Pregled();
        pregled.setNaziv(naziv);
        pregled.setOpis(opis);
        pregled.setSimptomi(simptomi);
        pregled.setDatum(new Date());
        
        return pregled;
    }
    
    private static Usluga createUsluga(String naziv,BigDecimal cijena,boolean zakazano){
        Usluga usluga = new Usluga();
        usluga.setNaziv(naziv);
        usluga.setCijena(cijena);
        usluga.setZakazano(zakazano);
        
        return usluga;
    }

//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        Pregled kardiologija = kreirajPregled("Kardiologija", "Otežani rad srca", "Česta slabina i vrtloglavica");
//        Pregled otorinolaringologija = kreirajPregled("Otorinolaringologija", "Slab sluh,sluzav nos i otežano gutanje", "otežano gutanje");
//        Pregled neurologija = kreirajPregled("Neurologija", "Poremećaji nervnog sistema", "Vrtoglavica i povraćanje");
//        Pregled traumatologija = kreirajPregled("Traumatologija", "Hitni prijem i liječenje svih nezgoda", "Lom desne podlaktice");
//
//        session.beginTransaction();
//        session.save(kardiologija);
//        session.save(otorinolaringologija);
//        session.save(neurologija);
//        session.save(traumatologija);
//        session.getTransaction().commit();
//
//        Faker faker = new Faker();
//
//        String[] oibi = {"44879378548", "38714462960", "48653367511",
//            "07463739447", "55376858772", "57121746664", "45088797644", "97067197029",
//            "36388448333", "13633152331"};
//
//        String[] telefoni = {"+38598576666", "0956855666", "6655555555555", "3859665255665",
//            "+3853343333433", "09145855555", "092555555555", "3859685655266", "955555566883", "3857968665555"
//        };
//
//        Doktor doktor;
//        Pacijent pacijent;
//        Usluga usluga;
//        
//        for(int i =0; i<10; i++){
//          doktor = new Doktor();
//          doktor.setIme(faker.name().firstName());
//          doktor.setPrezime(faker.name().lastName());
//          doktor.setEmail(doktor.getPrezime().toLowerCase()+doktor.getIme().toLowerCase()+"."+"@edunova.hr");
//          doktor.setOib(oibi[i]);
//        }
//        
//        for(int i=0; i<10; i++){
//            pacijent = new Pacijent();
//            pacijent.setIme(faker.name().firstName());
//            pacijent.setPrezime(faker.name().lastName());
//            pacijent.setEmail(pacijent.getPrezime().toLowerCase()+pacijent.getIme().toLowerCase()+"."+"@edunova.hr");
//            pacijent.setOib(oibi[i]);
//            pacijent.setBroj(telefoni[i]);
//        }
//        
//        for(int i=0; i<10; i++){
//            usluga = new Usluga();
//            usluga.setNaziv("Rutinski pregled");
//            usluga.setZakazano(Boolean.FALSE);
//            usluga.setCijena(BigDecimal.TEN);
//        }
//    
//        session.getTransaction().commit();
//    }
//
//    private static Pregled kreirajPregled(String naziv, String opis, String simptomi) {
//        Pregled pregled = new Pregled();
//        pregled.setNaziv(naziv);
//        pregled.setOpis(opis);
//        pregled.getSimptomi();
//        return pregled;
//    }
    
    
}
