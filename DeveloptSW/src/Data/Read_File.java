/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LCE3-ALUMNO 14
 */
public class Read_File {
    
    public static void main(String[] args) {
        
        String n="";
        double precio=0;
        int cantidad=0;
        
        File f = new File("DatosLect.txt");
        
        Scanner re = new Scanner(System.in);
        Scanner scan;
        try {
            
            scan = new Scanner(f);
            
            while(scan.hasNext()){
                    
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar informacion del producto");
        System.out.println("3. Salir");
        
        int opcion1 = re.nextInt();
            
            if (opcion1 == 1){
                System.out.println("Nombre");
                n = re.next();
                
                System.out.println("Precio");
                precio = re.nextDouble();
                
                System.out.println("Cantidad");
                cantidad = re.nextInt();
            }
            

        
        try {
            
            FileOutputStream fo = new FileOutputStream(f,true);
            PrintWriter pw = new PrintWriter (fo, true);

            if (opcion1 == 2){
                pw.println("Nombre");
                pw.println(n);
                
                pw.println("Precio");
                pw.println(precio);
                
                pw.println("Cantidad");
                pw.println(cantidad);
            }
            
            if (opcion1 == 3){
                pw.close();
            }
        
            
            
        }
        
        catch (FileNotFoundException ex) {
   
        Logger.getLogger(Act2.class.getName()).log(Level.SEVERE, null, ex);
            
            }    
            
        } 
            
            
        }
        
        catch (FileNotFoundException ex) {
            
            Logger.getLogger(Read_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
             
    }  
}
    
