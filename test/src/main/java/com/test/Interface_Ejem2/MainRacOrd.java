package com.test.Interface_Ejem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainRacOrd {

    public static void main(String[] args) {
        
        ArrayList<Racional> list = new ArrayList<Racional>();

        Random rand = new Random();

        for(int i=0 ; i<10 ; i++)
            list.add(new Racional(rand.nextInt(0, 5),rand.nextInt(0,5)));

        System.out.println("Lista racionales before sorting: "+list);
        
        Collections.sort(list);

        System.out.println("Lista racionales after sorting: "+list);

    }
    
}
