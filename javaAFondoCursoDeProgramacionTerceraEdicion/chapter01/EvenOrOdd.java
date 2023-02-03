/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 05: Number even or odd.
*/
import java.util.Scanner;

public class EvenOrOdd{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        System.out.print("\nPrograma que determina si un numero es par o impar.\n\nIngrese un numero: ");
        number=in.nextInt();

        if(number%2!=0){
            System.out.println("El numero: "+number+" es impar.\n");
        }else{
            System.out.println("El numero: "+number+" es par.\n");
        }
    }//end main
}//end EvenOrOdd