/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo_de_software;

/**
 *
 * @author HDavi
 */
public class Circule {
    
    public static void main(String[] args) {
        
        float[] num = new float[5];
        
        Circulo[] c = new Circulo[5];
        
        for(int i = 0; i < c.length; i++){
            
            c[i] = new Circulo(i+1);
            
            num[i] = c[i].Area();
            
            System.out.println("Area del circulo con radio "+(i+1)+" : "+num[i]);
            
        }
        
        
                
    }
    
}
