/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 06: Roll dice.
*/
import java.util.Random;

public class RollDice{
    
    public static void main(String[] args){
        Random randomNumbers=new Random();

        int[] arrayFrequency=new int[7];

        for(int i=1; i<6000000; i++){
            ++arrayFrequency[1+randomNumbers.nextInt(6)]; 
        }

        System.out.printf("%s%10s\n", "Cara", "Frecuencia");

        for(int j=1; j<arrayFrequency.length; j++){
            System.out.printf("%4d %10d\n", j, arrayFrequency[j]); 
        }

    }//end main
}//end RollDice