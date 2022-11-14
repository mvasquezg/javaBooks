/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 30: Print Diamon with input value of 1 by 19.
*/
import java.util.Scanner;


public class Diamond02{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int row=0;
        int middlePoint=0;
        
        do{
            System.out.print("Ingres un numero entero impar entre 1 y 19: ");
            row=in.nextInt();

            if(row%2==0){
                row=0;
            }
        
        }while(row<=0 || row>19);
        

        middlePoint=row/2;
        middlePoint+=(row%2);

        for(int i=1; i<=middlePoint; i++){

            for(int j=1; j<=middlePoint-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        middlePoint--;

        for(int i=1; i<=middlePoint; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(middlePoint-i)*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
            
        
    }//end main
}//end Diamond