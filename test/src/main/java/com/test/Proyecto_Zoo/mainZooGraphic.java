package com.test.Proyecto_Zoo;

import javax.swing.JFrame;

public class mainZooGraphic{

    public static String menuText(){
        String t = "<html>"+
                "<p>0.- Terminar</p>"+
                "<p>1.- Opciones ver estado Zoologico</p>"+ 
                "<p>2.- Opciones Alimentar</p>"+
                "<p>3.- Reglas</p>"+
                "</html>";
                        
        return t;
    }

    public static void main(String[] args) {
        
        JFrame f = new JFrame("Menu Zoologico");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CanvaZoo z = new CanvaZoo(menuText());
        f.add(z);
        f.pack();
        f.setVisible(true);

    }
    
    
}
