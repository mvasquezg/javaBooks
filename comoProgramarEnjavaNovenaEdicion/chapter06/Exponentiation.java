/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 19: Calculate Exponentiation.
*/
import java.util.Scanner;
public class Exponentiation{

    public static long calculateExponentiation(long base, long exponent){
        long result=1;

        for(int i=1; i<=exponent; i++){
            result*=base;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int base=0, exponent=0;

        System.out.print("Ingresa la base: ");
        base=in.nextInt();

        System.out.print("ingresa el Exponente: ");
        exponent=in.nextInt();

        System.out.println(base+" ^ "+exponent+" = "+calculateExponentiation(base, exponent));
    }//end main
}//end Exponentiation