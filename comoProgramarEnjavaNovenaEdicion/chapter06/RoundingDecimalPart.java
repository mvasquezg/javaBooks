/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 16: Calculate Rounding Decimal part.
*/
import java.util.Scanner;

public class RoundingDecimalPart{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        double number=0.0;

        System.out.print("Ingresa un numero: ");
        number=in.nextDouble();

        System.out.println("Redondear numero: "+number+" a decimo =" +Math.floor(number*10+0.5)/10);
        System.out.println("Redondear numero: "+number+" a centesimo =" +Math.floor(number*100+0.5)/100);
        System.out.println("Redondear numero: "+number+" a milesimo =" +Math.floor(number*1000+0.5)/1000);
    }//end main
}//end RoundingDecimalPart