/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 23: Compound Interest with Intger Numbers.
*/

import java.text.NumberFormat;

public class CompoundInterestWithInt{
    public static void main(String[] args){
        NumberFormat formatPercent=NumberFormat.getPercentInstance();
        
        int years=10, result=0, investement=1000; 
        double interestRate=0.05;
                
        for(int z=0; z<=5; z++){
            System.out.print("Tabla de interes del "+formatPercent.format(interestRate)+"\n");

            System.out.printf("%s%20s\n", "Anio", "Monto en deposito");
            for(int i=1; i<=years; i++){   
            
                result=(int) (investement*Math.pow(1.0+interestRate, i));
                System.out.println(i+"\t"+result);
           
            }//end for
            System.out.println();
            interestRate+=0.01;

            
        }

                
    }//en main
}//end CompoundInterest