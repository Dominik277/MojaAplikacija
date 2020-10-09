/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.test;

import java.io.File;

/**
 *
 * @author Dominik
 */
public class Test {
    
    public static void main(String[] args) {
        
        File jarDir = new File(ClassLoader.getSystemClassLoader().getResource(".").getPath()
                            + File.separator + "hibernate.cfg.xml");
        
        System.out.println(jarDir);
        
    }
    
}
