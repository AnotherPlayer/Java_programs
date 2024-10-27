/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcanvas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author LCE3-ALUMNO 13
 */
public class CanvasPanel extends JPanel{
    
    private JButton b;
    
    //JPanel = hoja en blanco
    
    public CanvasPanel(){
    
    this.setPreferredSize(new Dimension(500,500));
    
    this.setBackground(Color.white);
    
    b = new JButton();
    
}
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D gr = (Graphics2D)g;
        
        int y = 300, f = 0;
        
        gr.setColor(Color.blue);
        
        for(int i = 0; i < 5; i++){
            
            int x = 350;
            
            f++;           
            
            for(int j = 0; j < f; j++){
                
                Rectangle2D r = new Rectangle2D.Double(x,y,50,50);
        
                gr.draw(r);
                
                x -= 50;
                
            }
            
            y -= 50;
            
        }
        
        
    }
    
}
