/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 05: Bucle do-while.
*/
public class DoWhileCounter{
    public static void main(String[] args){
        int counter=1;

        do{
            System.out.print(counter+" ");
            ++counter;
        }while(counter<=10);
        System.out.println();
    }//end main
}//end DoWhileCounter