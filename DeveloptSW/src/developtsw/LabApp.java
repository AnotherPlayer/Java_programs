/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developtsw;

import javax.swing.JFrame;

/**
 *
 * @author LCE3-ALUMNO 14
 */
public class LabApp {
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CanvasLab p = new CanvasLab();
        f.add(p);
        
        f.pack();
        f.setVisible(true);
        
    }
    
}
