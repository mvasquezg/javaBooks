/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 34: Factorial
*/
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=0, x=1, factorial=1;

        System.out.print("Ingresa un numero, para calcular su factorial: ");
        num=in.nextInt();
        factorial=num;

        System.out.print(num);

        while(x<num){
            factorial*=(num-x);
            System.out.print(" * "+(num -x)+" " );
            x++;
        }
        System.out.println("\n"+num+"! = "+factorial);
    }//end main
}//end Factorial