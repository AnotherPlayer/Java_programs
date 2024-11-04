package com.test;

public class Converter {
    


    public int binToInt(String bin){

        Integer a = new Integer(bin);

        int x = a.byteValue();

        return x;

    }

    public String intToBinary(int num){

        Integer a = new Integer(num);
        String x = a.toString();

        return "";

    }

    public int hexaToInt(int hexa){

        return 0;

    }

    public String hexaToBin(int hexa){

        return "";

    }

    public int octalToInt(int num){

        return 0;

    }

}
