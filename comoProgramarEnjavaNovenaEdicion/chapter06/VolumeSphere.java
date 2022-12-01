/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 12: Calculate the volume of Sphere using method.
*/
import java.util.Scanner;

public class VolumeSphere{
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        double radio;

        System.out.print("ingrese el radio de la esfera para calcular su volumen: ");
        radio=in.nextDouble();

        System.out. println("El volumen de la esfera con  un radio de: "+radio+" es igual a = "+calculateVolumeSphere(radio));
    }

    public static double calculateVolumeSphere(double radio){
        return (4.0/3.0)*Math.PI*Math.pow(radio, 3);
    }

}//end VolumeSphere