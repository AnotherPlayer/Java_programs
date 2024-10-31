package com.test;

public class Racional{

    private int num,den;

    //Constructores

    public Racional(){  //Caso de que "Racional" no tenga parámetros
        num = 1;
        den = 1;
    }
    
    public Racional(int n, int d) { //Caso de que "Racional" si tenga parámetros
        num = n;
        if(d==0)
            den = 1;
        else
            den = d;
    }

    public Racional(Racional a){
        num = a.num;
        den = a.den;
    }

    public Racional(int n){
        if(n==0)
            num=den=1;
        else{
            num=n;
            den=1;
        }
    }

    // Métodos

    public void establecer(int num, int den) {
        
        this.num = num;
        
        if(den==0)
            this.den = 1;
        else
            this.den = den;
    }

    public void establecer(Racional a) {
        
        this.num = a.num;
        
        if(den==0)
            this.den = 1;
        else
            this.den = a.den;
    }

    public void suma(Racional a, Racional b){

        num = a.num + b.num;
        den = a.den + b.den;

        simplificar(this);

    }

    public void suma(int a, int b){

        num += a;
        den += b;

        simplificar(this);

    }

    public void resta(Racional a, Racional b){

        num = a.num - b.num;
        den = a.den - b.den;

        simplificar(this);

    }

    public void producto(Racional a, Racional b){

        num = a.num * b.den;
        den = a.den *b.num;

        simplificar(this);

    }

    public Racional producto(Racional a){

        num *= a.num;
        den *= a.den;

        simplificar(this);

        return this;

    }    

    public void producto(int a, int b){

        num *= a;
        den *= b;

        simplificar(this);

    }

    public void division(Racional a, Racional b){

        num = a.num * b.num;
        den = a.den * b.den;

        simplificar(this);

    }

    public Racional division(Racional a){

        num *= a.den ;
        den *= a.num ;

        simplificar(this);

        return(this);

    }

    private void simplificar(Racional x){

        int n=2,neg=0;

        if(x.den<0 && x.num<0){
            x.den *=(-1);
            x.num *=(-1);
            neg = 1;
        }

        while(x.den >= n || x.num >= n){

            if( x.num % n == 0 && x.den % n == 0 ){
                x.num /= n;
                x.den /= n;
                n = 2;
            }
            n++;

        }

        if(neg == 1){
            x.den *=(-1);
            x.num *=(-1);
            neg = 0;
        }

        
    }

    public void potencia(int n){

        num = (int) Math.pow(num, n);
        den = (int) Math.pow(den, n);

        simplificar(this);
        

    }

    public Racional mayorElem(Racional []a){

        Racional b = new Racional(a[0]);

        for(int i=0 ; i<a.length-1 ; i++){

            if((float)(b.num/b.den) < (float)(a[i+1].num/a[i+1].den))
                b = new Racional(a[i+1]);
            
        }

        this.establecer(b);

        return b;

    }

    public Racional menorElem(Racional []a){

        Racional b = new Racional(a[0]);

        for(int i=0 ; i<a.length-1 ; i++){

            if((float)(b.num/b.den) > (float)(a[i+1].num/a[i+1].den))
                b = new Racional(a[i+1]);
            
        }

        this.establecer(b);

        return b;

    }

    public boolean equals(Racional a){

        if(a.num == this.num && a.den == this.den)
            return true;

        return false;
        
    }
    
    public Racional modaElem(Racional[] a){

        int maximoNumRepeticiones= 0;
        Racional moda = new Racional();
    
        for(int i=0 ; i<a.length ; i++){
            int numRepeticiones= 0;
            for(int j=i+1 ; j<a.length ; j++){
                if(a[i].equals(a[j])){
                    numRepeticiones++;
                    System.out.println("Repiten = i --> "+i+", j --> "+j);
                }
                    
                if(numRepeticiones > maximoNumRepeticiones){
                    moda.establecer(a[i]);
                    maximoNumRepeticiones = numRepeticiones;
                }   
            }
        }

        System.out.println("Valor de maxNumRept --> "+maximoNumRepeticiones+"\n");

        if(maximoNumRepeticiones == 0)
            return moda = new Racional(111111);

        return moda;

    }

    public boolean comparacion(Racional[] a, Racional[] b){

        if(a.length != b.length)
            return false;

        for(int i=0 ; i < a.length ; i++){
            if(!(a[i].equals(b[i])))
                return false;
        }

        return true;

    }

    public void imprimr(){

        //if(den == 1)
        //    System.out.println(num);
        //else if(den == num)
        //    System.out.println("1");
        //else
            System.out.println(num+"/"+den+" ");

    }

    //Metodos para ejemplos realizados por el profe

    public void testOp(Racional a, Racional b, Racional c, Racional d){

        System.out.println();

        System.out.print("A->");
        a.imprimr();
        System.out.print("B->");
        b.imprimr();
        System.out.print("C-> ");
        c.imprimr();
        System.out.print("D->");
        d.imprimr();
        System.out.println();

        c.suma(a, b);
        System.out.print("A+B-> ");
        c.imprimr();

        c.suma(5,3);
        System.out.print("A+B-> ");
        c.imprimr();

        c.resta(a, b);
        System.out.print("A-B-> ");
        c.imprimr();

        c.producto(a, b);
        System.out.print("A*B-> ");
        c.imprimr();

        c.producto(a);
        System.out.print("C*A-> ");
        c.imprimr();

        c.division(a, b);
        System.out.print("A/B-> ");
        c.imprimr();

        d.potencia(2);
        System.out.print("D^2-> ");
        d.imprimr();

    }
    
    public void ejemProfe(Racional a, Racional b, Racional c){

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        System.out.println("\nProfe casos\n");

        a.producto(1, 2);
        System.out.print("A*1/2-> ");
        a.imprimr();

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        a.producto(b.producto(c));
        System.out.print("A*(B*C)-> ");
        a.imprimr();

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        a.division(b);
        System.out.print("A/B-> ");
        a.imprimr();

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        a.division(b,c);
        System.out.print("B/C-> ");
        a.imprimr();

        a.establecer(3, 5);
        b.establecer(5, 2);
        c.establecer(8, 3);

        a.division(b.division(c));
        System.out.print("A/(B/c)-> ");
        a.imprimr();

    }


}
