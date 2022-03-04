/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Program 04.-Drawing BoardApp. 
*/
import javax.swing.JFrame;

public class DrawingBoardWhileApp{
    public static void main(String[] args){
        
      //Crea un panel que contiene nuestro dibujo
      DrawingBoardWhile drawingBoard=new DrawingBoardWhile();
        
      //Crea un nuevo marco para contener el panel
      JFrame jFrame=new JFrame();

      //Establece el marco para salir cuando cierre
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      jFrame.add(drawingBoard); //Agrega el panel al marco
      jFrame.setSize(250, 250); //Estable el tamanho del marco
      jFrame.setVisible(true); //hace que el marco sea visible
    }//end main
}//end DrawingBoardApp