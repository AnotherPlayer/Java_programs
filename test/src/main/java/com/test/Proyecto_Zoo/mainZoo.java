package com.test.Proyecto_Zoo;

public class mainZoo {
 
    public static void main(String[] args) {

        Zona z1 = new Zona("Acuatico");
        Zona z2 = new Zona("Zauna");

        z1.addAnimal("Pez espada", "acuatico");
        z1.addAnimal("Tiburon", "acuatico");
        z1.addAnimal("Medusa", "acuatico");

        z2.addAnimal("Panda", "Terrestre");
        z2.addAnimal("Tigre", "Terrestre");
        z2.addAnimal("Pez", "Acuatico");
        z2.addAnimal("Aguila", "Volador");
        z2.addAnimal("Mantis", "Insecto");

        z2.showDataZone();
        z2.showAnimals();

        z2.getAnimal("Tigre").showDataAnimal();;
        z2.getAnimal(4).showDataAnimal();

        
    }

}
