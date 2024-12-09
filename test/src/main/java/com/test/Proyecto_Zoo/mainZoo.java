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

    public static int showMenu(int turno, Zoologico zoo){

        System.out.print("Seleccione una opcion:\n# de puntos --> "+zoo.getPuntos());
        System.out.print("\n0.- --> Terminar\n1.- --> Opciones ver estado Zoologico\n2.- --> Opciones Alimentar\n3.- --> Reglas\n----->");

        Scanner scan = new Scanner(System.in);

        return turno = scan.nextInt();

    }

    public static void textReglas(){

        System.out.println("--Reglas de juego--");
        System.out.println("Tendras un Zoologico en el que deberas gestionar el hambre de los animales de tu Zoologico para que sobrevivan.");
        System.out.println("Empezaras con 50 puntos y cada turno te dara 10 puntos mas");
        System.out.println("En caso de llegar a un turno multiplo de 5 (5,10,15,..), recibirás 20 puntos");
        System.out.println("Por turno cada animal perdera 2 de hambre");
        System.out.println("Cambiar de tueno al alimentar un animal o zona");

    }

    //Ver datos Zoo
    public static void seeZooStatus(Zoologico zoo){

        int opt;

        System.out.println("Selecione una opcion:\n");
        System.out.print("1.- Todo el Zoologico\n2.- Ver una zona\n3.- Ver un animal\n--> ");

        Scanner s = new Scanner(System.in);

        opt = s.nextInt();

        switch(opt){

            case 1:
                zoo.showDataZoo();
                break;

            case 2:
                seeZone(zoo);
                break;

            case 3:
                seeAnimal(zoo);
                break;

            default:
                System.out.println("Opcion no valida\n");
                break;

        }




    }

    public static void seeZone(Zoologico zoo){

        String opt;

        System.out.print("Escriba la Zona que busca: ");
        Scanner s = new Scanner(System.in);

        opt = s.nextLine();

        zoo.showDataZone(opt);
        zoo.getZona(opt).showAnimalsName();

    }

    public static void seeAnimal(Zoologico zoo){

        String opt;

        System.out.println("Escriba al Animal que busca: ");

        Scanner s = new Scanner(System.in);
        opt = s.nextLine();

        zoo.showDataAnimal(opt);

    }

    //Editar hambre Zoo
    public static void AlimentarZoo(Zoologico zoo){
        
        int opt, cant;

        System.out.println("Seleccione una opcion:");
        System.out.print("1.- Alimentar toda una Zona\n2.- Alimentar un Animal\n-->");

        Scanner s = new Scanner(System.in);
        opt = s.nextInt();

        System.out.println("Escriba cantidad de alimento");
        cant = s.nextInt();

        switch(opt){
            
            case 1:
                feedZona(zoo, cant);
                break;

            case 2:
                feedAnimal(zoo, cant);
                break;

            default:
                System.out.println("Opcion no valida\n");
                break;

        }

        zoo.restResources(cant);

    }

    public static void feedZona(Zoologico zoo, int cant){

        String opt;

        System.out.println("Escriba una Zona: ");

        Scanner s = new Scanner(System.in);
        opt = s.nextLine();

        zoo.feedZone(opt, cant);

    }

    public static void feedAnimal(Zoologico zoo, int cant){

        String opt;

        System.out.println("Escriba una Zona: ");

        Scanner s = new Scanner(System.in);
        opt = s.nextLine();

        Zona z = zoo.getZona(opt);

        System.out.println("Escriba un Animal: ");

        opt = s.nextLine();

        zoo.feedAnimal(z.getZonaName(), opt, cant);

    }


    public static void main(String[] args) {

        //N° turno --> -10 resources

        int turno = 1;
        final int cant = 10;

        Zoologico zoo = initTestCase();

        //zoo.showDataZoo();

        while(true){

            turno = showMenu(turno,zoo);

            if(turno == 0)
                break;

            switch (turno) {
                //Estados de Zoo
                case 1:
                    seeZooStatus(zoo);
                    break;

                //Alimentar Zoo
                case 2:
                AlimentarZoo(zoo);
                zoo.restHambreZoo();

                if(turno%5 == 0)
                    zoo.addResources(cant+10);
                else{
                    zoo.addResources(cant);
                }
                    break;

                //Reglas Zoo
                case 3:
                    textReglas();
                    break;

                default:
                    System.out.println("-----Opcion no valida-----\n");
                    break;
            }

            

        }

        
    }

}
