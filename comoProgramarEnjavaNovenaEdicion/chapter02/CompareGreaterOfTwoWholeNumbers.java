/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 10.- Compare greater of two whole numbers.
*/

import java.util.Scanner;

public class CompareGreaterOfTwoWholeNumbers{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0;

        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();

        if(num1==num2){
            System.out.println("Estos numeros son iguales.\n ");
        }else if(num1>num2){
            System.out.println(num1+" es mas grande.\n");
        }else{
            System.out.println(num2+" es mas grande.\n");
        }
    }//en main
}//end CompareGreaterOfTwoWholeNumbers