package com.test.Proyecto_Zoo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CanvaZoo extends JPanel {

    private static final int WIDTH = 500;
	private static final int HEIGHT = 200;

    private JLabel jL;
    private JButton[] jB = new JButton[4];


    public CanvaZoo(String text){

        int y = 5;

        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        this.setBackground(Color.white);
        this.setLayout(null);
        
        jL = new JLabel();
        jL.setBounds(20, 20, 200, 100);
        jL.setBackground(Color.GREEN);
        jL.setText(text);

        for(int i=0 ; i<4 ; i++){
            jB[i] = new JButton("Opcion "+(i));
            jB[i].setBounds(250, (y+=25), 100, 20);
            jB[i].setBackground(Color.orange);
            jB[i].setBorderPainted(true);
            this.add(jB[i]);
        }

        this.add(jL);

        //TODO:Boton 0
        jB[0].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Gracias por paticipar");
            }
            
        });

        //TODO:Boton 1
        jB[1].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton 1");
            }
            
        });

         //TODO:Boton 2
         jB[2].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton 2");
            }
            
        });

         //TODO:Boton 3
         jB[3].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Boton 3");
            }
            
        });

    }

    

}
