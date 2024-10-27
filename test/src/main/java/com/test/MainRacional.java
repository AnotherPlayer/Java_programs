package com.test;

public class MainRacional {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Racional a,b,c,d;
        a = new Racional(7,2);
        b = new Racional(5,10);
        c = new Racional(15);
        d = new Racional(b);

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

        //Casos profe

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

        System.out.println();

    }
}