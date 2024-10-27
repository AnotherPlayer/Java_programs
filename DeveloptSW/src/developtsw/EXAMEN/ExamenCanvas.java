/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developtsw.EXAMEN;


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
public class ExamenCanvas extends JPanel implements KeyListener{
    
    private Timer t;
    
    private Shape el[];
    private int pos;
    private boolean ar, ab, iz, de;
    
    public ExamenCanvas() {
        
        this.addKeyListener(this);
        this.setFocusable(true);
        
        pos = 0;
        
        ar = false;
        ab = false;
        iz = false;
        de = false;
        
        el = new Ellipse2D[1000];
        el[0] = new Ellipse2D.Double(250, 250, 10, 10);
        
        t = new Timer(75,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                repaint();//Lo que quieres modificar
                
            }
        });
        
        t.start();
        
        /*if(de == true){
            
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX()+10, el[pos-1].getBounds().getY(), 10, 10);
            de = false;
            
        }
        
        if(iz == true){
            
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX()-10, el[pos-1].getBounds().getY(), 10, 10);
            iz = false;
            
        }
        
        if(ar == true){
            
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX(), el[pos-1].getBounds().getY()-10, 10, 10);
            ar = false;
            
        }
        
        if(ab == true){
            
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX(), el[pos-1].getBounds().getY()+10, 10, 10);
            ab = false;
            
        }
        */
        
        
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.white);
        this.setLayout(null);
        
    }

    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g1 = (Graphics2D)g;
        
        
        for(int i = 0; i < pos+1; i++){
            
            g1.fill(el[i]);
            
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        pos++;
        System.out.println(pos);
        
        if(e.getKeyCode() == KeyEvent.VK_A)
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX()-10, el[pos-1].getBounds().getY(), 10, 10);
            //de = true;
            
        
        if(e.getKeyCode() == KeyEvent.VK_D)
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX()+10, el[pos-1].getBounds().getY(), 10, 10);
            //iz = true;
            
     
        if(e.getKeyCode() == KeyEvent.VK_W)
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX(), el[pos-1].getBounds().getY()-10, 10, 10);
            //ar = true;
            
        
        if(e.getKeyCode() == KeyEvent.VK_S)
            el[pos] = new Ellipse2D.Double(el[pos-1].getBounds().getX(), el[pos-1].getBounds().getY()+10, 10, 10);
            //ab = true; 
            
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
