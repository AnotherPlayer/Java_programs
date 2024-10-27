/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developtsw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HDavi
 * 
 */

@SuppressWarnings("unused")

public class GraficaPanel extends JPanel{

    private JButton b;
    private JTextField f;
    
    private float xI;
    private float yI;
    private int cant;
    private String v[];
    private int horizontal;
    public GraficaPanel() {
        
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.white);

        v = new String[cant];
        
        b = new JButton("Graficar");
        f = new JTextField();
        
        this.setLayout(null);
        
        this.setVisible(true);
        
        b.setBounds(50, 50, 100, 50);
        f.setBounds(200, 50, 250, 50);
        
        this.add(b);
        this.add(f);
        
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String cad = f.getText();
                
                v = cad.split(",");
                
                repaint();
                
            }
            
        });
        
    }

    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g1 = (Graphics2D)g;
        
        g1.setColor(Color.blue);
        
        horizontal = v.length * 60;
        
        Line2D lineaH = new Line2D.Double(20,450,horizontal,450);
        g1.draw(lineaH);
        
        Line2D lineaV = new Line2D.Double(20,100,20,450);
        g1.draw(lineaV);
        
        xI = 50;
        
        for(int i = 0; i < v.length; i++){

            xI = 50;
            yI = 450;
            
            g1.setColor(Color.red);

            //Line2D l = new Line2D.Float(xI, yI, xI, yI - Float.parseFloat(v[i]));
            //g1.draw(l);
            
            Rectangle2D r = new Rectangle2D.Double(xI+(50*i), yI - Float.parseFloat(v[i]), xI-25,Float.parseFloat(v[i])  );
            
            g1.fill(r);
            
            
            
        }
        
    }
    
}
