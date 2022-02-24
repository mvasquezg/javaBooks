/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 21.- Given 5 numbers show the amount of positive, negative and zero numbers.
*/
import java.util.Scanner;

public class NegativePositiveAndCeroValues{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int number1=0, number2=0, number3=0, number4=0, number5=0, positiveValue=0, negativeValue=0, zeroValue=0; 

        System.out.print("Ingresa el primer valor: ");
        number1=in.nextInt();

        System.out.print("Ingresa el segundo valor: ");
        number2=in.nextInt();

        System.out.print("Ingresa el tercer valor: ");
        number3=in.nextInt();

        System.out.print("Ingresa el cuarto valor: ");
        number4=in.nextInt();

        System.out.print("Ingresa el quinto valor: ");
        number5=in.nextInt();

        if(number1==0){
            zeroValue++;
        }else if(number1>0){
            positiveValue++;
        }else{
            negativeValue++;
        }

        if(number2==0){
            zeroValue++;
        }else if(number2>0){
            positiveValue++;
        }else{
            negativeValue++;
        }

        if(number3==0){
            zeroValue++;
        }else if(number3>0){
            positiveValue++;
        }else{
            negativeValue++;
        }

        if(number4==0){
            zeroValue++;
        }else if(number4>0){
            positiveValue++;
        }else{
            negativeValue++;
        }

        if(number5==0){
            zeroValue++;
        }else if(number5>0){
            positiveValue++;
        }else{
            negativeValue++;
        }

        System.out.println("\nValores positivos : "+positiveValue+"\nValores Negativos: "+negativeValue+"\nValores de Cero: "+zeroValue);
    
    }//end main

}//end NegativePositiveAndCeroValues