/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 36: Cosntant Epsilon Square.
*/
import java.util.Scanner;

public class EpsilonSquare{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=0, x=1;

        System.out.print("Ingresa un numero: ");
        number=in.nextInt();

        System.out.print(x);
        while(x<=number){
            
            if(x==1){
                System.out.print(" + x/"+x+"!");
            }else{
                System.out.print(" + x^"+x+"/"+x+"!");
            }
            
            x++;
        }
        System.out.println();

    }//end main
}//end EpsilonSquare