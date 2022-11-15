/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 34: Show to calculate tax aobut mount.
*/

import java.util.Scanner;

public class CalculateTax{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float subTotal=0.0F, total=0.0F, iva=0.16F;

        System.out.print("Ingrese la cantidad de gastos que realizo este mes.\nSe mostrara en pantalla el monto total con iva:");
        subTotal=in.nextFloat();

        System.out.println("\nSubtotal: "+subTotal+"\niva: "+(subTotal*iva)+"\nTotal: "+(subTotal+(subTotal*iva)));



    }//end main
}//end CalculateTax