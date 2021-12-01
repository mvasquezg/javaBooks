/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 05.- Sum of two integer numbers.
*/

import java.util.Scanner;

public class SumTwoInt{
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int num1=0, num2=0, sum=0;

        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();

        sum=num1+num2;

        System.out.println("La suma de dos numeros es igual a: "+sum);

    }//end main
}//end SumTwoInt