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
public class Prueba1 {
    
    public static void main(String[] args) {
        
        String n="", b ="";
        double precio=0;
        int cantidad=0;
        int opcion1=0;
        
        Scanner scan;
        
        File f = new File("DatosLec.txt");
        
        Scanner re = new Scanner(System.in);
        
        
        
        FileOutputStream fo;
        try {
            fo = new FileOutputStream(f,false);
            PrintWriter pw = new PrintWriter (fo, true);
            pw.println("\n");
            
            scan = new Scanner(f);
            
            
            
            while(opcion1 != 3){
                
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar informacion del producto");
            System.out.println("3. Salir");
        
            opcion1 = re.nextInt();
                
            if (opcion1 == 1){
                System.out.println("Nombre");
                n = re.next();
                pw.println(n);
                
                System.out.println("Precio");
                precio = re.nextDouble();
                pw.println(precio);
                
                System.out.println("Cantidad");
                cantidad = re.nextInt();
                pw.println(cantidad);
            }
            
            if (opcion1 == 2){
                
                System.out.println("Que producto busca: ");
                
                b = re.next();
                
                pw.println("test");
                
                while(scan.hasNext()){
                    
                    if(b.equals(scan.next())){
                        
                        System.out.println("Nombre : "+b);
                        System.out.println("Precio : "+scan.nextDouble());
                        System.out.println("Cantidad : "+scan.nextInt());
                        pw.println("Nombre : "+scan.nextLine());
                        pw.println("Nombre : "+scan.nextLine());
                        pw.println("Nombre : "+scan.nextLine());
                    }
                    
                }
                
            }
            
            if (opcion1 == 3){
                
                scan.close();
                
            }
            
            
            
            
        }
        
        }
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Prueba1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        }
            
   
        
              }
           

