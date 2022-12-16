    /**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 36: Guess a Number with attempts.
*/

import java.util.Random;
import java.util.Scanner;

public class GuessNumberAttempts{
    static Random num=new Random();
    static Scanner in=new Scanner(System.in);

    static int countAttempts=0;
    static int numberToGuess=0;
    static int option=0;
    
    static void guessNumber(int number){
        numberToGuess=num.nextInt(1+1000);
        
        do{
            ++countAttempts;
            if(number>numberToGuess){
                System.out.println("El numero "+number+" es mayor: ");
            }else if(number<numberToGuess){
                System.out.println("El numero "+number+" es menor: ");
            }
            
            System.out.print("\nIntente de nuevo: ");
            number=in.nextInt();

            
        }while(number!=numberToGuess);
        countAttempts++;
        if(countAttempts<10){
            System.out.println(countAttempts+" intentos. Ya sabia usted el secreto o tuvo usted suerte.");
        }else if(countAttempts>10){
            System.out.println(countAttempts+" intentos. Deberia haberlo hecho mejor.");
        }else{
            System.out.println(countAttempts+" intentos. Aja sabia usted el secreto.");
        }


        System.out.println("El numero "+number+" es el correcto. Felicidades ha adivinado el numero.");
        countAttempts=0;
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
}//end GuessNumberAttempts