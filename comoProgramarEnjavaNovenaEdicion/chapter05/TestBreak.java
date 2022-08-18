/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 07: Testing the instruction 'break' into bucle for. 
*/

public class TestBreak{

    public static void main(String[] args){
        int count;

        for(count=1; count<=10; count++){
            
            if(count==5){
                break;
            }

            System.out.print(count+" ");
        }
        System.out.println("\nSalio del ciclo en cuenta = "+count);
    }//end main

}//end TestBreak