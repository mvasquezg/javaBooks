/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 14: Calculate payment for parking.
*/
import java.util.Scanner;

public class PaymentForParking{
    static final double PRICE_THREE_HOURS=2.00;
    static final double PRICE_EACH_24_HOURS=10.00;
    static final double PRICE_EACH_ADITIONAL_HOURS=0.50;
    
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        
        int hours=0;
        int parkingHours=0;
        int aditionalHours=0;
        double price=0;

        System.out.print("Ingre el numero de horas: ");
        hours=in.nextInt();

        parkingHours=hours/24;
        aditionalHours=hours%24;

        if(parkingHours!=0){

            if(aditionalHours>3){
                price=(PRICE_EACH_24_HOURS*parkingHours)+((aditionalHours-3)*PRICE_EACH_ADITIONAL_HOURS)+PRICE_THREE_HOURS;
            }else{
                price=PRICE_EACH_24_HOURS*parkingHours+PRICE_THREE_HOURS;
            }

        }else{
            if(aditionalHours>3){
                price=((aditionalHours-3)*PRICE_EACH_ADITIONAL_HOURS)+PRICE_THREE_HOURS;
            }else{
                price=PRICE_THREE_HOURS;
            }
        }

        

        System.out.println("Total a pagar: "+price);

    }//end main
}//end PaymentForParking