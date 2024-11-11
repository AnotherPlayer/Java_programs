package com.test;

import java.util.ArrayList;
import java.util.Random;

public class MainArrayRac {

    public static void main(String[] args) {
        
        ArrayList<Racional> list = new ArrayList<Racional>();

        Random rand = new Random();

        for(int i=0 ; i<10 ; i++)
            list.add(new Racional(rand.nextInt(0, 5),rand.nextInt(0,5)));

        System.out.println("Lista racionales: "+list);
        
        Racional x = new Racional();

        //Mayor elemento
        x.mayorElem(list);
        System.out.println("Mayor elemento de lista: ");
        x.imprimr();

        System.out.println();

        //Menor elemento
        x.menorElem(list);
        System.out.println("Menor elemento de lista: ");
        x.imprimr();

        System.out.println();

        //Moda
        x.modaElem(list);
        System.out.println("Moda de lista: ");
        x.imprimr();

        System.out.println();

        ArrayList<Racional> a = new ArrayList<Racional>();
        ArrayList<Racional> b = new ArrayList<Racional>();

        for(int i=0 ; i<3 ; i++){
            a.add(new Racional(5,5));
            b.add(new Racional(5,5));
        }

        b.add(2,new Racional(7,4));
        b.remove(0);

        System.out.println("Lista a: "+a);      
        System.out.println("Lista b: "+b);
        System.out.println("Ambas listas son iguales --> "+x.comparacion(a, b));

    }
    
}
