/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: 06: A more detailed analysis.
  *Programa 03: Show the number maximun of three using the method of API Java.
*/
import java.util.Scanner;

public class MaximunValueApiJava{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        double number1=0.0, number2=0.0, number3=0.0, result=0.0;
        
        System.out.print("Escriba 3 numeros\n");
        
        System.out.print("Ingrese el primer numero: ");
        number1=in.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        number2=in.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        number3=in.nextDouble();

        System.out.println("El maximo es: "+Math.max(number1, Math.max(number2, number3)));
    }//end main

      
}//end MaximunValueApiJava