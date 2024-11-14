package com.test;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> cliente;
    private int numCliente;

    public Banco(){
        numCliente=0;
    }

    void agregarCliente(String nom, String numCta){
        this.cliente.add(new Cliente(nom, numCta));
        numCliente++;
    }

    int obtenerNumCliente(){
        return this.numCliente;
    }

    Cliente obtenerCliente(int i){
        return cliente.get(i);
    }

    
    
    void addMoneyAll(double money){
     
        for(int i=0 ; i<cliente.size() ; i++)
            cliente.get(i).establecerCuenta(new Cuenta(money));

    }

    void imprimirCliente(){

        for(Cliente aux : this.cliente){
            System.out.println("- "+aux+" --> ");
            System.out.println("Saldo: "+aux.obtenerCuenta().consultar()+"\n");
        }

    }
    


}
