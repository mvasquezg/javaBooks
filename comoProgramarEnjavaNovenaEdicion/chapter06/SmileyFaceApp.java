
/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 09:Smiley Face
*/

import javax.swing.JFrame;

public class SmileyFaceApp{
    public static void main(String[] args){
        SmileyFace smileyFace=new SmileyFace();

        JFrame jFrame=new JFrame();

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(smileyFace);
        jFrame.setSize(230, 250);
        jFrame.setVisible(true);
    }//end main
}//end SmileyFaceApp