/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 18: Compound Interest.
*/

import java.text.NumberFormat;

public class CompoundInterest{
    public static void main(String[] args){
        NumberFormat formatPercent=NumberFormat.getPercentInstance();
        
        int years=10; 
        double interestRate=0.05, result=0.0, investement=1000.0;

        
        
        for(int z=0; z<=5; z++){
            System.out.print("Tabla de interes del "+formatPercent.format(interestRate)+"\n");

            System.out.printf("%s%20s\n", "Anio", "Monto en deposito");
            for(int i=1; i<=years; i++){   
            
                result=investement*Math.pow(1.0+interestRate, i);
                System.out.printf("%4d%, 20.2f\n", i, result);
           
            }//end for
            System.out.println();
            interestRate+=0.01;

            
        }

                
    }//en main
}//end CompoundInterest