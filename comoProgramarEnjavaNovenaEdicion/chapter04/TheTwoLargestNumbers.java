/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 21: Show the two largest numbers.
*/

import java.util.Scanner;

public class TheTwoLargestNumbers{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int countNumber=1, currentNumber=0, mayorNumber01=0, mayorNumber02=0;

        while(countNumber<=10){
            System.out.print("Ingresa el numero "+countNumber+": ");
            currentNumber=in.nextInt();

            if(currentNumber>mayorNumber01){
                mayorNumber02=mayorNumber01;
                mayorNumber01=currentNumber;
            }else if(currentNumber<mayorNumber01){
                if(currentNumber>mayorNumber02){
                    mayorNumber02=currentNumber;
                }
            }
            countNumber++;
        }
        System.out.println("\nEl primer numero mayor es igual a: "+mayorNumber01+"\nEl segundo numero mayor es igual a: "+mayorNumber02);
    }//end main
}//end TheTwoLargestNumbers