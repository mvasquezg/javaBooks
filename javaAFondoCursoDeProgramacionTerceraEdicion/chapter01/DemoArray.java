/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 12: Using Arrays
*/

import java.util.Scanner;

public class DemoArray{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int i=0;
        int[] arrayNumber=new int[10];
        
        while(i<10){
            System.out.print("Ingrese el valor "+(i+1)+": ");
            arrayNumber[i]=in.nextInt();
            i++;
        }//end while

        System.out.println();    
        for(int j=0; j<i; j++){
            System.out.print(arrayNumber[j]+" ");
        }//end for
        
        System.out.println();

    }//end main
}//emd DemoArray

