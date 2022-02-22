/**
  *Chapter 02: Introduction to apps in Java,
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Program 17.- Show the area, diameter and circumference from the radius of a circle.
*/
import java.util.Scanner;

public class Circle{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double radio=0, diameter=0, area=0, circumference=0;

        System.out.print("Programa que calcula el diametro, el area y la circunferencia de un circulo.\nIngresa el radio del circulo: ");
        radio=in.nextDouble();

        //diameter of circle
        diameter=2*radio;
        System.out.println("El diametro del circulo es igual a : "+diameter);

        //Area of circle
        area=3.1416*radio*radio;
        System.out.println("El area del circulo es igual a : "+area);

        //Circumference of circle
        circumference=3.1416*diameter;
        System.out.println("El area del circulo es igual a : "+circumference);
      }//end main
}//end Circle  *Chapter 02: Introduction to apps in Java,  *Chapter 02: Introduction to apps in Java,