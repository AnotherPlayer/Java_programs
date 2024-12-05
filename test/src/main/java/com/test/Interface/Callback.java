package com.test.Interface;

public interface Callback {
    
    void callback( int param);
}

class Cliente implements Callback{
// Implementa el método callbackde la interfaz Callback
    public void callback(int p){
    System.out.println("Método callbackllamado con "+ p);
    }

    public void noInterfazMetodo() {// No es método de la interfaz
    System.out.println("Otros métodos propios de la clase");
    }

}
