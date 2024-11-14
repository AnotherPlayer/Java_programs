package com.test;

public class Bankito {

    public static void main(String [ ] args){

        Cuenta ctaAux;
        //Creamos el cliente “El Quijote”
        // con un num. de cuenta: QX400
        Cliente qx = new Cliente ("El Quijote", "QX400");
        //Creamos su cuenta con saldo de 550.45
        qx.establecerCuenta(new Cuenta (550.45));
        //Obtenemos la cuenta del Quijote
        //y la asignamos a la referencia ctaAux
        ctaAux = qx.obtenerCuenta( );
        //Ahora depositamos 300.55 pesos a cuenta del Quijote
        ctaAux.depositar(300.55);
        //Ahora imprimimos toda la información del Quijote
        System.out.println("Nombre Cliente:" + qx.obtenerNombre( ));
        System.out.println("Num cuenta:" + qx.obtenerNumCta( ));
        System.out.println("Saldo:" + ctaAux.consultar( ));

        System.out.println("\n***New Client***\n");
        
        Cliente a = new Cliente("Sancho Panza", "SPANZA");
        a.establecerCuenta(new Cuenta(100.35));

        a.obtenerCuenta().retirar(100);

        System.out.println("Nombre Cliente:" + a.obtenerNombre());
        System.out.println("Num cuenta:" + a.obtenerNumCta());
        System.out.printf("Saldo: %f",a.obtenerCuenta().consultar());

        System.out.println("\n---Banco---\n");

        Banco b = new Banco();

    }   
}
