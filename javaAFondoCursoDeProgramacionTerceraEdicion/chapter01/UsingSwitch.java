/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 07: Using witch sentence.
*/
import java.util.Scanner;

public class UsingSwitch{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int day=0;
        String nameDay="";

        System.out.print("Ingrese un numero entre 1 y 7: ");
        day=in.nextInt();

        switch(day){
            case 1:
                nameDay="Lunes";
                break;
            case 2:
                nameDay="Martes";
                break;
            case 3:
                nameDay="Miercoles";
                break;
            case 4:
                nameDay="Jueves";
                break;
            case 5:
                nameDay="Viernes";
                break;
            case 6:
                nameDay="Sabado";
                break;
            case 7:
                nameDay="Domingo";
                break;
            default:
                nameDay="\nEl numero ingresado no corresponde a algun dia de la semana";
                break;                                 
        }//end switch 

        if(day>0 && day<=7){
            System.out.println("\nEl numero "+day+" represnta el dia: "+nameDay);
        }else{
            System.out.println(nameDay);
        }

    }//end main
}//end UsingSwitch