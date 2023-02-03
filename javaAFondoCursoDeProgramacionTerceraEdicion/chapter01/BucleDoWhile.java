/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 09: Using bucle Do-While
*/
import java.util.Scanner;

public class BucleDoWhile{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0, x=1;

        System.out.print("Ingresa un numero: ");
        number=in.nextInt();

        do{
            System.out.print(x+" ");
            x++;
        }while(x<=number);
        
        System.out.println("\n");
    }//end main
}//end BucleDoWhile