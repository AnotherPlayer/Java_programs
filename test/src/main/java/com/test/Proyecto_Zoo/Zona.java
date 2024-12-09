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

        for (Animal a : anim){
            if(a.getNombre().equals(s)){
                System.out.println("--> "+a.getNombre()+" eliminado de "+this.nameZone);
                anim.remove(a);
                return;
            }
        }
    }

    public void feedAll(int cant){
        for(Animal a : anim)
            a.addHambre(cant);
    }

    public int getNumAnimales(){
        return anim.size();
    }

    public Animal getAnimal(int i){
        return anim.get(i);
    }

    public Animal getAnimal(String Aname){
        
        for (Animal a : anim)
            if(a.getNombre().equals(Aname))
                return a;

        return new Animal();

    }

    //Relacionado con toda la Zona
    public int getHambreZona(){

        int sumHambre=0;

        for(Animal a : anim)
            sumHambre += a.getHambreRestante();

        return sumHambre;
    }

    public void restHambreZona(){

        for(Animal a: anim)
            a.lessHambre();

    }

    public void showAnimals(){

        System.out.println("---------------------------------");

        for(Animal a : anim)
            System.out.println(a);

        System.out.println("---------------------------------");

    }

    public void showAnimalsName(){

        for(Animal a : anim)
            System.out.print(a.getNombre()+", ");

        System.out.println();

    }

    public String getZonaName(){
        return this.nameZone;
    }

    public Zona getZona(){
        return this;
    }

    //Show Data of Zona
    public void showDataZone(){
        System.out.println(this);
    }

    public String toString(){
        return("\tZona "+this.nameZone+"\n\t#Animales --> "+anim.size()+"\n");
    }

    
}
