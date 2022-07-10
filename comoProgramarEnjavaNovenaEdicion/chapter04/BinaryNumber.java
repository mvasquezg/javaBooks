 lines (42 sloc) 1.28 KB
/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 29: Convertion Binary Digit to Decimal digit.
*/

import java.util.Scanner;

public class BinaryNumber{
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int number=-1;
        int decimalNumber=0;
        int u=0;  //Unidad            1
        int d=0;  //decena            2  
        int c=0;  //centena           3
        int uM=0; //Unidad de Millar  4
        int dM=0; //Decena de Millar  5
        int cM=0; //Centena de Millar 6 
        int UM=0; //Unidad de Millar  7
        int DM=0; //Decena de Milla   8
        int CM=0; //Centena de millon 9
        int temp=0;


        while(number<0 || number>9999){
            System.out.print("Ingresa un numero de 4 digitos, solo de ceros y unos: ");
            number=in.nextInt();

        }
        
        System.out.println();

        //--------- Encabezado de tabla
        System.out.println("Valor Binario\t\tValor Decimal");
        if(number==0 || number==1){
            System.out.print(number +"\t\t\t\t"+number);
        }else if(number==10 || number==11){
            d=number/10;
            u=number%10;

            decimalNumber=(int) (d*Math.pow(2, 1)) +(int) (u*Math.pow(2, 0));

            System.out.print(number +"\t\t\t\t"+decimalNumber);

        }else if(number==100 || number==101 || number==110 || number==111){
            c=number/100;
            temp=number%100;

            d=temp/10;
            u=number%10;
            decimalNumber=(int) (c*Math.pow(2, 2))+(int) (d*Math.pow(2, 1)) +(int) (u*Math.pow(2, 0));
            System.out.print(number +"\t\t\t\t"+decimalNumber);
        }else if(number==1000 || number==1001 || number==1010 || number==1011 || number==1100 || number==1101 || number==1110 || number==1111 ){
            uM=number/1000;
            temp=number%1000;

            c=temp/100;
            temp=temp%100;

            d=temp/10;
            u=temp%10;

            decimalNumber=(int) (uM*Math.pow(2, 3))+(int) (c*Math.pow(2, 2))+(int) (d*Math.pow(2, 1)) +(int) (u*Math.pow(2, 0));
            System.out.print(number +"\t\t\t\t"+decimalNumber);


        }else{
            System.out.print("El numero ingresado es incorrecto.");
        }
        
        System.out.println();
    }//end main

}//end BinaryNumber