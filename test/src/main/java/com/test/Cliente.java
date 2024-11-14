package com.test;

public class Cliente {

// Atributos privado
    private String nombre;
    private Cuenta cuenta;
    private String numCta;
// Constructor
    public Cliente(String nombre, String numCta){
        this.nombre = nombre;
        this.numCta = numCta;
    }
//Métodos
    
    // obtenerNombre: devuelve el nombre
    public String obtenerNombre( ){
        return nombre;
    }
    
    // obtenerCuenta: devuelve el objeto de la clase Cuenta
    public Cuenta obtenerCuenta( ){
        return cuenta;
    }
    // establecerCuenta: establece el objeto de la clase Cuenta
    public void establecerCuenta(Cuenta cta){
        cuenta = cta;
    }
    // obtenerNombre: devuelve el numero de cuenta
    public String obtenerNumCta( ){
        return numCta;
    }

    public String toString(){
        return (this.nombre+" "+this.numCta);
    }

}
