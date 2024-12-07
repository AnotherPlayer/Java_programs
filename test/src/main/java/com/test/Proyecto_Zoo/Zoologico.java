package com.test.Proyecto_Zoo;

public class Zoologico {

    private Zona[] zone = new Zona[5];
    private String name;
    private int code = 0;
    private int noResources = 50;

    //1° turno --> 
    //2° turno --> 
    //3° turno --> 
    //N° turno --> Show status

    public Zoologico(){

        name = "Nameless";
        code = 000;
        this.initZonas();

    }

    public Zoologico(String name){

        this.name = name;
        code++;
        this.initZonas();

    }

    public void initZonas(){

        zone[0] = new Zona("Selva");
        zone[1] = new Zona("Bosque");
        zone[2] = new Zona("Polar");
        zone[3] = new Zona("Desierto");
        zone[4] = new Zona("Acuatico");

    }

    public void feedZone(){

    }

    public void feedAnimal(){

    }


    public void showDataZoo(){
        System.out.println(this);
    }

    public void showDataAnimal(String name){

    }

    public void showDataZone(String name){

        for(Zona z : zone)
            if(z.getZonaName().equals(name))
                System.out.println(z.toString());
    }

    public String toString(){
        return ("Zoologico '"+this.name+"' / Codigo --> "+code+" / #Recursos --> "+this.noResources);
    }

}
