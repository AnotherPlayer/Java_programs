/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame v = new JFrame("Ventana");//ESTAMOS BAUTIZANDO EL FRAME
        
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        v.setSize(500, 400);
        
        JButton btnAceptar = new JButton("MOSTRAR");
        
        JLabel etiqueta = new JLabel("Etiqueta");
        
        JTextField texto = new JTextField ("Texto");//Si borras su nombre "Texto" la etiqueta aparece sin nada
        
        v.setLayout(null);
        
        btnAceptar.setBounds(200, 200, 100, 30);
        
        etiqueta.setBounds(200, 150, 100, 30);
        
        texto.setBounds(200, 100, 100, 30);
        
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                String t = texto.getText();
                
                etiqueta.setText(t);
                
                texto.setText("");//Se borra el texto de el JTextField
                
            }
        });
        
        v.add(btnAceptar);
        
        v.add(etiqueta);
        
        v.add(texto);
        
        v.setVisible(true);
        
        btnAceptar.setVisible(true);
        
        texto.setVisible(true);
        
    }
    
}
