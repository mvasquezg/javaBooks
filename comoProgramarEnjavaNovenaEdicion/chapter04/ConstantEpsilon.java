/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 35: Cosntant Epsilon
*/
import java.util.Scanner;

public class ConstantEpsilon{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0, x=1;

        System.out.print("Ingresa un numero: ");
        number=in.nextInt();

        System.out.print(number);
        while(x<=number){
            System.out.print(" + "+number+"/"+x+"!");
            x++;
        }
        System.out.println();

    }//end main
}//end ConstantEpsilon