/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 15: Calculate Rounding Number at next number.
*/
import java.util.Scanner;

public class RoundingNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double x=0;

        System.out.print("Ingrese un numero: ");
        x=in.nextDouble();

        System.out.println("El numero "+x+" redondeado: "+(1+Math.floor(x)));
    }//end main
}//end RoundingNumber