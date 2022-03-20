/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 23: Show special characters * & + with respect to condition
*/
public class Mystery02{
    public static void main(String[] args){
        int count=1;

        while(count<=10){
            System.out.println(count%2==1?"****":"++++++++");
            ++count;
        }
    }//end main
}//end Mystery02