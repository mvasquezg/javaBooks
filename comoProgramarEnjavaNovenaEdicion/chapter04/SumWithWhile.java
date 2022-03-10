/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 12: Sum with while from one to ten.
*/

public class SumWithWhile{
    public static void main(String[] args){
        int sum=0, x=1;

        while(x<=10){
            sum+=x;
            System.out.println("La suma es: "+sum);
            x++;
        }//end while

    }//end main
}//end SumwithWhile
