/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.view;

import hr.aplikacija.controller.ObradaPregled;
import hr.aplikacija.model.Pregled;
import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Dominik
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        //Poziv ove metode se ne smije obrisati
        initComponents();
        jmNaslovGrana.setText(Aplikacija.NAZIV_APLIKACIJE);

        //Naš kod pišemo nakon initComponents();
        setTitle(Aplikacija.operater.getImePrezime());

        //if(!Aplikacija.operater.getUloga().equals("admin")){
        //    jmiOperateri.setVisible(false);
        //}
        // if(Aplikacija.isAdmin()){
        //     jmiOperateri.setVisible(false);
        // }
        jmiOperateri.setVisible(Aplikacija.isAdmin());

        pripremiGraf();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGraf = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmNaslovGrana = new javax.swing.JMenu();
        jmiDoktori = new javax.swing.JMenuItem();
        jmiPacijenti = new javax.swing.JMenuItem();
        jmiPregledi = new javax.swing.JMenuItem();
        jmiUsluge = new javax.swing.JMenuItem();
        jmiOperateri = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmIzlaz = new javax.swing.JMenuItem();
        jmONama = new javax.swing.JMenu();
        jmiOsoblje = new javax.swing.JMenuItem();
        jmiKontakt = new javax.swing.JMenuItem();
        jmiOPoliklinici = new javax.swing.JMenuItem();
        jmNovosti = new javax.swing.JMenu();
        jmiCovid = new javax.swing.JMenuItem();
        jmiBuducnost = new javax.swing.JMenuItem();
        jmiNacinPlacanja = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiNarudžbaPregleda = new javax.swing.JMenuItem();
        jmiOtkazPregleda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APP");

        javax.swing.GroupLayout pnlGrafLayout = new javax.swing.GroupLayout(pnlGraf);
        pnlGraf.setLayout(pnlGrafLayout);
        pnlGrafLayout.setHorizontalGroup(
            pnlGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        pnlGrafLayout.setVerticalGroup(
            pnlGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jmNaslovGrana.setText("NASLOV");

        jmiDoktori.setText("Doktori");
        jmiDoktori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDoktoriActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiDoktori);

        jmiPacijenti.setText("Pacijenti");
        jmiPacijenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPacijentiActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiPacijenti);

        jmiPregledi.setText("Pregledi");
        jmiPregledi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPreglediActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiPregledi);

        jmiUsluge.setText("Usluge");
        jmiUsluge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUslugeActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiUsluge);

        jmiOperateri.setText("Operateri");
        jmNaslovGrana.add(jmiOperateri);
        jmNaslovGrana.add(jSeparator1);

        jmIzlaz.setText("Izlaz");
        jmIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIzlazActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmIzlaz);

        jMenuBar1.add(jmNaslovGrana);

        jmONama.setText("O NAMA");

        jmiOsoblje.setText("Osoblje");
        jmiOsoblje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOsobljeActionPerformed(evt);
            }
        });
        jmONama.add(jmiOsoblje);

        jmiKontakt.setText("Kontakt");
        jmiKontakt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiKontaktActionPerformed(evt);
            }
        });
        jmONama.add(jmiKontakt);

        jmiOPoliklinici.setText("O Poliklinici");
        jmiOPoliklinici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOPolikliniciActionPerformed(evt);
            }
        });
        jmONama.add(jmiOPoliklinici);

        jMenuBar1.add(jmONama);

        jmNovosti.setText("NOVOSTI");

        jmiCovid.setText("AI vs COVID-19");
        jmiCovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCovidActionPerformed(evt);
            }
        });
        jmNovosti.add(jmiCovid);

        jmiBuducnost.setText("Budućnost");
        jmiBuducnost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuducnostActionPerformed(evt);
            }
        });
        jmNovosti.add(jmiBuducnost);

        jMenuBar1.add(jmNovosti);

        jmiNacinPlacanja.setText("ČESTA PITANJA");

        jMenuItem1.setText("Način plaćanja");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmiNacinPlacanja.add(jMenuItem1);

        jmiNarudžbaPregleda.setText("Narudžba pregleda");
        jmiNarudžbaPregleda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNarudžbaPregledaActionPerformed(evt);
            }
        });
        jmiNacinPlacanja.add(jmiNarudžbaPregleda);

        jmiOtkazPregleda.setText("Otkaz pregleda");
        jmiOtkazPregleda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOtkazPregledaActionPerformed(evt);
            }
        });
        jmiNacinPlacanja.add(jmiOtkazPregleda);

        jMenuBar1.add(jmiNacinPlacanja);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGraf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGraf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIzlazActionPerformed
        dispose();
    }//GEN-LAST:event_jmIzlazActionPerformed

    private void jmiPreglediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPreglediActionPerformed
        new Pregledi().setVisible(true);
    }//GEN-LAST:event_jmiPreglediActionPerformed

    private void jmiDoktoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDoktoriActionPerformed
        new Doktori().setVisible(true);
    }//GEN-LAST:event_jmiDoktoriActionPerformed

    private void jmiPacijentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPacijentiActionPerformed
        new Pacijenti().setVisible(true);
    }//GEN-LAST:event_jmiPacijentiActionPerformed

    private void jmiUslugeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUslugeActionPerformed
        new Usluge().setVisible(true);
    }//GEN-LAST:event_jmiUslugeActionPerformed

    private void jmiKontaktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiKontaktActionPerformed
        new Kontakt().setVisible(true);
    }//GEN-LAST:event_jmiKontaktActionPerformed

    private void jmiOsobljeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOsobljeActionPerformed
        new Osoblje().setVisible(true);
    }//GEN-LAST:event_jmiOsobljeActionPerformed

    private void jmiOPolikliniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOPolikliniciActionPerformed
        new OPoliklinici().setVisible(true);
    }//GEN-LAST:event_jmiOPolikliniciActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new NacinPlacanja().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiNarudžbaPregledaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNarudžbaPregledaActionPerformed
        new NarudžbaPregleda().setVisible(true);
    }//GEN-LAST:event_jmiNarudžbaPregledaActionPerformed

    private void jmiOtkazPregledaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOtkazPregledaActionPerformed
        new OtkazPregleda().setVisible(true);
    }//GEN-LAST:event_jmiOtkazPregledaActionPerformed

    private void jmiCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCovidActionPerformed
        new Covid19().setVisible(true);
    }//GEN-LAST:event_jmiCovidActionPerformed

    private void jmiBuducnostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuducnostActionPerformed
        new Buducnost().setVisible(true);
    }//GEN-LAST:event_jmiBuducnostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmIzlaz;
    private javax.swing.JMenu jmNaslovGrana;
    private javax.swing.JMenu jmNovosti;
    private javax.swing.JMenu jmONama;
    private javax.swing.JMenuItem jmiBuducnost;
    private javax.swing.JMenuItem jmiCovid;
    private javax.swing.JMenuItem jmiDoktori;
    private javax.swing.JMenuItem jmiKontakt;
    private javax.swing.JMenu jmiNacinPlacanja;
    private javax.swing.JMenuItem jmiNarudžbaPregleda;
    private javax.swing.JMenuItem jmiOPoliklinici;
    private javax.swing.JMenuItem jmiOperateri;
    private javax.swing.JMenuItem jmiOsoblje;
    private javax.swing.JMenuItem jmiOtkazPregleda;
    private javax.swing.JMenuItem jmiPacijenti;
    private javax.swing.JMenuItem jmiPregledi;
    private javax.swing.JMenuItem jmiUsluge;
    private javax.swing.JPanel pnlGraf;
    // End of variables declaration//GEN-END:variables

    private void pripremiGraf() {
        
        ObradaPregled op = new ObradaPregled();
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        for(Pregled p: op.getPodaci()){
            dataset.setValue(p.getNaziv(), p.getUslugaPregledi().size());
        }
        
        JFreeChart chart = ChartFactory.createPieChart(
                "Broj usluga na pregledu",
                dataset,
                true,
                true,
                false);
        
        ChartPanel cp = new ChartPanel(chart);
        
        pnlGraf.setLayout(new BorderLayout());
        pnlGraf.add(cp, BorderLayout.CENTER);
        pnlGraf.validate();
        
//        DefaultPieDataset dataset = new DefaultPieDataset();
//        dataset.setValue("JP22", 25);
//        dataset.setValue("PP21", 10);
//        dataset.setValue("OP16", 5);
//        dataset.setValue("WD40", 50);
          

//        JFreeChart chart = ChartFactory.createPieChart(
//                "Broj polaznika po grupama", // chart title 
//                dataset, // data    
//                true, // include legend   
//                true,
//                false);

//        ChartPanel cp = new ChartPanel(chart);

        pnlGraf.setLayout(new BorderLayout());
        pnlGraf.add(cp, BorderLayout.CENTER);
        pnlGraf.validate();
    }
    
//    private void Kalendar(){
//        pnlKalendar.setLayout(new BorderLayout());
//        JCalendar cal = new JCalendar();
//        pnlKalendar.setLayout(new BorderLayout());
//        pnlKalendar.add(cal,BorderLayout.CENTER);
//        pnl.Kalendar.validate();
//    }

}
