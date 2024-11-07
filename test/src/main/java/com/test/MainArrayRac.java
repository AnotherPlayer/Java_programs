package com.test;

import java.util.ArrayList;

public class MainArrayRac {

    public static void main(String[] args) {
        
        ArrayList<Racional> list = new ArrayList<Racional>();

        list.add(new Racional(5,2));
        list.add(new Racional(8,1));
        list.add(new Racional(9,3));
        list.add(new Racional(7,4));
        list.add(new Racional(9,3));

        Racional x = new Racional();

        //Mayor elemento
        x.mayorElem(list);
        System.out.println("Mayor elemento de lista: ");
        x.imprimr();

        //Menor elemento
        x.menorElem(list);
        System.out.println("Menor elemento de lista: ");
        x.imprimr();

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

        System.out.println("Lista a: "+a);      
        System.out.println("Lista b: "+b);
        System.out.println("Ambas listas son iguales --> "+x.comparacion(a, b));

    }
    
}
