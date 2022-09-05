/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 24: Print the value next sentences.

    i = 1, j = 2,k = 3, m = 2

  a) System.out.println( i == 1 ); == true
  b) System.out.println( j == 3 ) ; == false
  c) System.out.println( ( i >= 1) && (j< 4 ) ); ==true
  d) System.out.println( ( m <= 99 )& (k < m )); ==false
  e) System.out.printlnC ( j >= i ) || ( k == m ) ); ==true
  f) System .out.println( ( k + m < j ) | ( 3 - j> = k ) ) ; ==true
  g) System, out. pri ntln(!( k > m ) ); ==false

*/

public class PrintValueEachExpresion{
    public static void main(String[] args){

      int i = 1, j = 2,k = 3, m = 2;

    System.out.println( "i == 1: "+ (i == 1) ); //== true
    System.out.println("j == 3: "+ (j == 3) ) ;// == false
    System.out.println("( i >= 1) && (j< 4 ): "+( ( i >= 1) && (j< 4 ) )); //==true
    System.out.println( "( m <= 99 ) & (k < m ): " +(( m <= 99 ) & (k < m ))); //==false
    System.out.println ("( j >= i ) || ( k == m ): "+(( j >= i ) || ( k == m )) ); //==true
    System.out.println("( k + m < j ) | ( 3 - j>= k ): "+( ( k + m < j ) | ( 3 - j>= k )) );// ==true
    System.out. println("!( k > m ): "+(!( k > m ) ));// ==false


    }//end main
}//end PrintValueEachExpresion