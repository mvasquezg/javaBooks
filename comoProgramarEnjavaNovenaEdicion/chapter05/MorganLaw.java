/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 28: Morgan Law.
*/

import java.util.Scanner;

public class MorganLaw{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int a=0, b=0, x=0, y=0, j=0, g=0, i=0;

        System.out.print("1.-Ingresa el valor de a: ");
        a=in.nextInt();

        System.out.print("2.-Ingresa el valor de b: ");
        b=in.nextInt();

        System.out.print("3.-Ingresa el valor de x: ");
        x=in.nextInt();

        System.out.print("4.-Ingresa el valor de y: ");
        y=in.nextInt();
        
        System.out.print("5.-Ingresa el valor de j: ");
        j=in.nextInt();

        System.out.print("6.-Ingresa el valor de g: ");
        g=in.nextInt();

        System.out.print("6.-Ingresa el valor de i: ");
        i=in.nextInt();

        System.out.println();    

        System.out.println( "!("+x+"< 5 ) && !( "+y+" >= 7 ) = "+( !(x<5) && !( y>=7)) );

        System.out.println( "\n!( "+a+" == "+ b+" ) || !( "+g+" >= 7 ) = "+( !(x<5) && !( y>=7)) );

        System.out.println( "\n!( ("+x+" <= 8  ) && ("+y+ " > 4 ) ) = "+ ( !( (x <= 8  ) && (y > 4 ) )  ) );

        System.out.println( "\n!( ("+i+" > 4  ) || ("+j+ " < 6 ) ) = "+ ( !( (i > 4 ) || (j < 6 ) )  ) );

    }//end main

}//end class MorganLaw