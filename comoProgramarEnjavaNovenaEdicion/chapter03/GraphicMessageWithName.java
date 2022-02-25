/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 04.-Show message with name user with graphic interface. 
*/
import javax.swing.JOptionPane;

public class GraphicMessageWithName{
    public static void main(String[] args){
        //input name of user
        String name = JOptionPane.showInputDialog("cual es su nombre?");

        //Create message with name user
        String messageWithName=String.format("Bienvenido, %s a la programacion en java!", name);

        //show message
        JOptionPane.showMessageDialog(null, messageWithName);
    }//end main
}//end GraphicMessageWithName