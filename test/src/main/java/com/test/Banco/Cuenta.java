package com.test.Banco;

public class Cuenta {

    private double saldo = 0;

//Constructor
    public Cuenta(double saldoInicial){
        this.saldo = saldoInicial;
    }

//Metodos
    public double consultar(){
        return saldo;
    }
    
    public void depositar(double monto){
       saldo += monto;
    }

    public void retirar(double monto ){
        if ( consultar() >= monto )
            saldo -= monto;
        
        else
            System.out.println("Saldo insuficiente");
        
    }

}
