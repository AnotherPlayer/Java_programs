/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

@SuppressWarnings("unused")

/**
 *
 * @author LCE3-ALUMNO 14
 */
public class Act1 {
    
    public static void main(String[] args) {
        int cal1 , cal2 =8, cal3 =9;
        File f = new File("promedios.txt");
        
        if (!f.exists())
            System.out.println("No existe");
        
        try {
            FileOutputStream fo = new FileOutputStream(f,false);
                
                PrintWriter pw = new PrintWriter (fo, true);
                
                Scanner re = new Scanner(System.in);
                
                cal1 = re.nextInt();
                
                pw.println("Escribe tus calificaciones\n");
                
                pw.println("Parcial 1: "+cal1+ "\tParcial 2: "+cal2+"\tParcial 3: "+cal3);
                
                pw.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Act1.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
}
