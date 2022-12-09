/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 26: Separating Numbers
*/

import java.util.Scanner;

public class SeparatingNumbers{
    
    static void separateQuotient(int number){
        int DM=0, UM=0, C=0, D=0, U=0, aux=0;

        DM=number/10000;
        aux=number%10000;

        UM=aux/1000;
        aux=number%1000;

        C=aux/100;
        aux=aux%100;

        D=aux/10;

        U=aux%10;
        
        System.out.println("El numero: "+number+" los componen los numeros: "+DM+"  "+UM+"  "+C+"  "+D+"  "+U);
    }//end separateQuotient

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        do{
            System.out.print("Ingresa un numero entre 1 y 9999: ");
            number=in.nextInt();

            if(number<1 || number>99999){
                System.out.println("Numero incorrecto.\n");
            }
        }while(number<1 || number>99999);

        separateQuotient(number);
    }//end main
}//end SeparatingNumbers