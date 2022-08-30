/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 15: Find a minor number. 
*/

import java.util.Scanner;

public class FindValueMinor{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int countNumbers=0, valueNumber=0, minNumber=0;

        System.out.print("Ingresa numeros a comparar: ");
        countNumbers=in.nextInt();

        for(int i=1; i<=countNumbers; i++){
            
            if(i<10){
                System.out.print("0"+i+".- Ingresa un valor: ");
                valueNumber=in.nextInt();

                if(i==1){
                    minNumber=valueNumber;
                } else{

                    if(valueNumber<minNumber){
                        minNumber=valueNumber;
                    }
                } 

            }else{
                System.out.print(i+".- Ingresa un valor: ");
                valueNumber=in.nextInt();

                if(valueNumber<minNumber){
                        minNumber=valueNumber;
                    }    
            }
        }
        System.out.println("El numero menor es: "+minNumber);
    }
}//end FindValueMinor