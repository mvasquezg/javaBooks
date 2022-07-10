/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 33: Know if the triangle is right with medidas.
*/
import java.util.Scanner;

public class RightTriangle{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=0, b=0, c=0;

        System.out.print("Ingresa el primer valor: ");
        a=in.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        b=in.nextInt();
        System.out.print("Ingresa el tercer valor: ");
        c=in.nextInt();

        if( (a*a) == ((b*b) + (c*c)) ){
            System.out.print("Las medidas son de un Triangulo Rectangulo: "+(a*a)+" = "+((b*b)+(c*c)));
        }else{
            System.out.print("Las medidas no son de un Triangulo Rectangulo: "+(a*a)+" = "+((b*b)+(c*c)));
        }
        System.out.println();
    }
}//end RightTriangle