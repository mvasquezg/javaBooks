/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 24: Position of a character in a String.
*/

public class PositionCharacterInAString{
    public static void main(String[] args){
        String s="Esto Es Una Cadena De Caracteres";

        int pos1=s.indexOf('C');
        int pos2=s.lastIndexOf('C');
        int pos3=s.indexOf('x');

        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);

    }//end main
}//end PositionCharacterInAString