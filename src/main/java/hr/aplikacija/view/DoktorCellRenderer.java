/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.view;

import hr.aplikacija.model.Doktor;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Dominik
 */
public class DoktorCellRenderer extends JLabel implements ListCellRenderer<Doktor>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Doktor> list, Doktor value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getIme() + " " + value.getPrezime());
        if(isSelected){
            setBackground(Color.BLUE);
            setForeground(Color.WHITE);
        }else{
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        return this;
    }
    
}
