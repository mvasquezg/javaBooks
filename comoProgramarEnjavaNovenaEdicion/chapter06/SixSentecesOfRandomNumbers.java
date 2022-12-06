/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 17: Six sentences of Random Numbers.
*/
import java.util.Random;

public class SixSentecesOfRandomNumbers{
    public static void main(String[] args){
        Random number=new Random();

        System.out.println("Numeros aleatorios entre 1-2:");
        for(int i=1; i<=5; i++){
            System.out.print(1+number.nextInt(2)+" ");
        }

        System.out.println("\n");
        System.out.println("Numeros aleatorios entre 1-100:");
        for(int i=1; i<=5; i++){
            System.out.print(1+number.nextInt(100)+" ");
        }

        System.out.println("\n");
        System.out.println("Numeros aleatorios entre 1-9:");
        for(int i=1; i<=5; i++){
            System.out.print(1+number.nextInt(9)+" ");
        }

        System.out.println("\n");
        System.out.println("Numeros aleatorios entre 1000-1112:");
        for(int i=1; i<=5; i++){
            System.out.print((number.nextInt(112-100)+1000)+" ");
        }

        System.out.println("\n");
        System.out.println("Numeros aleatorios entre -1 a 1:");
        for(int i=1; i<=5; i++){
            System.out.print((number.nextInt(2+1)-1)+ " ");
        }

        System.out.println("\n");
        System.out.println("Numeros aleatorios entre -3 a 11:");
        for(int i=1; i<=5; i++){
            System.out.print((number.nextInt(10+5)-3)+ " ");
        }

        System.out.println();

    }//end main
}//end SixSentencesOfRandomNumbers