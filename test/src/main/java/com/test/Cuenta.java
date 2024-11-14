package com.test;

public class Cuenta {

    public double saldo;

//Constructor
    public Cuenta(double saldoInicial){
        saldo = saldoInicial;
    }

//Metodos
    double consultar(){
        return saldo;
    }
    
    void depositar(double monto){
       saldo = saldo + monto;
    }

    void retirar(double monto ){
        if ( saldo >= monto )
            saldo-=monto;
        
        else
            System.out.println("Saldo insuficiente");
        
    }

}
