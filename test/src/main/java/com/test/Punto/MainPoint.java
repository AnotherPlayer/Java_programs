package com.test.Punto;

public class MainPoint {
    
    public static void main(String[] args) {
        
        Point a,b;
        a = new Point(23,94);
        b = new Point(64,-23);

        Point c[];
        c = new Point[2];

        c[0] = new Point(23,94);

        a.show();
        b.show();

        System.out.println("\tA y B son iguales --> "+a.equals(b)+"\n");

        b = a;

        a.show();
        b.show();

        System.out.println("\tA y B son iguales --> "+a.equals(b)+"\n");

        a.show();
        c[0].show();

        System.out.println("\tA y C[0] son iguales --> "+a.equals(c[0])+"\n");

        System.out.println(a.getClass());

        System.out.println(a.hashCode());

        System.out.println(a.toString());

        String s1 = new String("Soy un String");
        String s2 = new String("Soy un String");
        System.out.println("s1==s2: "+(s1==s2));
        System.out.println("s1.equals(s2): "+ s1.equals(s2));


        System.out.println();

    }

}
