/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 25: SubString.
*/

public class SubString{
    public static void main(String[] args){
        String s="Esto Es Una Cadena De Caracteres";
        String s1=s.substring(0, 7);
        String s2=s.substring(8, 11);

        String s3=s.substring(8);

        System.out.println("Cadena original:\n"+s+"\n");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }//end main
}//end SubString