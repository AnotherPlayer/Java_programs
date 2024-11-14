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

    void transfMoney(int a, int b, double cant){

    }
    
    void addMoneyAll(double money){
     
        for(int i=0 ; i<cliente.size() ; i++)
            cliente.get(i).establecerCuenta(new Cuenta(money));

    }

    void imprimirCliente(){

        int i=0;

        for(Cliente aux : this.cliente){
            System.out.println(i+"- "+aux+" --> ");
            System.out.println("Saldo: "+aux.obtenerCuenta().consultar()+"\n");
            i++;
        }

    }
    




}
