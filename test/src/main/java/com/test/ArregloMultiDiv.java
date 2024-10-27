package com.test;

class MultiDimArrayDemo {

    public static void main(String[ ] args) {

    String [ ] [ ] names = {
    {"Mr. ", "Mrs. ", "Ms. "},
    {"Smith", "Jones"}
    };

    char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
    'i', 'n', 'a', 't', 'e', 'd' };
    char[] copyTo = new char[7];

    // Mr. Smith
    System.out.println(names[0][0] + names[1][0]);
    // Ms. Jones
    System.out.println(names[0][2] + names[1][1]);

    System.out.println();

    System.arraycopy(copyFrom, 2, copyTo, 0, 7);
    System.out.println(new String(copyTo));

    }

}

//Testing git push works