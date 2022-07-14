/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 37: Encrypt Data.
*/

import java.util.Scanner;

public class EncryptData{
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int number=0;
        int encryptNumber=0;
        int temp=0;
        int u=0;
        int d=0;
        int c=0;
        int uM=0;

        System.out.print("Ingrese un numero valido entre 1000 y 9999: ");
        number=in.nextInt();
        while(number<1000 || number>9999){
            System.out.print("Ingrese un numero valido entre 1000 y 9999: ");
            number=in.nextInt();
        }//end while

        uM=number/1000;
        temp=number%1000;

        c=temp/100;
        temp=temp%100;

        d=temp/10;
        u=temp%10;

        uM+=7;
        c+=7;
        d+=7;
        u+=7;

        uM=uM%10;
        c=c%10;
        d=d%10;
        u=u%10;

        System.out.println("NUmero desglozado "+d+" "+u+" "+uM+" "+c);
    }//end main
}//EncryptData