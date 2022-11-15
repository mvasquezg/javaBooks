/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 33: Show in screen if known about Global Warming, with respect of test.
*/
import java.util.Scanner;

public class TestGlobalWarming{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int option=0;

        System.out.print("Ingrese el numero de respuestas acertadas en el examen: ");
        option=in.nextInt();

        switch(option){
            case 1: 
            case 2: 
            case 3:
                System.out.println("Es tiempo de aprender mas sobre el calentamiento global.");
                break;
            case 4:
                System.out.println("Muy bien.");
                break;
            case 5:
                System.out.println("Excelente.");
                break;
            default:
                System.out.println("Numero de respuestas no es valida.");
                break;    
        }




    }//end main
}//end TestGlobalWarming