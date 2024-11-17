package com.test.Banco;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> cliente = new ArrayList<>();
    private int numCliente;

    public Banco(){
        numCliente=0;
    }

    void agregarCliente(String nom, String numCta){
        cliente.add(new Cliente(nom, numCta));
        numCliente++;
    }

    void quitarCliente(int i){
        System.out.println("Cliente "+cliente.remove(i).obtenerNombre()+" removido");
        numCliente--;
    }

    void quitarCliente(String x){

        
        for(Cliente aux : cliente){
            if(aux.obtenerNombre().equals(x)){
                System.out.println("Cliente "+aux.obtenerNombre()+" removido");
                cliente.remove(aux);
                numCliente--;
            }
        }
                

    }

    int obtenerNumCliente(){
        return this.numCliente;
    }

    Cliente obtenerCliente(int i){
        return cliente.get(i);
    }

    Cliente obtenerCliente(String x){
        
        for(Cliente aux : cliente){
            if(aux.obtenerNombre().equals(x))
                return aux;
        }

        return null;

    }
    
    void addMoneyAll(double money){
     
        for(int i=0 ; i<cliente.size() ; i++)
            cliente.get(i).establecerCuenta(new Cuenta(money));

    }

    void transfMoney(int a, int b, double cant){

        Cliente x = new Cliente(this.obtenerCliente(a));
        Cliente y = new Cliente(this.obtenerCliente(b));

        transfDone(x, y, cant);

    }

    void transfMoney(String a, String b, double cant){

        Cliente x = new Cliente(this.obtenerCliente(a));
        Cliente y = new Cliente(this.obtenerCliente(b));

        transfDone(x, y, cant);

    }

    void transfDone(Cliente x, Cliente y, double cant){

        if(x.obtenerCuenta().consultar() < cant){
            System.out.println("El cliente "+x.obtenerNombre()+" no tiene suficiente saldo \n");
            return;
        }

        x.obtenerCuenta().retirar(cant);
        y.obtenerCuenta().depositar(cant);

        System.out.println("Transferencia exitosa");
        System.out.println(x.obtenerNombre()+" --> "+x.obtenerCuenta().consultar());
        System.out.println(y.obtenerNombre()+" --> "+y.obtenerCuenta().consultar()+"\n");

    }

    void imprimirCliente(){

        int i=0;

        for(Cliente aux : this.cliente){
            System.out.print((i+1)+".- "+aux+"\t--> Saldo: "+aux.obtenerCuenta().consultar()+"\n");
            i++;
        }

        System.out.println();
    }
    
}
