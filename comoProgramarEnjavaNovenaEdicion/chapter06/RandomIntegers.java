
/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 04: Show ramdon numbers of type integer.
*/

import java.util.Random;

public class RandomIntegers{
    public static void main(String[] args){
        
        Random randomNumber=new Random();

        int face;

        for(int i=1; i<=20; i++){

            face=1+randomNumber.nextInt(6);

            System.out.print(face+" ");

            if(i%5==0){
                System.out.println();
            }
        }

    }
}//end RandomIntegers