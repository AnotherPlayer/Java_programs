package com.test.Banco;

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

        System.out.println("\n\n\t|---Banco---|\n");

        Banco b = new Banco();

        //Saldo inicial

        b.agregarCliente("David", "3310");
        b.agregarCliente("Hector", "5002");
        b.agregarCliente("Didier", "1494");

        b.addMoneyAll(1500);

        System.out.println("\n------------------------------\n");

        b.showSaldo("Didier");
        b.addMoneyOne("Didier", 500);
        b.showSaldo("Didier");
        b.removeMoneyOne("Didier", 400);
        b.showSaldo("Didier");

        System.out.println("\n------------------------------\n");

        b.imprimirCliente();

        //Transferencias

        b.transfMoney(0, 1, 2000);
        b.transfMoney(2, 0, 150);
        b.transfMoney("Hector", "Didier", 800);

        System.out.println("Numero de clientes --> "+b.obtenerNumCliente());
        b.imprimirCliente();

        b.quitarCliente(2);
        b.imprimirCliente();

        b.quitarCliente("David");
        b.imprimirCliente();

    }   
}
