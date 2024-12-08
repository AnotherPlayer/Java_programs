package com.test.Proyecto_Zoo;

import java.util.ArrayList;

public class Zona {

    private ArrayList<Animal> anim = new ArrayList<>();
    private String nameZone;

    public Zona(){

        this.nameZone = "Unknown";

    }

    public Zona(String name){

        this.nameZone = name;

    }


    //Relacionado con animales
    public void addAnimal(String name, String tipo){
        anim.add(new Animal(name,tipo));
    }

    public void deleteAnimal(int i){
        System.out.println("--> "+anim.remove(i).getNombre()+" elmininado de "+this.nameZone);
    }

    public void deleteAnimal(String s){

        for (Animal a : anim)
            if(a.getNombre().equals(s)){
                System.out.println("--> "+a.getNombre()+" eliminaod de "+this.nameZone);
                anim.remove(a);
            }

    }

    public void feedAll(int cant){
        for(Animal a : anim)
            a.addHammbre(cant);
    }


    //Relacionado con la Zona en general
    public int getHambreZona(){

        int sumHambre=0;

        for(Animal a : anim)
            sumHambre += a.getHambre();

        return sumHambre;
    }

    public void showAnimals(){

        for(Animal a : anim)
            System.out.println(a);

    }

    public String getZonaName(){
        return this.nameZone;
    }

    public Zona getZona(){
        return this;
    }

    public void showDataZone(){
        System.out.println(this);
    }

    public String toString(){
        return("\tZona "+this.nameZone+"\n\t#Animales --> "+anim.size()+"\n");
    }

    
}
