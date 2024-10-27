/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LCE3-ALUMNO 13
 */
public class Hijo extends JFrame{
    
    private JButton boton;
        
    private JTextField caja, caja2;
        
    private JLabel label;
    
    public Hijo(String s){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(500,400);
        
        this.setTitle(s);
        
        boton = new JButton("Mostrar");
        
        caja = new JTextField("Palabra");
        
        caja2 = new JTextField("Primera letra");
        
        label = new JLabel ("Etiqueta");
        
        this.setLayout(null);
        
        label.setBounds(200, 100, 100, 30);
        
        caja.setBounds(100, 150, 100, 30);
        
        caja2.setBounds(300, 150, 100, 30);
        
        boton.setBounds(200, 200, 100, 30);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
                char[] pal = caja.getText().toCharArray();
                
                char[] l = caja2.getText().toCharArray();
                
                char[] text = new char[pal.length];
                
                for(int i = 0; i < pal.length; i++){
                    
                    if(pal[i] == 'a')
                        
                        text[i] = l[0];
                    
                    else if(pal[i] == 'e')
                        
                        text[i] = l[0];
                    
                    else if(pal[i] == 'i')
                        
                        text[i] = l[0];
                    
                    else if(pal[i] == 'o')
                        
                        text[i] = l[0];
                    
                    else if(pal[i] == 'u')
                        
                        text[i] = l[0];
                    
                    else
                        
                        text[i] = pal[i];
                    
                    System.out.println(text[i]);
                    
                }
                
                label.setText(String.valueOf(text));
                
                
            }
        });
        
        this.add(boton);
        
        this.add(caja);
        
        this.add(caja2);
        
        this.add(label);
        
        this.setVisible(true);
       
        
    }
    
}
