/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developtsw;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author LCE3-ALUMNO 14
 */
public class CanvaPelotagrandepequeña extends JPanel{

    
    private Timer t;//Crear variable timer
    private AffineTransform esc, mov;
    private Shape el;
    @SuppressWarnings("unused")
    private int x,y;
    
    public CanvaPelotagrandepequeña() {
        
        x = 10;
        y = 10;
        esc = new AffineTransform();
        mov = new AffineTransform();
        el = new Ellipse2D.Double(320, 320, 10, 10);
        //at.setToRotation(Math.toRadians(5),250,200);
        esc.setToScale(2,2);
        mov.setToTranslation(-325,-325);
        
        this.setPreferredSize(new Dimension(640,640));
        this.setBackground(Color.white);
      
        this.setLayout(null);
        
        //Iniciarlizar t (milisegundos,new ActionListener(){}
        t = new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                el = esc.createTransformedShape(el);
                el = mov.createTransformedShape(el);
               
                if(el.getBounds().getWidth() > 500){
                    
                    esc.setToScale(0.5,0.5);
                    mov.setToTranslation(162.5,162.5);
                    
                }
                
                 //|| el.getBounds().getWidth() == 10
                
                if(el.getBounds().getWidth() <= 25){
                    
                    esc.setToScale(2,2);
                    mov.setToTranslation(-325,-325);
                    
                }
                
                
                
                repaint();//Lo que quieres modificar
                
            }
        });
        
        t.start();
        
        
        
    }

    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
       
        Graphics2D g1 = (Graphics2D)g;
        
        g1.fill(el);
        
        
    }
    
}
