package com.test;

public class MainConverter {

    public static void main(String[] args) {
        
        Converter conv = new Converter( );
        //Convierte un binario en representación de cadena a un entero
        int dat = conv.binToInt("1011001");
        System.out.println("Dato --> "+dat);
        //Convierte un entero a un binario representado por una cadena
        String cad = conv.intToBinary(2534);
        //Convierte un hexadecimal a un entero
        int num = conv.hexaToInt(0xF5A2);
        //Convierte un hexadecimal a un binario representado por una cadena
        String bin = conv.hexaToBin(0xA1B5);
        //Convierte un octal a un entero
        int val = conv.octalToInt(02531);

    }
    
}