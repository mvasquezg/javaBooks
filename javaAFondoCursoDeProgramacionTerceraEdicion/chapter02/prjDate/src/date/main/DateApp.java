/**
  *Book: Java in depth programming course
  *Chapter 02: Classes and Objects.
  *Programa 01: Date App

  --------------- Comando para compilar desde la consola en paquetes ---------------
  $> javac -sourcepath ./src/ -d ./bin/ ./src/date/main/DateApp.java

  Para ejecutar desde la consola, se debe posicionar en el pathc antes del nombre del paquete
  y desde ahi ejecutar el comando.
  java -cp Documents/javaBooks/javaAFondoCursoDeProgramacionTerceraEdicion/chapter02/prjDate/bin/ date.main.DateApp

*/
package date.main;

import java.util.Scanner;
//import date.controller.Date;
import date.controller.DetailsDate;

public class DateApp{
    public static void main(String[] args){
        
      /*Scanner in=new Scanner(System.in);
      String sDate="";
      Date dDate;

      System.out.print("Ingresa la fecha (dd/mm/aaaa): ");
      sDate=in.next();
      dDate=new Date(sDate);

      System.out.println("La fecha ingresada es: "+dDate);

      System.out.print("Ingrese numero de dias a sumar: ");
      int numDays=in.nextInt();

      dDate.addDays(numDays);

      System.out.println("Sumando: "+numDays+" dias; la fecha queda: "+dDate);
      */
      DetailsDate date=new DetailsDate();

      date.setDay(2);
      date.setMonth(10);
      date.setYear(1985);

      System.out.println(date);
    }//end main
}//end DateApp