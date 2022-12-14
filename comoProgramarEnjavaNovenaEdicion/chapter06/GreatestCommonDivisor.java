/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 32: Greatest Common Divisor.
*/
import java.util.Scanner;

public class GreatestCommonDivisor{
    
    static void calculateGreatestCommonDivisor(int number1, int number2){
        int divisor=number2, dividendo=number1, cociente=0, residuo=0, mcd=0;

        cociente=dividendo/divisor;
        residuo=dividendo%divisor;

        do{
            System.out.println(dividendo+" = "+divisor+" * "+cociente+" + "+residuo);
            dividendo=divisor;
            divisor=residuo;
            
            cociente=dividendo/divisor;
            residuo=dividendo%divisor;
            
            if(residuo>0){
                mcd=residuo;
            }
            

        }while(residuo!=0);

        System.out.println("\nEl maximo conmun divisor = "+mcd);
    }
   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number1=0, number2=0;
        
        System.out.print("Ingrese el primer numero: ");
        number1=in.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        number2=in.nextInt();

        calculateGreatestCommonDivisor(number1, number2);
    }
}//end GreatestCommonDivisor