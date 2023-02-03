/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 04: Is older than twenty one.
*/

import java.util.Scanner;

public class IsOlderThanTwenyOne{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        byte age=0;

        System.out.print("Ingrese su edad: ");
        age=in.nextByte();

        if(age>=21){
            System.out.println("Usted es mayor de edad.");
        }else{
            System.out.println("Usted no es mayor de edad.");
        }
    }
}//end IsOlderThanTwenyOne