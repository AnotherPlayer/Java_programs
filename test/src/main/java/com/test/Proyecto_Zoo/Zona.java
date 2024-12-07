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

    public void addAnimal(String name, String tipo){
        anim.add(new Animal(name,tipo));
    }

    public void deleteAnimal(int i){

    }

    public void deleteAnimal(String s){

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
