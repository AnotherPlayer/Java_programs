package com.test;

public class Converter {
    


    public int binToInt(String bin){

        Integer a = new Integer(bin);
        return Integer.valueOf(a.toString(), 2);

    }

    public String intToBinary(int num){

        return Integer.toString(num,2);

    }

    public int hexaToInt(int hexa){

        return Integer.parseInt(Integer.toHexString(hexa));

    }

    public String hexaToBin(int hexa){

        return "";

    }

    public int octalToInt(int num){

        return 0;

    }

}
