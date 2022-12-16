/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 35: Guess a Number.
*/

import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
    static Random num=new Random();
    static int numberToGuess;
    static Scanner in=new Scanner(System.in);
    static int option=0;
    
    static void guessNumber(int number){
        numberToGuess=num.nextInt(1+1000);
        
        do{
            if(number>numberToGuess){
                System.out.println("El numero "+number+" es mayor: ");
            }else if(number<numberToGuess){
                System.out.println("El numero "+number+" es menor: ");
            }

            System.out.print("\nIntente de nuevo: ");
            number=in.nextInt();
        }while(number!=numberToGuess);

        System.out.println("El numero "+number+" es el correcto. Felicidades ha adivinado el numero.");
    }//end guessNumber
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0;
        do{
            System.out.print("Ingresa un numero: ");
            num=in.nextInt();
            guessNumber(num);

            System.out.print("\n\nDesea volver a jugar?\nPresiona 1 para jugar\nPresiona 2 para salir\nOpcion: ");
            option=in.nextInt();
        }while(option!=2);
    }//end main
}//end GuessNumber