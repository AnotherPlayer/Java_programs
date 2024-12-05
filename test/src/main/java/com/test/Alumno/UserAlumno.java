/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.useralumno;

/**
 *
 * @author renat
 */
public class UserAlumno {

    public static void main(String[] args) {
        	Alumno FD = new Alumno();
		FD.estabNom("Frida Kalho");
		FD.estabPeso(60.4);
		FD.estabTalla(1.60);
		FD.estabEdad(35);
		System.out.println(FD);
		Alumno DR = new Alumno();
		DR.estabNom("Diego Rivera");
		DR.estabPeso(120.5);
		DR.estabTalla(1.70);
		DR.estabEdad(50);
		System.out.println(DR); 
    }
}
