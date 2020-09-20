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
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Dominik
 */
public class PocetniInsert {
    
     public static void izvedi(){
    
        Session session = new HibernateUtil().getSessionFactory().openSession();
        
        Pregled epidemiologija = kreirajPregled("Epidemiologija", "Proucava širenje i čimbenike bolesti u ljudskom stanovništvu", new BigDecimal(249.99), "Otežano disanje i kašljanje");
        Pregled kardiologija = kreirajPregled("Pregled glave", "Proučavanje poremećaja srca i dijelova krvožilnog sustava", new BigDecimal(129.99), "Udarac u glavu");
        Pregled traumatologjia = kreirajPregled("Pregled kostiju", "Bavi se liječenjem hitnih prijeloma i različitih nezgoda", new BigDecimal(179.99), "Lom kosti ili posjekotine");
        Pregled neurologija = kreirajPregled("Pregled nervnih sistema", "Bavi se poremećajima nervnog sistema", new BigDecimal(159.99), "Otežano probavljanje hrane");
        Pregled otorinolaringologija = kreirajPregled("Pregled grla,usiju i nosa", "Bavi se liječenjem bolesti uha,grla i nosa", new BigDecimal(199.99), "Problemi u funkcioniranju nosa,uha ili grla");
        Pregled patologija = kreirajPregled("Otkrivanje uzroka smrti", "Bavi se otkrivanjima uzroka smrti", new BigDecimal(89.99), "Smrt osobe");
        Pregled reumatologija = kreirajPregled("Pregled zbog reume", "Bavi se liječenjem i proučavanjem reumatskih bolesti", new BigDecimal(259.99), "Problemi sa reumom");
        Pregled pedijatrija = kreirajPregled("Pregled maloljetnih osoba", "Bavi se liječenjem djece", new BigDecimal(259.99), "Bolesti kod djece");
        
        
        session.beginTransaction();
        
        session.save(epidemiologija);
        session.save(kardiologija);
        session.save(traumatologjia);
        session.save(neurologija);
        session.save(otorinolaringologija);
        session.save(patologija);
        session.save(reumatologija);
        session.save(pedijatrija);
        
        
        Faker faker = new Faker();
        
        String[] oibi = {"24829237381","23463457322","35533256468","84930385940","57492046676","43047386783",
        "96748837106","62562468421","46347854321","46743586430"};
       
        Doktor d, predavacJava=null, predavacPhp=null;
        
        for(int i=0;i<10;i++){
            d=new Doktor();
            d.setIme(faker.name().firstName());
            d.setPrezime(faker.name().lastName());
            d.setEmail(d.getIme().toLowerCase()+"."+d.getPrezime().toLowerCase()+"@edunova.hr");
            session.save(d);
            if(i==0){
                predavacJava=d;
            }
            if(i==1){
                predavacPhp=d;
            }
        }
        
        Pacijent pacijent;
        List<Pacijent> pacijentEpidemiologija = new ArrayList<>();
        List<Pacijent> pacijentKardiologija = new ArrayList<>();
        List<Pacijent> pacijentTraumatologija = new ArrayList<>();
        List<Pacijent> pacijentNeurologija = new ArrayList<>();
        List<Pacijent> pacijentOtorinolaringologija = new ArrayList<>();
        List<Pacijent> pacijentPatologija = new ArrayList<>();
        List<Pacijent> pacijentReumatologija = new ArrayList<>();
        List<Pacijent> pacijentPedijatrija = new ArrayList<>();
        for(int i=0;i<100;i++){
            
            pacijent=new Pacijent();
            pacijent.setIme(faker.name().firstName());
            pacijent.setPrezime(faker.name().lastName());
            pacijent.setGrad(faker.country().name().toLowerCase());
            if(i>9){
             pacijent.setOib(null);
            }
            else{
              pacijent.setOib(oibi[i]);
            }
            
            
            pacijent.setEmail(pacijent.getIme().toLowerCase()+"."+pacijent.getPrezime().toLowerCase()+"@edunova.hr");
            session.save(pacijent);
            
            if(i<20){
                pacijentEpidemiologija.add(pacijent);
            }
            if(i>20 && i<40){
                pacijentKardiologija.add(pacijent);
            }
        }
        
        session.getTransaction().commit();
        
        session.beginTransaction();
        
        
        Usluga epidemiologija1 = new Usluga();
        epidemiologija1.setNaziv("Epidemiologija");
        epidemiologija1.setCijena(BigDecimal.TEN);
        //epidemiologija1.setSmjer(java);
        //epidemiologija1.setDoktor(predavacJava);
        //epidemiologija1.setPolaznici(polazniciJava);
        session.save(epidemiologija1);
        
        Usluga kardiologija1 = new Usluga();
        kardiologija1.setNaziv("Kardiologija");
        kardiologija1.setCijena(BigDecimal.TEN);
        //kardiologija1.setDatumPocetka(new Date());
        //kardiologija1.setD(php);
        //kardiologija1.setPredavac(predavacPhp);
        //kardiologija1.setPolaznici(polazniciPHP);
        session.save(kardiologija1);
        
        Usluga traumatologija1 = new Usluga();
        traumatologija1.setNaziv("Traumatologija");
        traumatologija1.setCijena(BigDecimal.TEN);
        session.save(traumatologija1);
        
        Usluga neurologija1 = new Usluga();
        neurologija1.setNaziv("Neurologija");
        neurologija1.setCijena(BigDecimal.TEN);
        session.save(neurologija1);
        
        Usluga otorinolaringologija1 = new Usluga();
        otorinolaringologija1.setNaziv("Otorinolaringologija");
        otorinolaringologija1.setCijena(BigDecimal.TEN);
        session.save(otorinolaringologija1);
        
        Usluga patologija1 = new Usluga();
        patologija1.setNaziv("Patologija");
        patologija1.setCijena(BigDecimal.TEN);
        session.save(patologija1);
        
        Usluga reumatologija1 = new Usluga();
        reumatologija1.setNaziv("Reumatologija");
        reumatologija1.setCijena(BigDecimal.TEN);
        session.save(reumatologija1);
        
        Usluga pedijatrija1 = new Usluga();
        pedijatrija1.setNaziv("Pedijatrija");
        pedijatrija1.setCijena(BigDecimal.TEN);
        session.save(pedijatrija1);
        
        session.getTransaction().commit();
        
    }
    
    private static Pregled kreirajPregled(String naziv,String opis,BigDecimal cijena,String razlog){
    
        Pregled pregled = new Pregled();
        pregled.setNaziv(naziv);
        pregled.setOpis(opis);
        pregled.setCijena(cijena);
        pregled.setRazlog(razlog);
        
        return pregled;
    }
    
}