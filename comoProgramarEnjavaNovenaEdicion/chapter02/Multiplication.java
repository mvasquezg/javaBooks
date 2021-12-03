/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 07.- Multiplication of two integers numbers.
*/

import java.util.Scanner;

public class Multiplication{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int result=0, num1=0, num2=0;

        System.out.print("Programa que calcula la multiplicacion de dos numeros enteros.\nIngrese el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2=in.nextInt();

        result=num1*num2;

        System.out.println(num1+" * "+num2+" = "+ result);

    }//end main

}//end Multiplication