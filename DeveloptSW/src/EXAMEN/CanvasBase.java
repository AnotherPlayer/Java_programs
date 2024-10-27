/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;


import developtsw.BaseProyect.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

@SuppressWarnings("unused")

/**
 *
 * @author LCE3-ALUMNO 14
 */
public class CanvasBase extends JPanel implements KeyListener{
    
    private Timer t;//Crear variable timer

    private int pos;
    
    private Shape[] el;
    private AffineTransform at;
    
    public CanvasBase() {
        
        this.addKeyListener(this);
        this.setFocusable(true);

        
       pos = 1;
       el = new Shape[100]; 
       
       at = new AffineTransform();
       at.setToTranslation(10,0);
       el[0] = new Ellipse2D.Double(250, 250, 10, 10);
       
      
            
        /*
        //Iniciarlizar t (milisegundos,new ActionListener(){}
        t = new Timer(75,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                
            el[pos] = at.createTransformedShape(el[pos]);
                     
                
            }
        });
        
        t.start();
        */
       
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.white);
      
        this.setLayout(null);
        
    }

    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g1 = (Graphics2D)g;
        
        
    for(int i = 0; i < pos; i++){
            
            
            el[i] = at.createTransformedShape(el[i]);
            g1.fill(el[i]);
            
        }
        
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
          
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        
        
        System.out.println("posicion x"+pos+": "+el[pos-1].getBounds().getX());
        System.out.println("posicion y"+pos+": "+el[pos-1].getBounds().getY()); 

        if(e.getKeyCode() == KeyEvent.VK_A){
           
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX(), el[pos-1].getBounds().getY(), 10, 10);
            at.setToTranslation(10,0);
            pos++;
             
        }            
        if(e.getKeyCode() == KeyEvent.VK_D){
            
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX(), el[pos-1].getBounds().getY(), 10, 10);
            at.setToTranslation(-10,0);
            pos++;
             
        }
        
        if(e.getKeyCode() == KeyEvent.VK_W){
            
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX(), el[pos-1].getBounds().getY(), 10, 10);
            at.setToTranslation(0,-10);
            pos++;
             
        }
        
        if(e.getKeyCode() == KeyEvent.VK_S){
            
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX(), el[pos-1].getBounds().getY(), 10, 10);
            at.setToTranslation(0,10);
            pos++;
            
        }
        
        
        
        repaint();
        
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
