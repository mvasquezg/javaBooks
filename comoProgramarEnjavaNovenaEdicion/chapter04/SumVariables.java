/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 10: Instruccions for doing task
*/
import java.util.Scanner;

public class SumVariables{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=0, y=0, z=0, acount=0, total=0, dividendo=0, divisor=0, q=0;
        
        System.out.print("Ejercicio 4.4 a)\nIngresa el valor de x: ");
        x=in.nextInt();

        System.out.print("Ingresa el valor de y: ");
        y=in.nextInt();

        z=x+y;
        System.out.println("\nLa suma de x: "+x+" + y: "+y+" = "+z);
        x++;
        System.out.println("\nNuevo valor de x: "+x);

        System.out.print("\n\nb)\nIngresa el valor de la cuenta: ");
        acount=in.nextInt();
        if(acount>10){
            System.out.print("Cuenta es mayor que 10");
        }
        
        x--;

        total=z;
        System.out.print("\n\nc)\nTotal: "+total);
        System.out.println(" x menos 1 = "+x);
        total-=x;
        System.out.println("\ntotal menos x = "+total);
    
        System.out.print("\n\nd)\nIngrese dividendo = ");
        dividendo=in.nextInt();
        
        System.out.print("ingrese divisor = ");
        divisor=in.nextInt();
        
        q=dividendo%divisor;
        System.out.println("\ntotal residuo forma divivendo%divisor: "+q);
        dividendo%=divisor;
        System.out.println("total residuo forma dividendo%=divisor: "+dividendo);
    }//end main
}//end SumVariables