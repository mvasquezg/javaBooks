/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 04: Compound Interest.
*/

public class CompoundInterest{
    public static void main(String[] args){
        int years=10; 
        double interestRate=0.05, result=0.0, investement=1000.0;

        
        System.out.printf("%s%20s\n", "Anio", "Monto en deposito");
        for(int i=1; i<=years; i++){   
            
            result=investement*Math.pow(1.0+interestRate, i);
            System.out.printf("%4d%, 20.2f\n", i, result);
           
        }//end for        
    }//en main
}//end CompoundInterest