/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package developtsw;

import javax.swing.JFrame;

/**
 *
 * @author LCE3-ALUMNO 14
 * 
 */

public class AnimacionMain_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CanvasAnimacion_02 p = new CanvasAnimacion_02();
        f.add(p);
        f.pack();
        f.setVisible(true);
        
    }
    
}
