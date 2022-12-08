/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 22: Calculate Multiple of number
*/
import java.util.Scanner;

public class EvenAndOdd{
    
    static boolean isEven(int number){
        return number%2==0?true:false;
    }
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        System.out.print("Ingres un numero: ");
        number=in.nextInt();

        if(isEven(number)){
            System.out.println("El numero: "+number+" es par.");
        }else{
            System.out.println("El numero: "+number+" es impar.");
        }
    }//end main
}//end EvenAndOdd