/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 01: Introduction to programming language.
  *Programa 02: Hello world With Name.
*/
import java.util.Scanner;

public class HelloWorldWithName{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String name="";
        String message="Hola mundo ";

        System.out.print("\nEste programa imprime un mensaje de pantalla con su nombre.\nIngrese su nombre: ");
        name=in.nextLine();

        System.out.println("\n"+message+name+"\n");
    }//end main
}//end HelloWorldWithName