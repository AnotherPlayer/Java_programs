package com.test.Proyecto_Zoo;

public class Zoologico {

    private Zona[] zone = new Zona[5];
    private String name;
    private int noResources = 50;

    public Zoologico(){

        name = "Nameless";
        this.initZonas();

    }

    public Zoologico(String name){

        this.name = name;
        this.initZonas();

    }

    //Inicializar Zonas
    public void initZonas(){

        zone[0] = new Zona("Selva");
        zone[1] = new Zona("Bosque");
        zone[2] = new Zona("Polar");
        zone[3] = new Zona("Desierto");
        zone[4] = new Zona("Oceano");

    }

    //Alimentar zonas
    public void feedZone(int iZone, int cant){

        if(zone[iZone].getHambreZona() > this.noResources)
            zone[iZone].feedAll(cant);

    }

    public void feedZone(String nameZone, int cant){

        for(Zona z : zone)
            if(z.getZonaName().equals(nameZone) && z.getHambreZona() > this.noResources)
                z.feedAll(cant);
                

    }

    //Alimentar animal
    public void feedAnimal(String Zname, String Aname, int cant){

        for(Zona z : zone)
            if(z.getZonaName().equals(Zname))
                z.getAnimal(Aname).addHambre(cant);

    }

    public void feedAnimal(String Zname, int Ai, int cant){

        for(Zona z : zone)
            if(z.getZonaName().equals(Zname))
                z.getAnimal(Ai).addHambre(cant);

    }

    public void feedAnimal(int Zi, String Aname, int cant){
        zone[Zi].getAnimal(Aname).addHambre(cant);
    }

    public void feedAnimal(int Zi, int Ai, int cant){
        zone[Zi].getAnimal(Ai).addHambre(cant);
    }

    //Quitar hambre toda la Zona
    public void restHambreZoo(){

        for(Zona z : zone)
            z.restHambreZona();

    }
    
    //Agregar animal a zona
    public void addAnimaltoZone(String Aname, String Atipo, String Zname){

        for(Zona z : zone)
            if(z.getZonaName().equals(Zname)){
                z.addAnimal(Aname, Atipo);
                return;
            }

        System.out.println("Zona no encontrada para "+Aname);

    }

    public void addAnimaltoZone(String Aname, String Atipo, int Zi){

        if(Zi >= zone.length){
            System.out.println("Zona no encontrada para "+Aname);
            return;
        }

        zone[Zi].addAnimal(Aname, Atipo);

    }

    //Eliminar animal de zona
    @SuppressWarnings("unlikely-arg-type")
    public void deleteAnimaltoZone(String Aname, String Zname){

        for(Zona z : zone)
            if(z.equals(Zname)){
                z.deleteAnimal(Aname);
                return;
            }

    }

    @SuppressWarnings("unlikely-arg-type")
    public void deleteAnimaltoZone(int Ai, String Zname){

        for(Zona z : zone)
            if(z.equals(Zname)){
                z.deleteAnimal(Ai);
                return;
            }

    }

    public void deleteAnimaltoZone(String Aname, int Zi){

        zone[Zi].deleteAnimal(Aname);

    }

    public void deleteAnimaltoZone(int Ai, int Zi){

        zone[Zi].deleteAnimal(Ai);

    }

    //Administrar recursos

    public void restResources(int n){
        this.noResources -= n;
    }

    public void addResources(int n){
        this.noResources += n;
    }

    public int getPuntos(){
        return this.noResources;
    }

    public Zona getZona(String Zname){
        
        for(Zona z : zone)
            if(z.getZonaName().equals(Zname))
                return z;

        return new Zona();

    }

    //Show Data of Zoologico
    public void showDataZoo(){


        System.out.println(this);
        
        int i=0;
        for(Zona z : zone){
            System.out.println("-------------------------------------------");
            System.out.println("Zona #"+(i++)+"\n"+z);
            z.showAnimalsName();
        }

            System.out.println("-------------------------------------------");

    }

    public void showDataZone(String name){

        for(Zona z : zone)
            if(z.getZonaName().equals(name))
                System.out.println(z.toString());
    }

    public void showDataAllZone(){

        int i=0;

        System.out.println("---------------------------------");

        for(Zona z : zone)
            System.out.println("Zona #"+(i++)+"\n"+z);

        System.out.println("---------------------------------");

    }

    public void showDataAnimal(String name){

        for(Zona z : zone)
            if(!(z.getAnimal(name).getNombre().equals("unknown"))){
                System.out.println("\tZona ----> "+z.getZonaName());
                z.getAnimal(name).showDataAnimal();
                return;
            }

        System.out.println("Animal no encontrado\n");

    }

    public String toString(){
        return ("\nZoologico '"+this.name+" / #Recursos --> "+this.noResources+" / #Zonas --> "+this.zone.length+"\n");
    }

}
