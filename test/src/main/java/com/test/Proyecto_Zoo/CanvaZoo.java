package com.test.Proyecto_Zoo;

import javax.swing.*;

public class CanvaZoo extends JFrame {

    private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

    private JLabel jl;

    public CanvaZoo(){

        
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl = new JLabel("Opciones de Juego:\n1.- Hola\n2.- QUe\n 3.- Hace");

    }
    
}
