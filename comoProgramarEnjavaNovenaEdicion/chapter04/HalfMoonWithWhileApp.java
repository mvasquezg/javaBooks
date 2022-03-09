/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Program 07.-Drawing Board, drawing half moon with lines while iteration App. 
*/
import javax.swing.JFrame;

public class HalfMoonWithWhileApp{
    public static void main(String[] args){

        HalfMoonWithWhile halfMoonWithWhile=new HalfMoonWithWhile();

        JFrame jFrame=new JFrame();

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.add(halfMoonWithWhile);
        jFrame.setSize(250, 250);
        jFrame.setVisible(true);

    }//end main
}//end HalfMoonWithWhileApp