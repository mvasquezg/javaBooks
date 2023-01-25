/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 18: Rain Bow App
*/
import javax.swing.JFrame;

public class RainbowApp{
    public static void main(String[] args){
        RainBow panel=new RainBow();
        JFrame app=new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(400, 250);
        app.setVisible(true);
    }//end main
}//end RainBowApp