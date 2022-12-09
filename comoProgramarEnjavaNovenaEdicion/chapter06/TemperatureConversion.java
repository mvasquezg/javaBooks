/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 27: Temperature Conversion
*/
import java.util.Scanner;

public class TemperatureConversion{
    
    static double converterToDegreesCelsius(double degree){
        return 5.0/9.0 * (degree-32);
    }

    static double converterToDegreesFarenheit(double degree){
        return degree*9.0/5.0 +32;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int option=0;
        double degree=0;   

        System.out.println("Opcion 1: Convertir Grados Fahrenheit a Grados Centigrados.");
        System.out.println("Opcion 2: Convertir Grados Centigrados. a Grados Fahrenheit.");
        System.out.println("Opcion 3: Salir del programa.");
        
        do{
            System.out.print("Ingrese una opcion valida del 1-3: ");
            option=in.nextInt();
        }while(option<1 || option>3);

        switch(option){
            case 1:
                    System.out.print("Ingrese los grados Farenheit: ");
                    degree=in.nextDouble();
                    System.out.println(degree+" Farenheit == "+converterToDegreesCelsius(degree)+" Centigrados");
                break;
            case 2:
                    System.out.print("Ingrese los grados Centigrados: ");
                    degree=in.nextDouble();
                    System.out.println(degree+" Centigrados == "+converterToDegreesFarenheit(degree)+" Farenheit");
                break;
            default:
                System.out.println("Adios");
                break;        
        }//end switch

    }//end main

}//end TemperatureConversion