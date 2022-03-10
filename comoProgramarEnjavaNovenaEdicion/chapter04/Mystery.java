/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 14: Mistery.
*/

public class Mystery{
    public static void main(String[] args){
        int y=0;
        int x=1;
        int total=0;

        while(x<=10){
            y=x*x;
            System.out.println(y);
            total+=y;
            ++x;
        }//end while
        System.out.println("El total es: "+total);
    }//end main
}//end Mystery