/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 23: Print Square of Asterisks
*/
import java.util.Scanner;

public class SquareAsterisks{
    static void printSquareAsterisks(int number){
        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        System.out.print("Ingresa un numero: ");
        number=in.nextInt();

        printSquareAsterisks(number);



    }//end main
}//end SquareAsterisks