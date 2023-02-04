/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 22: Arguments from command line.
*/

public class Strings{
    public static void main(String[] args){
        String s="Esta es mi cadena";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));
        System.out.println(s.charAt(s.length()-1));
        System.out.println();
        char c;

        for(int i=0; i<s.length();i++){
            c=s.charAt(i);
            System.out.println(i+" -> "+c);
        }

    }//end main
}//end Strings