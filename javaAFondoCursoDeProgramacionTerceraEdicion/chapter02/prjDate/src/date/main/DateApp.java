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
import date.controller.Date;
import date.controller.DetailsDate;
import date.controller.DateTime;
import date.showGrouping.ShowGrouping;
import date.instance.Person;

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
      
      /*DetailsDate date=new DetailsDate();
      Object date2=new DetailsDate("26/12/2008");
      date.setDay(2);
      date.setMonth(10);
      date.setYear(1985);

      System.out.println("Fecha "+date);
      System.out.println("Obejto "+date2+"\n");*/

      /*Object[] arrayObj={
        new Date(2, 10, 1970),
        new DetailsDate("23/10/1948"),
        new String("Esto es una cadena"),
        new Integer(34)
      };

      ShowGrouping.showGrouping(arrayObj);
      */

      //DetailsDate d=new DetailsDate(25, 10, 2008);
      //DateTime d=new DateTime("25/10/2008", 14, 30, 10);
      //System.out.println(d);

      /*DetailsDate d=new DetailsDate(15, 10, 2025);
      System.out.println(d);*/

      Person p1=new Person("Miguel", "VAGM851001HTCSRG07", new DetailsDate(01,10,1985));

      Person p2=new Person("Carolina", "GACC880520MTCRSR01", new DetailsDate(20,05,1988));

      System.out.println(p1);
      System.out.println(p1);
      System.out.println(p1);

      System.out.println("------------------");

      System.out.println(p2);
      System.out.println(p2);

      System.out.println("------------------");

      System.out.println(p1);
      System.out.println(p1);

    }//end main
}//end DateApp