/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcanvas;

import javax.swing.JFrame;

/**
 *
 * @author LCE3-ALUMNO 13
 */
public class AppCanvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CanvasPanel p = new CanvasPanel();
        
        f.add(p);
        
        f.pack();
        
        f.setVisible(true);
        
    }
    
}
