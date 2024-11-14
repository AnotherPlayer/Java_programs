package com.test;

import java.util.Random;

public class Matriz {
    private String nom;
    private int filas;
    private int columnas;
    private int[][] matriz;

    public static void main(String[] args) {
        Matriz M1 = new Matriz();
        M1.establecer("M1", 3, 4);
        M1.imprimir();

        Matriz M2 = new Matriz();
        M2.establecer("M2", 4, 3);  
        M2.imprimir();

        Matriz Msuma = suma(M1, M2);
        if (Msuma != null) {
            Msuma.imprimir();
        }

        
        Matriz Mproducto = producto(M1, M2);
        if (Mproducto != null) {
            Mproducto.imprimir();
        }
    }

    public static Matriz suma(Matriz A, Matriz B) {
        if (A.filas != B.filas || A.columnas != B.columnas) {
            System.out.println("Las filas y columnas deben ser iguales para poder sumar las matrices");
            return null;
        } else {
            Matriz resultado = new Matriz();
            resultado.establecer("Msuma", A.filas, A.columnas);

            for (int i = 0; i < A.filas; i++) {
                for (int j = 0; j < A.columnas; j++) {
                    resultado.matriz[i][j] = A.matriz[i][j] + B.matriz[i][j];
                }
            }
            return resultado;
        }
    }

  
    public static Matriz producto(Matriz A, Matriz B) {
        if (A.columnas != B.filas) {
            System.out.println("El número de columnas de la matriz 1 debe ser igual al número de filas de la matriz 2");
            return null;
        } else {
            Matriz resultado = new Matriz();
            resultado.establecer("Mproducto", A.filas, B.columnas);

           
            for (int i = 0; i < A.filas; i++) {
                for (int j = 0; j < B.columnas; j++) {
                    int acum = 0;
                    for (int k = 0; k < A.columnas; k++) {
                        acum += A.matriz[i][k] * B.matriz[k][j];
                    }
                    resultado.matriz[i][j] = acum;
                }
            }
            return resultado;
        }
    }

   
    public void establecer(String nom, int filas, int columnas) {
        this.nom = nom;
        if (filas < 0) this.filas = 0;
        else this.filas = filas;

        if (columnas < 0) this.columnas = 0;
        else this.columnas = columnas;

        this.matriz = new int[this.filas][this.columnas];
        Random random = new Random();
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                this.matriz[i][j] = random.nextInt(10); 
            }
        }
    }

   
    public void imprimir() {
        System.out.println("MATRIZ: " + this.nom);
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                System.out.print(" " + this.matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
