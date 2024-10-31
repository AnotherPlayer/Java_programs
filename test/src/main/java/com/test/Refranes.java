package com.test;

import java.util.Random;
import java.util.Scanner;

public class Refranes{

    public static void main(String[] args) {
        
        Random azar = new Random();

        String[] grupo = new String[]{
            "Ajonjoli de todos los moles",
            "El que es perico donde quiera es verde",
            "El que no conoce a dios a cualquier santo le reza",
            "Del dicho al lecho hay mucho trecho",
            "Para todo mal un buen mezcal; para todo bien, tambien",
            "El que nace para tamal del cielo le caen las hojas",
            "Estas trompudo o quieres beso",
            "Siempre hay un roto para un descosido",
            "Ya se le vieron las orejas al violin",
            "A caballo regalado no se le ve el colmillo"};

        int val = azar.nextInt(grupo.length);
        System.out.println("Refran del dia: "+grupo[val]);

        System.out.println("longitd de un String\nInserta una cadena de caracteres: ");
        try (Scanner teclado = new Scanner(System.in)) {
            String cad = teclado.next();
            int l = cad.length();
            System.out.println("Escribio: "+cad+" // lenght: "+l);
        }

        System.out.println("Metodo SubsString().");
        String cafe = "descafeinado";
        System.out.println("Cadena original --> "+cafe);
        System.out.println("SubsString(3,10) --> "+cafe.substring(3,(9+1)));

    }
}
