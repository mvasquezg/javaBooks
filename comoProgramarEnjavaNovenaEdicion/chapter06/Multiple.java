/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 21: Calculate Multiple of number
*/
import java.util.Scanner;

public class Multiple{

    static boolean isMultiple(int num1, int num2){
        if(num1%num2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number1=0, number2=0; 

        System.out.print("Ingresa el primer numero: ");
        number1=in.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        number2=in.nextInt();

        System.out.println();           
        if(isMultiple(number1, number2)){
            System.out.println("El numero: "+number2+" es multiplo de: "+number1);
        }else{
            System.out.println("El numero: "+number2+" no es multiplo de: "+number1);
        }
    }//end main
}///end Multiple