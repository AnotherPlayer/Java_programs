package com.test.Proyecto_Zoo;

import java.util.Scanner;

public class mainZoo {

    public static Zoologico initTestCase(){

        Zoologico zoo = new Zoologico("Mexico");

        //init Zonas
            //Selva
                zoo.addAnimaltoZone("Jaguar", "Terrestre", 0);
                zoo.addAnimaltoZone("Gorila", "Terrestre", 0);
                zoo.addAnimaltoZone("Tucan", "Volador", 0);
                zoo.addAnimaltoZone("Mantins", "Insecto", 0);
                zoo.addAnimaltoZone("Lemur", "Terrestre", 0);
            //Bosque
                zoo.addAnimaltoZone("Zorro", "Terrestre", 1);
                zoo.addAnimaltoZone("Oso", "Terrestre", 1);
                zoo.addAnimaltoZone("Aguila", "Volador", 1);
            //Polar
                zoo.addAnimaltoZone("Orcas", "Acuatico", 2);
                zoo.addAnimaltoZone("Morsa", "Acuatico", 2);
                zoo.addAnimaltoZone("Lobo artico", "Terrestre", 2);
                zoo.addAnimaltoZone("Reno", "Terrestre", 2);
            //Desierto
                zoo.addAnimaltoZone("Camello", "Terrestre", 3);
                zoo.addAnimaltoZone("Escorpion", "Insecto", 3);
                zoo.addAnimaltoZone("Escarabajos", "Insecto", 3);
                zoo.addAnimaltoZone("Chacal", "Terrestre", 3);
            //Oceano
                zoo.addAnimaltoZone("Tiburon", "Acuatico", 4);
                zoo.addAnimaltoZone("Tortugas", "Acuatico", 4);
                zoo.addAnimaltoZone("Medusas", "Acuatico", 4);

        return zoo;

    }

    public static int showMenu(int turno){

        System.out.println("Seleccione una opcion:\n");
        System.out.println("0.- --> Terminar\n1.- --> Opciones ver estado Zoologico\n2.- --> Opciones Alimentar\n3.- --> Reglas");

        try (Scanner scan = new Scanner(System.in)) {
            turno = scan.nextInt();
        }

        return turno;

    }
 
    public static void main(String[] args) {

        //1° turno --> -10 resources
        //2° turno --> -10 resources
        //3° turno --> -10 resources
        //N° turno --> Show status

        int turno = 1;
        int cant = 10;

        Zoologico zoo;

        zoo = initTestCase();

        zoo.showDataZoo();

        while(turno != 0){

            turno = showMenu(turno);

        }

        
    }

}
