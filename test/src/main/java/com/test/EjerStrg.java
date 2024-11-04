package com.test;

import java.util.Scanner;

public class EjerStrg {

    private static boolean caractIncluidos(String cadena1, String cadena2) {
        for (char caracter : cadena2.toCharArray())
            if (!cadena1.contains(String.valueOf(caracter)))
                return false;
        
        return true;
    }

    private static int numCadena(String cadena){

        if(cadena.isBlank())
            return 0;

        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;

    }

        public static void main(String[] args) {
    
    /*    Tratar de usar las funcioes de las API

    Comparar cadenas leidas desde el teclado, la salida en pantalla deberá indicar si
    la primer cadena es un sufijo o prefijo (propio) de la segunda                       */


            System.out.println("\n*****Primero ejercicio*****\n");

        String cadena1, cadena2;
        boolean Prefijo, Sufijo;

        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce la primera cadena: ");
        cadena1 = tec.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        cadena2 = tec.nextLine();

        Prefijo = cadena1.startsWith(cadena2);
        Sufijo = cadena1.endsWith(cadena2);

        if(Prefijo)
            System.out.println(cadena2+" es prefijo de "+cadena1);
        else if(Sufijo)
            System.out.println(cadena2+" es sufijo de "+cadena1);


/*  Programa que leas dos cadenas desde el teclado y que indique en pantalla si todos los
    caracteres de la primera estan incluidos en la segunda, sin importar el orden
        Help: contain(),split(),substring()                                                 */
    
            System.out.println("\n*****Segundo ejercicio*****\n");

        System.out.print("Introduce la primera cadena: ");
        cadena1 = tec.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        cadena2 = tec.nextLine();

        System.out.println("La cadena 1 contiene todos los caracteres de cadena 2 --> "+caractIncluidos(cadena1, cadena2));
                



/*  Diseña un programa que lea una cadena que incluya varias palabras y que incluya varias
    palabras y que la salida indique:
      -El numero de palabras
      -La palabra con la longuitud mayor
      -La palabra con la longuitud menor
      -Reporte estadistico: mostrar la frecuencia con las longuitudes de las palabras
       de la cadena introducida                                                              */

            System.out.println("\n*****Tercer ejercicio*****\n");

        System.out.print("Introduce una cadena: ");
        cadena1 = tec.nextLine();
    
        System.out.println("Numero de cadenas --> "+numCadena(cadena1));
        System.out.println("Palabra con mayor longitud --> ");
        System.out.println("Palabra con la menor longuitud --> ");
        System.out.println("Reporte estadistico -->");


        tec.close();

        
    }

}
