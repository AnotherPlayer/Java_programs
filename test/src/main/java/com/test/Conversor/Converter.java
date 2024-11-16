package com.test.Conversor;

public class Converter {
    


    public int binToInt(String bin){

        return Integer.valueOf(bin, 2);

    }

    public String intToBinary(int num){

        return Integer.toString(num,2);

    }

    public int hexaToInt(int hexa){

        return hexa;

    }

    public String hexaToBin(int hexa){

        return Integer.toBinaryString(hexa);

    }

    public int octalToInt(int oct){

        return oct;

    }

}
