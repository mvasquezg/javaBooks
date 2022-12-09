/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 25: Print Circle Area
*/

import java.util.Scanner;

public class CircleArea{
    static double calculateCircleArea(double radio){
        return Math.PI*Math.pow(radio, 2);
    }//end calculateCircleArea
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double radio=0;

        System.out.print("Ingresa el radio del Circulo: ");
        radio=in.nextDouble();

        System.out.println("\nEl area del circulo con un radio de: "+radio+" es igual a: "+calculateCircleArea(radio));
    }//end main
}//end CircleArea