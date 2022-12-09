/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 29: Perfect Number
*/
import java.util.Scanner;

public class PerfectNumber{
    static void isPerfectNumber(int number){
        int sum=0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(!(number==sum)){
            System.out.println(number+" no es un numero perfecto");
        }else{
            System.out.println(number+" es un numero perfecto y estos son sus multplios");
            for(int i=1; i<number; i++){

                if(number%i==0){
                    System.out.print(i+" + ");
                }
            }
            System.out.println("\n");
        }
    }//end isPerfectNumber

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0;    
        
        System.out.print("Programa que determina si un numero es perfecto\nIngresa un numero: ");
        number=in.nextInt();

        for(int i=1; i<=number; i++){
            isPerfectNumber(i);
        }
    }//end main
}//end PerfectNumber