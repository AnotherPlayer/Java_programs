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
public class Act2 {
    public static void main(String[] args) {
        
        double cal;
        boolean con = true;
        
        File f1 = new File("Pasas.txt");
        File f2 = new File("nopaso.txt");
        
        if (!f1.exists())
            System.out.println("No existe");
        
        if (!f2.exists())
            System.out.println("No existe");
        
        while(con){
        
        Scanner re = new Scanner(System.in);
        System.out.println("Digita tu calificacion");        
        cal = re.nextDouble();
        
        if (cal >= 6){
            
            try {
            FileOutputStream fo = new FileOutputStream(f1,true);
            
            PrintWriter pw = new PrintWriter (fo, true);
            
            pw.println("Tus calificaciones son: ");
            pw.println("calificacion:"+cal);
            pw.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Act2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
        if (cal <= 5.9){
            
            try {
            FileOutputStream fo = new FileOutputStream(f2,true);
            
            PrintWriter pw = new PrintWriter (fo, true);
            
            pw.println("Tus calificaciones son: ");
            pw.println("calificacion:"+cal);
            pw.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Act2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
            System.out.println("agregar [1/0]");
            
            if(re.nextDouble() == 0)
                con = false;
        
        } 
        
    }
    
}
