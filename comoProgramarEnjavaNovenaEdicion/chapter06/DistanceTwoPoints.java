/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 37: Calculate Distance between two points.
*/
import java.util.Scanner;

public class DistanceTwoPoints{
    
    static double calculateDistanceTwoPoints(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
    }//end calculateDistanceTwoPoints

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double x1=0, x2=0, y1=0, y2=0;

        System.out.println("Programa que calcula la distancia entre dos puntos:\n");

        System.out.print("Ingresa el valor de x1: ");
        x1=in.nextDouble();

        System.out.print("Ingresa el valor de y1: ");
        y1=in.nextDouble();
        
        System.out.print("Ingresa el valor de x2: ");
        x2=in.nextDouble();

        System.out.print("Ingresa el valor de y2: ");
        y2=in.nextDouble();

        System.out.println("La distancia es igual a: "+calculateDistanceTwoPoints(x1, y1, x2, y2));

    }//end main
}//end DistanceTwoPoints