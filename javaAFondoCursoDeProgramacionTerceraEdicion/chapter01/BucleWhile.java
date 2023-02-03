/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 08: Using bucle while
*/
import java.util.Scanner;

public class BucleWhile{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0, x=1;

        System.out.print("Ingresa un numero: ");
        number=in.nextInt();

        while(x<=number){
            System.out.print(x+" ");
            x++;
        }
        System.out.println("\n");


    }//end main
}//end BucleWhile