/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.BaseProyect;


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
public class CanvasBase extends JPanel{

    private JButton b;
    private JTextField tf;
    
    private Timer t;//Crear variable timer
    
    @SuppressWarnings("unused")
    private double x,y,dx,w,h;
    @SuppressWarnings("unused")
    private double camb1, camb2,consta;
    
    @SuppressWarnings("unused")
    private boolean der, izq;
    
    public CanvasBase() {
        
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
