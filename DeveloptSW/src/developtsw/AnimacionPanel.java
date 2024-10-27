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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author LCE3-ALUMNO 15
 */
public class AnimacionPanel extends JPanel implements KeyListener{
    
    private Ellipse2D[] elis;
    private Rectangle2D r;
    private double[] x;
    private double yr, xr;
    
    private double[] yRand;
    private double[] movEli;
    
    private Timer t;
    
    public AnimacionPanel(){
        
        elis = new Ellipse2D[2];
        
        x = new double[2];
        
        x[0] = 0;
        x[1] = 50;
        
        yr = 0;
        xr = 470;
        
        movEli = new double[2];
        
        movEli[0] = 5;
        movEli[1] = 5;
        
        yRand = new double[2];
        
        for(int i = 0; i < 2;i++){
            
            yRand[i] = Math.random()*500;
            
        }
        
        for(int i = 0; i < 2;i++){
            
            elis[i] =  new Ellipse2D.Double(x[i], yRand[i], 50, 50);
            
        }
        
        this.addKeyListener(this);
        this.setFocusable(true);
        
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.white);
      
        this.setLayout(null);
        
        t = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                for(int i = 0; i < 2 ; i++){
                
                    x[i]+=movEli[i];
                    
                        if(x[i] > 500)
                            
                            x[i] = -50;
                        
                        if(x[i] == -50)
                            
                            movEli[i] = +5;
                        
                        if(elis[i].intersects(r)){                    
                            movEli[i] = -5;
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

        
        for(int i = 0; i < 2;i++){
            
            elis[i] =  new Ellipse2D.Double(x[i], yRand[i], 50, 50);

            g1.fill(elis[i]);
        }
        
        
        r = new Rectangle2D.Double(xr, yr, 30, 50);
        
        g1.fill(r);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
     if (e.getKeyCode()==KeyEvent.VK_W)
         yr-=5;
     if (e.getKeyCode()==KeyEvent.VK_S)
         yr+=5;
     if(e.getKeyCode() == KeyEvent.VK_A)
        xr -=5;
     if(e.getKeyCode() == KeyEvent.VK_D)
        xr+=5;
     
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
