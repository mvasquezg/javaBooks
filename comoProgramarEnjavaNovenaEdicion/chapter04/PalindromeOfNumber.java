/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 28: Palindrome of number with five digits.
*/
import java.util.Scanner;

public class PalindromeOfNumber{

  public static void main(String[] args){
    Scanner in=new Scanner(System.in);

    /**
      *Variables Unidad
      *Unidad = u
      *Decena = d
      *Centena = c
      *Unidad de Millar = uM
      *Decena de Millar = dM
    */
    int numberStart=0,number=0, u=0, d=0, c=0, uM=0, dM=0;

    System.out.print("Ingresa un numero entre 10 000 y 99 999, para determinar si el numero es palindromo: "); 
    number=in.nextInt();

    while(number<10000 || number>99999){
      System.out.print("Ingresa un numero entre 10 000 y 99 999, para determinar si el numero es palindromo: "); 
      number=in.nextInt();
    }
    numberStart=number;

    dM=number/10000;
    number=number%10000;

    uM=number/1000;
    number=number%1000;

    c=number/100;
    number=number%100;

    d=number/10;
    u=number%10;

    if(dM==u){
        if(uM==d){
          System.out.println("El numero: "+numberStart+" es palindromo");
        }
    }else{
      System.out.println("El numero: "+numberStart+" no es palindromo");
    }
  }//end main

}//end PalindromeOfNumber