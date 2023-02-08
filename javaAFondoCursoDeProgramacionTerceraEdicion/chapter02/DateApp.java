/**
  *Book: Java in depth programming course
  *Chapter 02: Classes and Objects.
  *Programa 01: Date App
*/
import java.util.Scanner;

public class DateApp{
    public static void main(String[] args){
        /*date.setDay(2);
        date.setMonth(10);
        date.setYear(1970);*/

        /*System.out.println("Dia = "+date.getDay());
        System.out.println("Mes = "+date.getMonth());
        System.out.println("Anho = "+date.getYear());

        System.out.println("\nFecha: "+date);*/

        /*System.out.println("Programa que compara dos fechas:\nIngrese la primera fecha: ");
        System.out.print("Ingrese el dia: ");
        day=in.nextInt();
        System.out.print("Ingrese el mes: ");
        month=in.nextInt();
        System.out.print("Ingrese el anho: ");
        year=in.nextInt();

        date1=new Date(day, month, year);
        
        if(date1.equals(date2)){
          System.out.println("\nLas fechas son iguales.\n");
        }else{
          System.out.println("\nLas fechas no son iguales.\n");
        }

        */

        /*Scanner in=new Scanner(System.in);
        int day=0; 
        int month=0;
        int year=0;

        Date date1=new Date(25, 10, 1970);
        Date date2=new Date("26/12/2008");
        Date date3=new Date();

        System.out.print("\nIngresa fecha\nIngrese el dia: ");
        date3.setDay(in.nextInt());
        System.out.print("Ingrese el mes: ");
        date3.setMonth(in.nextInt());
        System.out.print("Ingrese el anho: ");
        date3.setYear(in.nextInt());

        System.out.println("Fecha pasado por parametros en el constructor: "+date1);
        System.out.println("Fecha pasado por parametros en el constructor que recibe string: "+date2);
        System.out.println("Fecha pasado por metodos set: "+date3);
        */
      Scanner in=new Scanner(System.in);
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






    }//end main
}//end DateApp