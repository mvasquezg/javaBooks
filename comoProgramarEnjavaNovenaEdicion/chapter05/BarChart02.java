/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 20: Print bar chart of five numbers of one to trirty.
*/


import java.util.Scanner;

public class BarChart02{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number1=0, number2=0, number3=0, number4=0, number5=0;

        do{
            System.out.print("1.-Ingrese un numero entre 1 y 30: ");
            number1=in.nextInt();
        }while(number1<=0 || number1>30);
        
        do{
            System.out.print("2.-Ingrese un numero entre 1 y 30: ");
            number2=in.nextInt();
        }while(number2<=0 || number2>30);    

        do{
            System.out.print("3.-Ingrese un numero entre 1 y 30: ");
            number3=in.nextInt();
        }while(number3<=0 || number3>30);    

        do{
            System.out.print("4.-Ingrese un numero entre 1 y 30: ");
            number4=in.nextInt();
        }while(number4<=0 || number4>30);        
        
        do{
            System.out.print("5.-Ingrese un numero entre 1 y 30: ");
            number5=in.nextInt();
        }while(number5<=0 || number5>30);
        

        System.out.println("\nNumero\t\tGrafica");
        System.out.print(number1+"\t\t");
        for(int i=1; i<=number1; i++){
            System.out.print("* ");
        }
        
        System.out.print("\n"+number2+"\t\t");
        for(int i=1; i<=number2; i++){
            System.out.print("* ");
        }

        System.out.print("\n"+number3+"\t\t");
        for(int i=1; i<=number3; i++){
            System.out.print("* ");
        }

        System.out.print("\n"+number4+"\t\t");
        for(int i=1; i<=number4; i++){
            System.out.print("* ");
        }

        System.out.print("\n"+number5+"\t\t");
        for(int i=1; i<=number5; i++){
            System.out.print("* ");
        }

        System.out.println();
    }//end main
}//end BarChart