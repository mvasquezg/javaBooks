/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 20: Calculate Hypotenuse
*/
import java.util.Scanner;

public class Hypotenuse{
    
    static double calculateHypotenuse(double b, double c){
        double a=0;

        a=Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));

        return a;
    }
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double b=0, c=0;
        System.out.print("Ingresa el primer valor: ");
        b=in.nextDouble();

        System.out.print("Ingresa el segundo valor: ");
        c=in.nextDouble();

        System.out.println("\nLa hipotenusa de "+b+" y "+c+" es igual a: "+calculateHypotenuse(b, c));

    }//end main
}//end Hypotenuse