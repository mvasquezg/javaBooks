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
        
        Scanner in=new Scanner(System.in);
        int day=0; 
        int month=0;
        int year=0;

        Date date1;
        Date date2;

        System.out.println("Programa que compara dos fechas:\nIngrese la primera fecha: ");
        System.out.print("Ingrese el dia: ");
        day=in.nextInt();
        System.out.print("Ingrese el mes: ");
        month=in.nextInt();
        System.out.print("Ingrese el anho: ");
        year=in.nextInt();

        date1=new Date(day, month, year);

        System.out.print("\nIngresa la segunda fecha\nIngrese el dia: ");
        day=in.nextInt();
        System.out.print("Ingrese el mes: ");
        month=in.nextInt();
        System.out.print("Ingrese el anho: ");
        year=in.nextInt();

        date2=new Date(day, month, year);

        if(date1.equals(date2)){
          System.out.println("\nLas fechas son iguales.\n");
        }else{
          System.out.println("\nLas fechas no son iguales.\n");
        }


        



    }//end main
}//end DateApp