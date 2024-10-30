package com.test;

import java.util.Random;

public class MainRacional {
    /**
     * @param args
     */
    
    public void testOp(Racional a, Racional b, Racional c, Racional d){

        System.out.println();

        System.out.print("A->");
        a.imprimr();
        System.out.print("B->");
        b.imprimr();
        System.out.print("C-> ");
        c.imprimr();
        System.out.print("D->");
        d.imprimr();
        System.out.println();

        c.suma(a, b);
        System.out.print("A+B-> ");
        c.imprimr();

        c.suma(5,3);
        System.out.print("A+B-> ");
        c.imprimr();

        c.resta(a, b);
        System.out.print("A-B-> ");
        c.imprimr();

        c.producto(a, b);
        System.out.print("A*B-> ");
        c.imprimr();

        c.producto(a);
        System.out.print("C*A-> ");
        c.imprimr();

        c.division(a, b);
        System.out.print("A/B-> ");
        c.imprimr();

        d.potencia(2);
        System.out.print("D^2-> ");
        d.imprimr();

    }
    
    public void ejemProfe(Racional a, Racional b, Racional c){

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        System.out.println("\nProfe casos\n");

        a.producto(1, 2);
        System.out.print("A*1/2-> ");
        a.imprimr();

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        a.producto(b.producto(c));
        System.out.print("A*(B*C)-> ");
        a.imprimr();

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        a.division(b);
        System.out.print("A/B-> ");
        a.imprimr();

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        a.division(b,c);
        System.out.print("B/C-> ");
        a.imprimr();

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        a.division(b.division(c));
        System.out.print("A/(B/c)-> ");
        a.imprimr();

    }

    public static void main(String[] args) {
        
        Racional a,b,c,d;
        a = new Racional(7,2);
        b = new Racional(5,10);
        c = new Racional(15);
        d = new Racional(b);      

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
            grupoB[i] = new Racional(rand.nextInt(10),rand.nextInt(10));

        for(Racional var : grupoB)
            var.imprimr();

        System.out.println("El elemento mayor del arreglo B es: ");
        d.mayorElem(grupoB).imprimr();

        System.out.println("El elemento menor del arreglo B es: ");
        d.menorElem(grupoB).imprimr();

    }
}