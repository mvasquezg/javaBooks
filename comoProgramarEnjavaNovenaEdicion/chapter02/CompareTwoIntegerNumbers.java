/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 06.- Compare two integer numbers.
*/
import java.util.Scanner;

public class CompareTwoIntegerNumbers{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();

        if(num1==num2){
            System.out.println(num1+" == "+num2);
        }

        if(num1!=num2){
            System.out.println(num1+" != "+num2);
        }

        if(num1<num2){
            System.out.println(num1+" < "+num2);
        }

        if(num1>num2){
            System.out.println(num1+" > "+num2);
        }

        if(num1<=num2){
            System.out.println(num1+" <= "+num2);
        }

        if(num1>=num2){
            System.out.println(num1+" >= "+num2);
        }
    }//end main
}//CompareTwoIntegerNumbers