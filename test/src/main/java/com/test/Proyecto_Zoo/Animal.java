package com.test.Proyecto_Zoo;

public class Animal {

    private String name;
    private int Nojaula=0;
    private int estado;//Vivo o muerto
    private int hambre;
    private final int max = 20;

    public Animal(String name){

        this.name = name;
        this.Nojaula++;
        this.estado=1;
        this.hambre=5;

    }

    public String toString(){
        return ("Nombre --> "+this.name+" / #Jaula --> "+this.Nojaula+" / Estado --> "+this.estado+" / Hambre"+this.hambre);
    }

    public void estado(Animal anim){
        System.out.println(anim);
    }

    public int alimentar(int n){

        if(n>max-this.hambre)
            return 0;

        return this.hambre += n; 
            
    }

}
