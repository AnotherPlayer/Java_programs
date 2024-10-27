/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo_de_software;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LCE3-ALUMNO 17
 */
public class BACKWARD_WORDS {
    
    public static void main(String[] args) {
        
        JFrame F = new JFrame("BACKWARD_WORDS");//ESTAMOS BAUTIZANDO EL FRAME
        
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        F.setSize(500, 400);
        
        JButton b = new JButton("INVERTIR PALABRA");
        
        JLabel l = new JLabel("Etiqueta");
        
        JTextField t = new JTextField ();//Si borras su nombre "Texto" la etiqueta aparece sin nada  
        
        F.setLayout(null);
        
        b.setBounds(200, 200, 100, 30);
        
        l.setBounds(200, 150, 100, 30);
        
        t.setBounds(200, 100, 100, 30);
        
        
                
        
        b.addActionListener(new ActionListener() {
            
            @Override
            
            public void actionPerformed(ActionEvent e) {
                
                String p = t.getText();
                
                
                String r=" ";
                
                char[] c = p.toCharArray();
                
                
                
                char[] car = new char [c.length]; 
                
                int x=0;
                
                for (int i = c.length-1 ; i >= 0; i--){
                   
                    r+= c[i];
                    
                    l.setText(r);
                    
                }
                
                
                
                
               
            }
            
        });
        
        
        
        F.add(b);
        
        F.add(l);
        
        F.add(t);
        
        F.setVisible(true);
        
        b.setVisible(true);
        
        l.setVisible(true);
        
        t.setVisible(true);
        
        
    }
    
}
