package com.test;

public class USB {
    
    public static int numUSB=0;

    public int num,cap;
    public String modelo;

    public USB(){
        num = numUSB+1;
        cap = 180;
        modelo = "N/A";
        numUSB++;
    }

    public USB(int cap,String mod){
        num = numUSB+1;
        this.cap = cap;
        this.modelo = mod;
        numUSB++;
    }

}
