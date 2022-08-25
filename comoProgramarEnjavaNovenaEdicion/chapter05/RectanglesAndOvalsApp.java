/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 10: Execute Graphic Interface, with java from console mode. 
*/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RectanglesAndOvalsApp{
    public static void main(String[] args){
        RectanglesAndOvals panel;
        JFrame jFrame=new JFrame();

        String strOption=JOptionPane.showInputDialog("Escriba 1 para dibujar Rectangulos\nEscriba 2 para dibujar Ovalos.");

        int intOption=Integer.parseInt(strOption);

        panel=new RectanglesAndOvals(intOption);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(panel);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);

    }//end main
}//end RectanglesAndOvalsApp