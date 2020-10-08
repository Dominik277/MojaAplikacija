/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.utility;

/**
 *
 * @author Dominik
 */
public class MyException extends Exception{
    
    private String poruka;
    private String komponenta;

    public MyException(String poruka) {
        this.poruka=poruka;
        this.komponenta="";
    }

    public String getKomponenta() {
        return komponenta;
    }

    public void setKomponenta(String komponenta) {
        this.komponenta = komponenta;
    }
    
    public MyException(String komponenta,String poruka) {
        this(poruka);
        this.komponenta=komponenta;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }
    
}
