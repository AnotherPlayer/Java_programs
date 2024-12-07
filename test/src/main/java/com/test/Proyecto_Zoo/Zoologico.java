package com.test.Proyecto_Zoo;

public class Zoologico {

    private Zona[] zone = new Zona[5];
    private String name;
    private int code = 0;
    private int noResources = 50;
    private int turno=1;

    //1° turno --> 
    //2° turno --> 
    //3° turno --> 
    //N° turno --> Show status

    public Zoologico(){

        name = "Nameless";
        code = 000;
        turno = 0;

    }

    public Zoologico(String name){

        this.name = name;
        code++;
        turno = 0;

    }

    public String toString(){
        return ("Zoologico '"+this.name+"' / Codigo --> "+code+" / #Recursos --> "+this.noResources);
    }

    public void nextTurno(){
        turno++;
    }

    public void showDataZoo(){
        System.out.println(this);
    }

    public void showDataZone(String name){

        

    }

}
