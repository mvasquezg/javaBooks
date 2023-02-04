/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 23: Converter Uppercase to Lowercase.
*/

public class UpperCaseToLowerCase{
    public static void main(String[] args){
        String s="Esto Es Una Cadena De Caracteres";
        String sMinus=s.toLowerCase();
        String sMayus=s.toUpperCase();

        System.out.println("Cadena original: "+s);
        System.out.println("Cadena en minusculas: "+sMinus);
        System.out.println("Cadena en mayusculas: "+sMayus);

    }
}//end UpperCaseToLowerCase
