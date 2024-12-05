/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.test.Tiendita;

import java.util.ArrayList;
/**
 *
 * @author renat
 */
public class Tiendita {
   
    private  ArrayList<USB>articulo=new ArrayList<>(); 
    
    
     public void agregar(String nom){
      
        articulo.add(new USB (nom)); 
    }
     
      public void mostrarInventario(){
        if(articulo.isEmpty()){
            System.out.println("no hay nada.");
        } else{
            for (USB aux:articulo) {
                System.out.println(aux);
            }
        }
    }

    public static void main(String[] args) {
        
        Tiendita tiendita = new Tiendita();

       
       
       tiendita.agregar("USB 16GB");
        tiendita.agregar("USB 32GB");
        tiendita.agregar("USB 64GB");

        tiendita.mostrarInventario();
    

        
        
    }
   

}
