/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 28: Minimun Value
*/
import java.util.Scanner;

public class MinimunValue{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0, num3=0;

        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();    

        System.out.print("Ingresa el tercer numero: ");
        num3=in.nextInt();

        System.out.println("El menor de los siguientes valores: "+num1+" "+num2+" "+num3+" \nes: "+(Math.min(num3, Math.min(num1, num2))));
    }//end main
}//end MinimunValue