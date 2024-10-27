/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo_de_software;

/**
 *
 * @author HDavi
 */
public class Circulo {
    
    private float r;

    public Circulo(float r) {
        
        this.r = r;
        
    }

    public void setR(float r) {
        this.r = r;
        
    }
    
    public float Area(){
        
        return (float) (Math.PI * Math.pow(r, 2));  
        
    }
    
}
