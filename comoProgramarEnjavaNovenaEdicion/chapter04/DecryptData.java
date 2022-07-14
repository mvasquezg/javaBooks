/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 38: Decrypt Data.
*/

import java.util.Scanner;

public class DecryptData{
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int number=0;
        int encryptNumber=0;
        int temp=0;
        int u=0;
        int d=0;
        int c=0;
        int uM=0;

        System.out.print("Ingrese el valor encriptado: ");
        encryptNumber=in.nextInt();
        
        uM=encryptNumber/1000;
        temp=encryptNumber%1000;

        c=temp/100;
        temp=temp%100;

        d=temp/10;
        u=temp%10;
        System.out.println("Separando digitos: "+uM+" "+c+" "+d+" "+u);

        temp=uM;

        uM=d;
        d=temp;

        temp=0;

        temp=c;
        c=u;
        u=temp;    

        
        if(uM>=0 && uM<=6){
            uM=uM+10;
        }

        if(c>=0 && c<=6){
            c=c+10;
        }

        if(d>=0 && d<=6){
            d=d+10;
        }

        if(u>=0 && u<=6){
            u=u+10;
        }

        
        uM-=7;
        c-=7;
        d-=7;
        u-=7;
     
        System.out.println("NUmero desencriptado "+uM+" "+c+" "+d+" "+u);
    }//end main
}//EncryptData