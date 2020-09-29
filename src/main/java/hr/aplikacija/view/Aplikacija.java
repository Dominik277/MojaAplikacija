/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.view;

import hr.aplikacija.model.Operater;

/**
 *
 * @author Dominik
 */
public class Aplikacija {
    
    public static final String NASOV_APP="Edunova APP";
    
    public static Operater operater;
    
    public static boolean isAdmin(){
        if(operater==null || operater.getUloga()==null){
            return false;
        }
        return operater.getUloga().equals("admin");
    }
}
