/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 01: Introduction to programming language.
  *Programa 03: Hello world With Data.
*/
import java.util.Scanner;

public class ReadingData{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String name="";
        int age=0;
        int height=0;

        System.out.print("Ingrese los datos en este orden, Nombre, Edad, Altura: ");
        name=in.next();

        age=in.nextInt();

        height=in.nextInt();

        System.out.println("\nDatos proporcionados.\nNombre: "+ name+"\nEdad: "+age+"\nAltura: "+height+"\n");

    }//end main
}//end ReadingData