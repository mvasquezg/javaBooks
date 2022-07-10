/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 32: Know if the triangle is right with medidas.
*/
import java.util.Scanner;

public class Triangle{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=0, b=0, c=0;

        System.out.print("Ingresa el primer valor: ");
        a=in.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        b=in.nextInt();
        System.out.print("Ingresa el tercer valor: ");
        c=in.nextInt();

        if( (a+b) > c ){

            if( (a+c) > b){

                if((b+c)>a){
                    System.out.println("Las medidas representan un triangulo.");
                }else{
                    System.out.println("Las medidas no representan un triangulo.");
                }

            }else{
                System.out.println("Las medidas no representan un triangulo.");
            }

        }else{
            System.out.println("Las medidas no representan un triangulo.");
        }


    }//end main
}//end Triangle