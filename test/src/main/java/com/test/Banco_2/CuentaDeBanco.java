package com.test.Banco_2;

public class CuentaDeBanco{

	@SuppressWarnings("unused")
	private long dollars;        //tipo de acceso es default o paquete: las clases de este paquete tienen acceso
	@SuppressWarnings("unused")
	private int cents;
	
	// byte - 8 bits
	// short - 16 bits
	// int - 32 bits
	// long - 64 bits
	
	// Clase interna
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public class Efectivo{       //Si el tipo de acceso cambia a public se pueden crear objetos en la clase usuaria
	
		private long dollars;
		private int cents;
		
		public Efectivo(String stringMonto){   // "38.45"
			abortarNull(stringMonto);
			int length = stringMonto.length();
			dollars = Long.parseLong(stringMonto.substring(0,length-3));
			cents = Integer.parseInt(stringMonto.substring(length-2, length));
		}
	
	
		public String getMonto(){
			if(cents > 9)
				return (dollars + "." + cents);
			else
				return (dollars + ".0" + cents);
		}

		public void agregar(Efectivo nuevoMonto){
			abortarNull(nuevoMonto);
			int newCents = (cents + nuevoMonto.cents)%100;
			long carry = (cents + nuevoMonto.cents)/100;
			cents = newCents;
			dollars = dollars + nuevoMonto.dollars + carry;
		}
		
		public void agregar(String nuevoMonto){
			int length = nuevoMonto.length();
			long moreDollars = Long.parseLong(nuevoMonto.substring(0,length-3));
			int moreCents = Integer.parseInt(nuevoMonto.substring(length-2, length));
			//*****
			int newCents = (cents + moreCents)%100;
			long carry = (cents + moreCents)/100;
			cents = newCents;
			dollars = dollars + moreDollars + carry;
			
		}

		private void abortarNull(Object o){
			if(o == null)
			{
				System.out.println("Argumento null invalido.");
				System.exit(0);
			}
		}
	 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
   } //Fin de la clase interna
  
  private Efectivo saldo;
  
  public CuentaDeBanco(){
	/*Para invocar un método no estático de la clase interna 
      desde la clase externa, se requiere crear un objeto
      de la clase interna. */	
	saldo = new Efectivo("0.00");  
  }
  
  public String getSaldo()
  {
	/*Para invocar un método no estático de la clase interna 
      desde la clase externa, se requiere crear un objeto
      de la clase interna. */
	return saldo.getMonto(); // Este método es accesible aún si es privado  
  }
  
  public void hacerDeposito(String depositarMonto)
  {
	//saldo.agregar(new Efectivo(depositarMonto));
	saldo.agregar(depositarMonto);
  }
  	
  public void cerrarCuenta()
  {
	  //La clase externa tiene acceso a las variables de instancia 
	  // privadas de la clase interna.
	  saldo.dollars = 0;
	  saldo.cents = 0;
  }	
}