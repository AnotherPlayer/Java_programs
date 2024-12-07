package com.test.Proyecto_Zoo;

public class Animal {

    private String name;
    private int estado;//Vivo o muerto
    private int hambre;
    private String tipo;
    private final int max = 20;

    public Animal(String name, String tipo){

        this.name = name;
        this.tipo = tipo;
        this.estado=1;
        this.hambre=5;

    }

    public int addHammbre(int n){

        if(n>max-this.hambre){
            System.out.println("Supera capacidad maxima de hambre\n");
            return 0;
        }

        return this.hambre += n; 
            
    }

    public void lessHambre(){

        this.hambre -= 2;

        if(this.hambre <= 0){
            this.estado = 0;
        }

    }

    public String estado(){

        if(this.estado == 1)
            return "vivo";

        return "muerto";

    }

    public Animal getAnimal(){
        return this;
    }

    public void showDataAnimal(){
        System.out.println(this);
    }

    public String toString(){
        return ("\t**"+this.name+"**\n\tTipo --> "+this.tipo+
        "\n\tEstado --> "+this.estado()+"\n\tHambre --> "+this.hambre+"\n");
    }

}
