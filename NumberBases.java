/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 31: Number Bases.
*/
import java.util.Scanner;

public class NumberBases{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;
        int baseNumber=0;
        String sBaseNumber=""; 

        System.out.print("\nIngrese un numero: ");
        number=in.nextInt();

        System.out.println();
        System.out.println("Valor ingresado: "+number);
        System.out.println("Valor en binario: "+Integer.toBinaryString(number));
        System.out.println("Valor octal: "+Integer.toOctalString(number));
        System.out.println("Valor ingresado: "+Integer.toHexString(number));

        System.out.print("\n\nIngrese una base numerica: ");
        baseNumber=in.nextInt();

        sBaseNumber=Integer.toString(number, baseNumber);
        System.out.println(number+" en base ("+baseNumber+") = "+sBaseNumber);
    }//end main
}//end NumberBases