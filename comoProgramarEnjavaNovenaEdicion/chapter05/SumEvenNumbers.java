/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 03: Sum even numbers, with for.
*/

public class SumEvenNumbers{
    public static void main(String[] args){
        int sum=0;

        for(int i=2; i<=20; i+=2){
            System.out.print(i+" ");
            sum+=i;
        }   
        System.out.println("\nSuma total: "+sum);     
    }//end main
}//end SumEvenNumbers