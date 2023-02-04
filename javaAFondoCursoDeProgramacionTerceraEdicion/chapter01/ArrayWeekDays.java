/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 14: Using Arrays of strings for Weekdays.
*/
import java.util.Scanner;

public class ArrayWeekDays{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String[] arrayDays={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int day=0;

        System.out.print("Ingrese un numero entre 1 y 7, para identificar el nombre del dia: ");
        day=in.nextInt();

        if(day<=arrayDays.length){
            System.out.println("\n"+arrayDays[day-1]);
        }else{
            System.out.println("Dia incorrecto.");
        }

        System.out.println();
    }//end main
}//end ArrayWeekDays
