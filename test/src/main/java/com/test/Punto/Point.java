package com.test.Punto;

public class Point {

    private int x,y;

    public Point(){
        x = y = 1;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int a, int b){
        x = a;
        y = b;
    }

    public boolean equals(Point x) {
        
        if(x.x == this.x && x.y == this.y)
            return true;

        return false;

    }

    public String toString(){

        return "Punto: "+x+","+y;

    }

    public void show(){
        System.out.println(this+" X:"+x+" Y:"+y+"\n");
    }
    
}
