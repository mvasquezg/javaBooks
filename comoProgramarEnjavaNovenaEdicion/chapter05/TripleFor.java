/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 31: Print character using three bucles for.
*/

public class TripleFor{
    public static void main(String[] args){
        for(int i=0; i<=5; i++){
            for(int j=1; j<=3; j++){
                for(int k=1; k<=4; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();   
        }
    }//end main
}//end TripleFor