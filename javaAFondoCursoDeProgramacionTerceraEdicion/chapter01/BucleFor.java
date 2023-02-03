/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 10: Using bucle for
*/
import java.util.Scanner;

public class BucleFor{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        System.out.print("Ingresa un numero: ");
        number=in.nextInt();

        for(int i=1; i<=number; i++){
            System.out.print(i+" ");
        }
        
        System.out.println("\n");
    }//end main
}//end BucleFor