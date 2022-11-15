/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 35: Anilizing the funcionality this program.
*/

import java.text.NumberFormat;

public class UsersFacebook{
    public static void main(String[] args){
        NumberFormat formatPercent=NumberFormat.getPercentInstance();
        
        long months=144, result=0, users=50000000; 
        double monthlyGrowth=0.05;
                
        System.out.print("Tabla de crecimiento del "+formatPercent.format(monthlyGrowth)+"\n");

        System.out.printf("%s%20s\n", "Mes", "Users");
        for(int i=1; i<=months; i++){   
                result=(long) (users*Math.pow(1.0+monthlyGrowth, i));
                
                if(result>=1000000000 && result<=2000000000){
                    System.out.println(i+"\t"+result+" se alcanzo la meta de los 1,000,000,000");
                }else{
                    System.out.println(i+"\t"+result);
                }
                
            monthlyGrowth+=0.01;
        }//end for
                
    }//en main
}//end CompoundInterest