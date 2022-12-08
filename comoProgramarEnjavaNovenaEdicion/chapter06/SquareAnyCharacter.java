/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 24: Print Square of any characters
*/
import java.util.Scanner;

public class SquareAnyCharacter{
    static void printSquareAsterisks(int number, char caracter){
        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;
        char caracter=0;

        System.out.print("Ingresa un numero: ");
        number=in.nextInt();

        System.out.print("Ingresa el caracter a pintar en el cuadro: ");
        caracter=in.next().charAt(0);

        printSquareAsterisks(number, caracter);

    }//end main
}//end SquareAnyCharacter