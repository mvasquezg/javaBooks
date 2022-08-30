/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 17: Print factorial one to tewnty. 
*/
public class Factorial{
    public static void main(String[] args){
        long factorial=1;
        int n=20;

        for(int i=1; i<=n; i++){
            System.out.println("\n"+i+"!\n ");
            factorial=i;
            System.out.print(i);
            for(int j=1; j<i; j++){
                factorial*=(i-j);
                System.out.print(" * "+(i-j)+" " );
            }
            System.out.print(" = "+factorial);
            System.out.println();
        }
    }//end main
}//end Factorial