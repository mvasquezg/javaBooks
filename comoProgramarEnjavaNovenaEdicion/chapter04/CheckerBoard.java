/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 30: show Checker Board.
*/

public class CheckerBoard{
    public static void main(String[] args){
        int row=1, column=1;

        while(row<=8){
            
            while(column<=8){

                if(row%2==0){
                    if(column==1){
                        System.out.print(" ");
                    }else{
                        System.out.print("* ");    
                    }

                }else{
                    System.out.print("* ");
                }

                column++;
            }

            System.out.println();
            column=1;
            row++;
        }
        
    }
}//end CheckerBoard