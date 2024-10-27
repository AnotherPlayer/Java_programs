/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developtsw;

import javax.swing.JFrame;

/**
 *
 * @author HDavi
 */
public class AppGrafica {
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GraficaPanel graf = new GraficaPanel();
        
        f.add(graf);
        f.pack();
        f.setVisible(true);
        
    }
    
}
