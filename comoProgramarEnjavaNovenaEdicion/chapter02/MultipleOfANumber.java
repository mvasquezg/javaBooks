/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 15.- Shows on the screen if given two numbers the first is a Multiple of the second 
*/
import java.util.Scanner;

public class MultipleOfANumber{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number1=0, number2=0;

        System.out.print("Programa que determina si el primer numero es multiplo del segundo.\nIngrese el primer numero: ");
        number1=in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        number2=in.nextInt();

        if(number1%number2==0){
            System.out.println(number1+" es multiplo de "+number2);
        }else{
            System.out.println(number1+" no es multiplo de "+number2);
        }


    }//end main

}//end MultipleOfANumber