/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 11: Using Constants
*/
import java.util.Scanner;

public class DemoConstant{
    
        static final int LUNES=1;
        static final int MARTES=2;
        static final int MIERCOLES=3;
        static final int JUEVES=4;
        static final int VIERNES=5;
        static final int SABADO=6;
        static final int DOMINGO=7;


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        

        int day=0;
        String nameDay="";

        System.out.print("Ingrese un numero entre 1 y 7: ");
        day=in.nextInt();

        switch(day){
            case LUNES:
                nameDay="Lunes";
                break;
            case MARTES:
                nameDay="Martes";
                break;
            case MIERCOLES:
                nameDay="Miercoles";
                break;
            case JUEVES:
                nameDay="Jueves";
                break;
            case VIERNES:
                nameDay="Viernes";
                break;
            case SABADO:
                nameDay="Sabado";
                break;
            case DOMINGO:
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
}//end DemoConstant
