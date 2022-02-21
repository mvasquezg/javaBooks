/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 14.- Shows on the screen if an integer is even or odd
*/
import java.util.Scanner;

public class NumberEvenOrOdd{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number;

        System.out.print("Programa que determina si un numero es par o impar.\n\nIngrese un numero: ");
        number=in.nextInt();

        if(number%2==0){
            System.out.println("El numero: "+number+" es par");
        }else{
            System.out.println("El numero: "+number+" es impar");
        }
    }//end main

}//end NumberEvenOrOdd