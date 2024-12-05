/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.useralumno;

/**
 *
 * @author renat
 */
public class Alumno {
  	private String nombre;
	private String boleta;
	private int edad;
	private double peso;
	private double talla;
	
	public Alumno(){
	}
	
	public Alumno(String nom){
		if(checkNom(nom))
			nombre = nom;
		else
			System.out.println("El nombre = " + nom + " no es v�lido!!!");	
	}
	
	public Alumno(String nom, String bol){
		if(checkNom(nom))
			nombre = nom;
		else
			System.out.println("El nombre = " + nom + " no es v�lido!!!");	
	    if(checkBol(bol))
			boleta = bol;
	    else
	    	System.out.println("La boleta = " + bol + " no es v�lida!!!");
 	}   
	public void estabNom(String nom){
		if(checkNom(nom))
			nombre = nom;
	}
	
	public void estabBol(String bol){
		if(checkBol(bol)){
			boleta = bol;
	    }
	}    
	public void estabEdad(int e){
		if(e >= 17 && e <= 50 )
			edad = e;
		else
			System.out.println("La edad = " + e + " no es v�lida!!!");
	}
	
	public void estabPeso(double p){
		if(p >= 40.0 && p <= 150.0 )
			peso = p;
		else
			System.out.println("El peso = " + p + " no es v�lido!!!");
	}
	
	public void estabTalla(double t){
		if(t >= 1.0 && t <= 2.30 )
			talla = t;
		else
			System.out.println("La talla = " + t + " no es v�lida!!!");
	}
	 
	private boolean checkNom(String nom){
		for(int i = 0; i < nom.length(); i++)
			if(Character.isLetter(nom.charAt(i)))
				continue;
			else if(nom.charAt(i)== ' ' ) //Es espacio: OK
					continue;
			     else return false;
		return true;		
	}
	
	private boolean checkBol(String bol){
		if(bol.length() != 10) return false; 
		for(int i = 0; i < bol.length(); i++)
			if(Character.isDigit(bol.charAt(i)))
				continue;
			else return false;
		return true;
	}
	
	public String IMC(){
		double imc;
		
		imc = peso/Math.pow(talla,2.0);
		if(imc < 16.0) return "Delgadez severa";
		if(imc >= 16.0 && imc <= 16.99) return "Delgadez moderada";
		if(imc >= 17.0 && imc <= 18.49) return "Delgadez leve";
		if(imc >= 18.5 && imc <= 24.99) return "Normal";
		if(imc >= 25.0 && imc <= 29.99) return "PreObeso";
		if(imc >= 30.0 && imc <= 34.99) return "Obesidad leve";
		if(imc >= 35.0 && imc <= 39.99) return "Obesidad media";
		if(imc >= 40.0) return "Obesidad m�rbida";
		return "Error en IMC";	
	}
	
	public String toString(){
		double var = peso/Math.pow(talla,2.0);
		System.out.printf("\n talla = %.3f  peso = %.3f IMC = %.3f\n",talla, peso,  var);
		return "Nombre: " + nombre + " Boleta = " + boleta + " Edad: " + edad + " Talla: " + talla + " m" + "  Clasificaci�n IMC: " + IMC();
	}
    
    
    
}
