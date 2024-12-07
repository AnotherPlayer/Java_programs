package com.test.Proyecto_Zoo;

public class mainZoo {
 
    public static void main(String[] args) {

        Zona z1 = new Zona();
        Zona z2 = new Zona("Zauna");

        z2.addAnimal("Panda", "Terrestre");
        z2.addAnimal("Tigre", "Terrestre");
        z2.addAnimal("Pez", "Acuatico");
        z2.addAnimal("Aguila", "Volador");
        z2.addAnimal("Mantis", "Insecto");

        z2.showDataZone();

        z2.showAnimals();

    }

}
