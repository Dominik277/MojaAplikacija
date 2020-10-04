/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import hr.aplikacija.controller.ObradaDoktor;
import hr.aplikacija.controller.ObradaPacijent;
import hr.aplikacija.controller.ObradaPregled;
import hr.aplikacija.model.Doktor;
import hr.aplikacija.model.Pacijent;
import hr.aplikacija.model.Pregled;
import hr.aplikacija.utility.MyException;
import java.awt.event.KeyEvent;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Dominik
 */
public class Pregledi extends javax.swing.JFrame {

    private ObradaPregled obrada;
    private ObradaPacijent obradaPacijent;
    private Pregled entitet;

    /**
     * Creates new form Pregledi
     */
    public Pregledi() {
        initComponents();
        obrada = new ObradaPregled();
        obradaPacijent=new ObradaPacijent();
        setTitle(Aplikacija.operater.getImePrezime() + " - Pregledi");
        ucitajPodatke();

        DefaultComboBoxModel<Doktor> md = new DefaultComboBoxModel<>();
        new ObradaDoktor().getPodaci().forEach(s -> {
            md.addElement(s);
        });
        cmbDoktori.setRenderer(new OsobaCellRenderer());
        cmbDoktori.setModel(md);

        DefaultComboBoxModel<Pacijent> mp = new DefaultComboBoxModel<>();
        new ObradaPacijent().getPodaci().forEach(p -> {
            mp.addElement(p);
        });
        cmbPacijenti.setRenderer(new OsobaCellRenderer());
        cmbPacijenti.setModel(mp);

        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");
        dpiDatum.setSettings(dps);
        
        lstPacijentiNaPregledu.setCellRenderer(new OsobaCellRenderer());
        lstPacijentiUBazi.setCellRenderer(new OsobaCellRenderer());
        DefaultListModel<Pregled> m = new DefaultListModel<>();
        lstPacijentiNaPregledu.setModel(mp);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtOpis = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSimptomi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbDoktori = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbPacijenti = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        dpiDatum = new com.github.lgooddatepicker.components.DatePicker();
        lblPoruka = new javax.swing.JLabel();
        btnObrisi = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPacijentiNaPregledu = new javax.swing.JList<>();
        btnTrazi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPacijentiUBazi = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDodajPacijenteUPregled = new javax.swing.JButton();
        btnMakniPacijenteIzPregleda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Podaci"));

        jLabel1.setText("Naziv");

        jLabel2.setText("Opis");

        jLabel3.setText("Simptomi");

        jLabel4.setText("Doktor");

        jLabel5.setText("Pacijent");

        jLabel6.setText("Datum");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNaziv)
                    .addComponent(txtOpis)
                    .addComponent(txtSimptomi)
                    .addComponent(cmbDoktori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPacijenti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dpiDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOpis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSimptomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDoktori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPacijenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dpiDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pacijenti"));

        lstPacijentiNaPregledu.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPacijentiNaPregleduValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstPacijentiNaPregledu);

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });
        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUvjetKeyReleased(evt);
            }
        });

        lstPacijentiUBazi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPacijentiUBaziValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstPacijentiUBazi);

        jLabel7.setText("Traži u bazi podataka");

        jLabel8.setText("Pacijenti na pregledu");

        btnDodajPacijenteUPregled.setText(">>");
        btnDodajPacijenteUPregled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajPacijenteUPregledActionPerformed(evt);
            }
        });

        btnMakniPacijenteIzPregleda.setText("<<");
        btnMakniPacijenteIzPregleda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakniPacijenteIzPregledaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDodajPacijenteUPregled)
                            .addComponent(btnMakniPacijenteIzPregleda)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTrazi))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrazi))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnDodajPacijenteUPregled)
                                .addGap(72, 72, 72)
                                .addComponent(btnMakniPacijenteIzPregleda)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        lblPoruka.setText("");
        entitet = new Pregled();

        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitajPodatke();
        } catch (MyException ex) {
            lblPoruka.setText(ex.getPoruka());
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }
        postaviVrijednostiUEntitet();
        try {
            obrada.update();
            ucitajPodatke();
        } catch (MyException e) {
            lblPoruka.setText(e.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }
        obrada.setEntitet(entitet);
        try {
            obrada.delete();
            ucitajPodatke();
        } catch (MyException e) {
            lblPoruka.setText(e.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }

        txtNaziv.setText(entitet.getNaziv());
        //cmbPacijenti.setSelectedItem(entitet.getPacijent());

        DefaultComboBoxModel<Pacijent> mu = (DefaultComboBoxModel<Pacijent>) cmbPacijenti.getModel();
        for (int i = 0; i < mu.getSize(); i++) {
            if (mu.getElementAt(i).getId().equals(entitet.getPacijent().getId())) {
                cmbPacijenti.setSelectedIndex(i);
                break;
            }
        }
        
        
        DefaultComboBoxModel<Doktor> md = (DefaultComboBoxModel<Doktor>) cmbDoktori.getModel();
        for (int i = 0; i < md.getSize(); i++) {
            if (md.getElementAt(i).getId().equals(entitet.getDoktor().getId())) {
                cmbDoktori.setSelectedIndex(i);
                break;
            }
        }
        if(entitet.getDatum()!=null){
            dpiDatum.setDate(entitet.getDatum().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
        
        DefaultListModel<Pacijent> m = new DefaultListModel<>();
//        for(Pacijent p : entitet.getPacijent()){
//            m.addElement(p);
//        }
        lstPacijentiNaPregledu.setModel(m);
    }//GEN-LAST:event_lstPodaciValueChanged

    private void lstPacijentiNaPregleduValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPacijentiNaPregleduValueChanged
        

        //DefaultComboBoxModel<Pregled> mp = (DefaultComboBoxModel<Pregled>)
    }//GEN-LAST:event_lstPacijentiNaPregleduValueChanged

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajPacijente();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtUvjetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ucitajPacijente();
        }
    }//GEN-LAST:event_txtUvjetKeyReleased

    private void lstPacijentiUBaziValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPacijentiUBaziValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lstPacijentiUBaziValueChanged

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void btnDodajPacijenteUPregledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajPacijenteUPregledActionPerformed
        
        DefaultListModel<Pacijent> m;
        try {
            m=(DefaultListModel<Pacijent>) lstPacijentiNaPregledu.getModel();
            m.get(0).toString();
        } catch (Exception e) {
            m=new DefaultListModel<>();
            lstPacijentiNaPregledu.setModel(m);
        }
        boolean postoji;
        for(Pacijent p : lstPacijentiUBazi.getSelectedValuesList()){
            postoji=false;
            for(int i=0;i<m.size();i++){
                if(p.getId().equals(m.get(i).getId())){
                    postoji=true;
                    break;
                }
            }
            if(!postoji){
                m.addElement(p);
            }
            
        }
        lstPacijentiNaPregledu.repaint();
    }//GEN-LAST:event_btnDodajPacijenteUPregledActionPerformed

    private void btnMakniPacijenteIzPregledaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakniPacijenteIzPregledaActionPerformed
        DefaultListModel<Pacijent> m;
        try {
            m=(DefaultListModel<Pacijent>) lstPacijentiNaPregledu.getModel();
        } catch (Exception e) {
           return;
        }
        
        for(Pacijent p : lstPacijentiNaPregledu.getSelectedValuesList()){
            for(int i=0;i<m.size();i++){
                if(p.getId().equals(m.getElementAt(i).getId())){
                    m.removeElementAt(i);
                    break;
                }
            }
        }
        lstPacijentiNaPregledu.repaint();
    }//GEN-LAST:event_btnMakniPacijenteIzPregledaActionPerformed

    private void ucitajPodatke() {
        DefaultListModel<Pregled> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(s -> m.addElement(s));
        lstPodaci.setModel(m);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajPacijenteUPregled;
    private javax.swing.JButton btnMakniPacijenteIzPregleda;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Doktor> cmbDoktori;
    private javax.swing.JComboBox<Pacijent> cmbPacijenti;
    private com.github.lgooddatepicker.components.DatePicker dpiDatum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JList<Pacijent> lstPacijentiNaPregledu;
    private javax.swing.JList<Pacijent> lstPacijentiUBazi;
    private javax.swing.JList<Pregled> lstPodaci;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtOpis;
    private javax.swing.JTextField txtSimptomi;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void postaviVrijednostiUEntitet() {
        entitet.setNaziv(txtNaziv.getText());
        entitet.setOpis(txtOpis.getText());
        entitet.setSimptomi(txtSimptomi.getText());
        entitet.setDoktor((Doktor) cmbDoktori.getSelectedItem());
        entitet.setPacijent((Pacijent) cmbPacijenti.getSelectedItem());
        if(dpiDatum.getDate()!= null){
            entitet.setDatum(Date.from(dpiDatum.getDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        }
        
//        entitet.setPacijent(new ArrayList<>());
        DefaultListModel<Pacijent> m = (DefaultListModel<Pacijent>) lstPacijentiNaPregledu.getModel();
//        for(int i=0;i<m.size();i++){
//            entitet.getPacijent().add(m.getElementAt(i));
//        }
        obrada.setEntitet(entitet);
    }

    private void ucitajPacijente() {
        DefaultListModel<Pacijent> mp = new DefaultListModel<>();
        obradaPacijent.getPodaci(txtUvjet.getText()).forEach(s->mp.addElement(s));
        
        lstPacijentiUBazi.setModel(mp);
    }

}
