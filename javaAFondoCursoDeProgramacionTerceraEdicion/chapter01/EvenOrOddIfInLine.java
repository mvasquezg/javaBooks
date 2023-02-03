/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 06: Number even or odd using if inline.
*/
import java.util.Scanner;

public class EvenOrOddIfInLine{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        System.out.print("\nPrograma que determina si un numero es par o impar con la validacion inline.\n\nIngrese un numero: ");
        number=in.nextInt();

        System.out.println("El numero: "+number+" es " + (number%2!=0 ? "im" : "" )+ "par.\n");
        
    }//end main
}//end EvenOrOdd