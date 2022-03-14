/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 20: Show tabular output.
*/
import java.util.Scanner;

public class TabularOutput{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int number=0, countNumber=1;

        System.out.print("Ingrese un numero: ");
        number=in.nextInt();

        System.out.println("Numero\t10*n\t100*n\t1000*n");
        while(countNumber<=number){
            System.out.println(countNumber+"\t"+(countNumber*10)+"\t"+(countNumber*100)+"\t"+(countNumber*1000));
            countNumber++;
        }//end while
    }//end main
}//end TabularOutput