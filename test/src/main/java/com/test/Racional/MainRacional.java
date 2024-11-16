package com.test.Racional;

import java.util.Random;

public class MainRacional {
    /**
     * @param args
     */
    
    public static void main(String[] args) {
        
        Racional d = new Racional();

        System.out.println("\n*****Arreglo Racionales*****\n");

        //Areglo de racionales

        Racional[] grupoA = new Racional[3];

        grupoA[0] = new Racional();
        grupoA[1] = new Racional(3,2);
        grupoA[2] = new Racional(2,5);

        for(int i = 0; i< grupoA.length ; i++){
            grupoA[i].imprimr();
        }
        
        grupoA[0] = new Racional(3,3);
        grupoA[1] = new Racional(2,2);
        grupoA[2] = new Racional(1,1);

        System.out.println("*****Uso de for-each*****\n");

        for(Racional var : grupoA)
            var.imprimr();


        System.out.println("\n\n*****Generamos un arreglo racional de forma aleatoria*****\n");
        Random rand = new Random();
        Racional[] grupoB = new Racional[10];

        for(int i=0 ; i<grupoB.length ; i++)
            grupoB[i] = new Racional(rand.nextInt(5),rand.nextInt(5));

        for(Racional var : grupoB)
            var.imprimr();

        System.out.println("El elemento mayor del arreglo B es: ");
        d.mayorElem(grupoB).imprimr();

        System.out.println("El elemento menor del arreglo B es: ");
        d.menorElem(grupoB).imprimr();

        System.out.println("Moda del arreglo B es: ");
        d.modaElem(grupoB).imprimr();

        System.out.println("*****Comparación de dos arreglos*****");

        int length = 5;

        Racional[] a = new Racional[length];
        Racional[] b = new Racional[length];

        for(int i=0 ; i<length ; i++){

            a[i] = new Racional(5,5);
            b[i] = new Racional(5,5);
        }

        //b[4] = new Racional(8,5);

        System.out.println("Los los arreglos a y b son iguales --> "+d.comparacion(a, b));

    }
}