package com.test.Interface_Ejem2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Rafael
 */
public class Ordenamiento {

    
  public static void main(String [ ] args) throws ParseException{
   List<String> nombres = Arrays.asList(
      "Francesca", "Paolo", "GregorioSamsa", "PedroParamo", "JoseBuendia",
     "Rocinante", "Quijote", "Sancho", "Rebeca", "Ursula", "Aura");
    System.out.println("Nombres: Antes sorting: " + nombres);
    Collections.sort(nombres);
    System.out.println("Despues sorting: " + nombres);
   
    List<Integer> numeros = Arrays.asList(
      10, 8, 2, 0, 5, 1, 3, 9, 7, 4, 6);
    System.out.println("numeros: Antes sorting: " + numeros);
    Collections.sort(numeros);
    System.out.println("Despues sorting: " + numeros);
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

    List<Date> fechas = new ArrayList<>();
    fechas.add(dateFormat.parse("1968-12-02"));
    fechas.add(dateFormat.parse("1968-10-02"));
    fechas.add(dateFormat.parse("1821-09-28"));
    fechas.add(dateFormat.parse("1847-09-14"));
    fechas.add(dateFormat.parse("1938-03-18"));
    fechas.add(dateFormat.parse("2014-09-26"));
    System.out.println("Fechas: Antes sorting: ");
    for (Date date : fechas) {
        System.out.println(dateFormat.format(date));
    }
    Collections.sort(fechas);
    System.out.println("Fechas: Despues sorting: ");
    for (Date date : fechas) {
      System.out.println(dateFormat.format(date));
    }
    
    }
}