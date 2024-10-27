/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package developtsw;

import javax.swing.JFrame;

/**
 *
 * @author LCE3-ALUMNO 15
 */
public class AnimacionCanva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AnimacionPanel p = new AnimacionPanel();
        f.add(p);
        f.pack();
        f.setVisible(true);
        
    }
    
}
