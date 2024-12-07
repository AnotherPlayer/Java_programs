package com.test.Proyecto_Zoo;

import java.util.ArrayList;

public class Zoologico {

    private Zona[] zone = new Zona[5];
    private String name;
    private int code = 0;
    private int noResources = 50;
    private int turno;

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
        return ("Zoologico '"+this.name+"' / Codigo --> "+code);
    }

    public void addTurno(){
        turno++;
    }

}
