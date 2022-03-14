/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 19: Caculate the sales workers.
*/
import java.util.Scanner;

public class TheGreatestValue{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int countNumber=1, currentNumber=0, mayorNumber=0;

        while(countNumber<=10){
            System.out.print("Ingresa el numero "+countNumber+": ");
            currentNumber=in.nextInt();

            if(currentNumber>mayorNumber){
                mayorNumber=currentNumber;
            }

            countNumber++;
        }

        System.out.println("\nEl numero mayor es igua a: "+mayorNumber);
    }//end main
}//end TheGreatestvalue