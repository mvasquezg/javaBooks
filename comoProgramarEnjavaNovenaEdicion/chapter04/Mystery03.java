/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 24: Show special characters * & + with respect to condition
*/
public class Mystery03{
    public static void main(String[] args){
        int row=10;
        int column;

        while(row>=1){
            column=1;
           
            while(column<=10){
                System.out.print(row%2==1?"<":">");
                ++column;
            }
            --row;
            System.out.println();
            
        }
    }//end main
}//end Mystery03