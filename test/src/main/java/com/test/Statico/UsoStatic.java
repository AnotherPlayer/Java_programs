
package com.test.Statico;

public class UsoStatic {


    public static int ctr = 0;

    public static int getCount(){
        return ctr;
    }

    public static void increment(){
        ctr++;
    }
    public static void main(String[] args) {
        
        double valPI,valE;

        valPI = Math.PI;
        System.out.println("Valor de PI: "+valPI);
        System.out.printf("Valor de PI: %.4f",valPI);
        System.out.println();

        valE = Math.E;
        System.out.println("Valor de E: "+valE);
        System.out.printf("Valor de E: %.4f",valE);

    
        double area,hipo;

        valPI = Math.PI;
        System.out.println("Area de circulo area = 10");
        area = Math.PI*Math.pow(10, 20);
        System.out.printf("Area del circulo: %.4f",area);

        System.out.println("Caluclo hipotenusa A=3 y B=4");
        hipo = Math.hypot(3, 4);
        System.out.printf("Hipotenusa: %.4f",hipo);

        System.out.println("Start: "+ UsoStatic.getCount() );
        UsoStatic.increment( );
        UsoStatic.increment( );
        System.out.println("Start: "+ UsoStatic.getCount() );
        System.out.println("exp(counter): "+ Math.exp( (double)UsoStatic.getCount()));

    }
    
}
