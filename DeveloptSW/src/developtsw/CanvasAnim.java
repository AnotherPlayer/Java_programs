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
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author LCE3-ALUMNO 14
 */
public class CanvasAnim extends JPanel{

    private JButton b;
    private JTextField tf;
    
    private Timer t;//Crear variable timer
    
    private double x,y,dx,w,h;
    private double camb1, camb2,consta;
    
    @SuppressWarnings("unused")
    private boolean der, izq;
    
    public CanvasAnim() {
        
        x=10;
        y=100;
        
        dx=5;
        camb1 = 50;
        camb2 = 100;
        consta = 100; 
        
        w=50;
        h=50;
        
        der = true;
        
        tf = new JTextField();
        b = new JButton("Animacion");
        
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.white);
      
        this.setLayout(null);
        
        //Iniciarlizar t (milisegundos,new ActionListener(){}
        t = new Timer(75,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                x = x + dx;//x = 450 +(-5) == 450 - 5 ==445

                    if(x <= 10){
                        dx *= -1;
                        consta*=-1;
                    }
                    if(x >=300){
                        dx *= -1;
                        consta*=-1;
                        System.out.print("Stop\n");
                    }
                    if(x == camb1){
                        w+=50;
                        h+=50;
                        camb1 += consta;
                        System.out.print("1 "+x+"\n");
                       }
                    if(x == camb2){
                        w-=50;
                        h-=50;
                        camb2 +=consta;
                        System.out.print("2 "+x+"\n");
                    }
                
                /*if(der){
                    
                    x+=5;
                    if(x >= 450){
                        
                        der = false;
                        izq = true;
                        
                    }
                }
                
                if(izq){
                    
                    x-=5;
                    if(x <= 0){
                        
                        izq = false;
                        der = true;
                        
                    }
                    
                }*/
                
                repaint();//Lo que quieres modificar
                
            }
        });
        
        t.start();
        
        b.setBounds(50, 20, 150, 30);
        tf.setBounds(250, 20, 100, 30);
        
        this.add(b);
        this.add(tf);
        
    }

    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g1 = (Graphics2D)g;
        
        Rectangle2D r = new Rectangle2D.Double(x,y,w,h);
        
        g1.fill(r);
        
    }
    
}
