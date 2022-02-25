/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 05.-Calculate of two numbers with graphic interface. 
*/
import javax.swing.JOptionPane;

public class SumTwoNumbersWithGraphicInterface{
    public static void main(String[] args){
        int num01=0, num02=0, sum=0;

        num01=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num02=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

        sum=num01+num02;

        JOptionPane.showMessageDialog(null, "La suma de los dos numeros es igual a: "+sum);
    }//end main
}//end SumTwoNumbersWithGraphicInterface