/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 16: Calculate the product of odd numbers to fifteen. 
*/

public class MultiplicationOddNumbers{
    public static void main(String[] args){
    int result=1;

        for(int i=1; i<=15; i++){
            
            if(i%2==1){
                System.out.print(i+" * ");
                result*=i;
            }
        }
        System.out.println("\nEl producto es igual a: "+result);

    

    }//end main
}//end MultiplicationOddNumbers