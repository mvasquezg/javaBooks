/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 09.- Arithmetic operations basic whit two integer numbers.
*/
import java.util.Scanner;

public class ArithmeticOperationsBasic{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=0, num2=0, result=0;

        System.out.print("Ingresa el primer numero: ");
        num1=in.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2=in.nextInt();

        result=num1+num2;
        System.out.println("\nSuma\n"+num1+" + "+num2+" = "+result);

        result=num1-num2;
        System.out.println("\nResta\n"+num1+" - "+num2+" = "+result);

        result=num1*num2;
        System.out.println("\nMultiplicacion\n"+num1+" * "+num2+" = "+result);

        result=num1/num2;
        System.out.println("\nDivision\n"+num1+" / "+num2+" = "+result);    
    }//end main
}//end ArithmeticOperationsBasic