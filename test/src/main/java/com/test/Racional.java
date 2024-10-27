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

    public void imprimr(){

        if(den == 1)
            System.out.println(num);
        else if(den == num)
            System.out.println("1");
        else
            System.out.println(num+"/"+den+" ");
    }

}
