/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 31: Reverse Digit
*/
import java.util.Scanner;

public class ReverseDigit{
    
    static void doReverseDigit(int number){
        int UM=0, C=0, D=0, U=0, aux=0;

        UM=number/1000;
        aux=number%1000;

        C=aux/100;
        aux=aux%100;

        D=aux/10;

        U=aux%10;

        System.out.println("\nEl numero "+number+" inverso es: "+U+" "+D+" "+C+" "+UM);
    }    

    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        do{
            System.out.print("Ingresa un numero de 4 digitos: ");
            number=in.nextInt();
        }while(number<1000 || number>9999);

        doReverseDigit(number);
    }//end main
}//end ReverseDigit