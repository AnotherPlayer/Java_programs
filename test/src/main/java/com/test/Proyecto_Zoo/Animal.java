package com.test.Proyecto_Zoo;

public class Animal {

    private String name;
    private int estado;//Vivo o muerto
    private int hambre;
    private String tipo;
    private final int max = 20;

    public Animal(){

        this.name = "unknown";
        this.tipo = "unknown";
        this.estado=0;
        this.hambre=0;

    }

    public Animal(String name, String tipo){

        this.name = name;
        this.tipo = tipo;
        this.estado=1;
        this.hambre=5;

    }

    //Relacionado con Hambre
    public int addHambre(int n){

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

    //Getters
    public int getHambre(){
        return this.hambre;
    }

    public int getHambreRestante(){
        return (this.max-this.hambre);
    }

    public String getNombre(){
        return this.name;
    }

    public String getTipo(){
        return this.tipo;
    }

    //Show Data of animals
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
