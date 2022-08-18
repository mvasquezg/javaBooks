/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 08: Testing the instruction 'continue' into bucle for. 
*/
public class TestContinue{

    public static void main(String[] args){
        int count, value=0;


        for(count=1; count<=10; count++){
            
            if(count==5){
                value=count;
                continue;
            }

            System.out.print(count+" ");
        }

        System.out.println("\nSe uso continue para omitir y no imprimir el "+value+" en la serie.");
    }//end main

}//end TestContinue