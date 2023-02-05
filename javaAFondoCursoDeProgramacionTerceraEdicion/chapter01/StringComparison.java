/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 34: String comparison 1
*/
import java.util.Scanner;

public class StringComparison{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String string01="";
        String string02="";

        System.out.print("Ingrese un texto: ");
        string01=in.next();

        System.out.print("Ingrese un texto: ");
        string02=in.next();

        //validacion incorrecta    
        /*if(string01==string02){
            System.out.println("Las cadenas son iguales.");
        }else{
            System.out.println("Las cadenas no son iguales.");
        }*/

        //validacion correcta    
        /*if(string01.equals(string02)){
            System.out.println("Las cadenas son iguales.");
        }else{
            System.out.println("Las cadenas no son iguales.");
        }*/

        System.out.println("Las cadenas"+(string01.equalsIgnoreCase(string02)?" ":" No " )+"son iguales.");


    }//end main
}//end StringComparison