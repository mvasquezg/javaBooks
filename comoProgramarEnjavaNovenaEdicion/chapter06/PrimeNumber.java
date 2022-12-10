/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 30: Prime Number
*/
import java.util.Scanner;

public class PrimeNumber{
    static void isPrimeNumber(int number){
         int sum=0;   
        for(int i=1; i<=number; i++){

            if(number%i==0){
                sum++;
            }
        }

        if(sum!=2){
            System.out.println(number+" no es un numero primo.");
        }else{
            System.out.println(number+" es un numero primo.");
        }

    }//end isPrimeNumber
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;

        System.out.print("Ingresa un numero para determinar si es primo: ");
        number=in.nextInt();

        isPrimeNumber(number);
    }//end main
}//end PrimeNumber