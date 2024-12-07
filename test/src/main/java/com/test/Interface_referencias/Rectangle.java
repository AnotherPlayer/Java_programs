package com.test.Interface_referencias;

import java.io.IOException;
import java.nio.CharBuffer;

import com.test.Punto.Point;

public class Rectangle implements Readable {

    public int width= 0;
    private int heigth= 0;
    public Point origin;
    
    public Rectangle(Point p, int w, int h) {
        origin= p; width= w; heigth= h;
    }

    public int getArea( ){
        return width* heigth;
    }

    public int isLargerThan(Readable other) {
    Rectangle otherRect= (Rectangle) other;
    if( this.getArea( ) < otherRect.getArea( ) )
        return -1;

    else if( this.getArea() > otherRect.getArea() )
        return 1;
    
    else
        return 0;

    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
    
}
