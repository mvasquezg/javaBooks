/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 40: Multiplication Table
*/

import java.util.Random;
import java.util.Scanner;


public class MultiplicationTable{
    
    static int multiplyTwoNumbers(int num1, int num2){
        return num1*num2;
    }

    static void guessMultiplication(){
        Random number1=new Random();
        Random number2=new Random();

        int multiplier=number1.nextInt(10)+1;
        int multiplying=number2.nextInt(10)+1;
        
        int result=multiplyTwoNumbers(multiplier, multiplying);
        Scanner in=new Scanner(System.in);
        int number=0;

        
        do{
            System.out.print("Cuanto es "+multiplier+" * "+multiplying+": ");
            number=in.nextInt();

            if(number==result){
                System.out.println("Muy bien!");
            }else{
                System.out.print("No. por favor intenta de nuevo!\n");
            }

        }while(number!=result);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int option=0;
        do{
            guessMultiplication();
            System.out.print("\nPresione -1 para salir del programa o cualquier otro numero para continuar: ");
            option=in.nextInt();
            System.out.print("\n");

        }while(option>=0);
        
    }//end main
}//end class MultiplicationTable