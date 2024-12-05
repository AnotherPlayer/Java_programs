/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.Tiendita;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renat
 */
public class USB {
    private static int c=0; 
    private int numArt;
    public String nom; 
    public USB(String nom){
        this.nom=nom; 
        c++; 
        this.numArt=c; 
      
    }
    
    public String toString(){
        return "USB "+this.nom +",Numero: "+this.numArt; 
    }
  
    
}
