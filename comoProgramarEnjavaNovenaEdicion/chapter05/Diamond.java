/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 29: Print Diamon using bucle for.         
*/

public class Diamond{
    public static void main(String[] args){
        
        int row=11;
        int middlePoint=0;
        
        middlePoint=row/2;
        middlePoint+=(row%2);

        for(int i=1; i<=middlePoint; i++){

            for(int j=1; j<=middlePoint-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        middlePoint--;

        for(int i=1; i<=middlePoint; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(middlePoint-i)*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }//end main
}//end Diamond