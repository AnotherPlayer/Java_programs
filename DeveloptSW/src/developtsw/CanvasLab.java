/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developtsw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author LCE3-ALUMNO 14
 */
@SuppressWarnings("unused")
public class CanvasLab extends JPanel{
    
    private Timer t;//Crear variable timer
    
    private double x,y,w,h,r;
    
    private boolean der,arr,aba;
    
    public CanvasLab() {
        
        x=50;
        y=200;
        r=20;

        der = true;
        aba = false;
        arr = false;
        
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.white);
      
        this.setLayout(null);
        
        t = new Timer(60,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(der){
                    
                    x+=5;
                    
                    if(x == 200){
                    
                        der = false;
                        arr = true;
                
                    }
                    
                    if(x == 300){
                        
                        der = false;
                        aba = true;
                        
                    }
                    
                    if(x == 460){
                        
                        t.stop();
                        
                    }
                }
                
                if(arr){
                    
                    y-=5;
                    
                    if(y == 100){
                        
                        arr = false;
                        der = true;
                           
                    }
                    
                }
                
                if(aba){
                    
                    y+=5;
                    
                    if(y == 400){
                        
                        aba = false;
                        der = true;
                        
                    }
                    
                }
                
                    
                
                repaint();
                
            }
        });
        
        
        t.start();
        
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g1 = (Graphics2D)g;
        
        Ellipse2D eli = new Ellipse2D.Double(x,y,40,40);
        g1.fill(eli);
        
        
        Line2D linH1 = new Line2D.Double(0, 200, 200, 200);
        g1.draw(linH1);
        
        Line2D linH2 = new Line2D.Double(0, 240, 240, 240);
        g1.draw(linH2);
        
        Line2D linH3 = new Line2D.Double(200, 100, 340, 100);
        g1.draw(linH3);
        
        Line2D linH4 = new Line2D.Double(240, 140, 300, 140);
        g1.draw(linH4);
        
        Line2D linH5 = new Line2D.Double(340, 400, 500, 400);
        g1.draw(linH5);
        
        Line2D linH6 = new Line2D.Double(300, 440, 500, 440);
        g1.draw(linH6);
        
        
        
        Line2D linV1 = new Line2D.Double(240,240,240,140);
        g1.draw(linV1);
        
        Line2D linV2 = new Line2D.Double(200,200,200,100);
        g1.draw(linV2);
        
        Line2D linV3 = new Line2D.Double(340,100,340,400);
        g1.draw(linV3);
        
        Line2D linV4 = new Line2D.Double(300,140,300,440);
        g1.draw(linV4);
        
        Line2D linV5 = new Line2D.Double(500,400,500,440);
        g1.draw(linV5);
    }
    
}
