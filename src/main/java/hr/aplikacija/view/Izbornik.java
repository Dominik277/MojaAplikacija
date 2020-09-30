/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.view;

import java.awt.BorderLayout;
import org.hibernate.annotations.Parent;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

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
        jmNaslovGrana.setText(Aplikacija.NASOV_APP);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APP");

        javax.swing.GroupLayout pnlGrafLayout = new javax.swing.GroupLayout(pnlGraf);
        pnlGraf.setLayout(pnlGrafLayout);
        pnlGrafLayout.setHorizontalGroup(
            pnlGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlGrafLayout.setVerticalGroup(
            pnlGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        jmNaslovGrana.setText("NASLOV");

        jmiDoktori.setText("Doktori");
        jmNaslovGrana.add(jmiDoktori);

        jmiPacijenti.setText("Pacijenti");
        jmNaslovGrana.add(jmiPacijenti);

        jmiPregledi.setText("Pregledi");
        jmiPregledi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPreglediActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiPregledi);

        jmiUsluge.setText("Usluge");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmIzlaz;
    private javax.swing.JMenu jmNaslovGrana;
    private javax.swing.JMenuItem jmiDoktori;
    private javax.swing.JMenuItem jmiOperateri;
    private javax.swing.JMenuItem jmiPacijenti;
    private javax.swing.JMenuItem jmiPregledi;
    private javax.swing.JMenuItem jmiUsluge;
    private javax.swing.JPanel pnlGraf;
    // End of variables declaration//GEN-END:variables

    private void pripremiGraf() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("JP22", 25);
        dataset.setValue("PP21", 10);
        dataset.setValue("OP16", 5);
        dataset.setValue("WD40", 50);

        JFreeChart chart = ChartFactory.createPieChart(
                "Broj polaznika po grupama", // chart title 
                dataset, // data    
                true, // include legend   
                true,
                false);

        ChartPanel cp = new ChartPanel(chart);

        pnlGraf.setLayout(new BorderLayout());
        pnlGraf.add(cp, BorderLayout.CENTER);
        pnlGraf.validate();
    }

}
