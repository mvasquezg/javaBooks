/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 25: Print the value of PI.
*/

public class PIValue{

    public static void main(String[] args){
        double cotient=4, residue=3;
        double totalResidue=0.0, pi=0.0;
        
        System.out.print("PI = "+cotient+" - (" );
        for(int i=1; i<200000; i++){
            System.out.print( "("+cotient+"/"+residue+") + "  );

            totalResidue=(cotient/residue);
            
            residue+=2;
        }
        pi= cotient - totalResidue;

        System.out.print(")\nPI = "+pi+"\n");


    }//end main

}//end PIValue