/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 26: Prefixes and suffixes.
*/
public class PrefixesAndSuffixes{
    public static void main(String[] args){
        String s="Un buen libro de java";

        boolean b1=s.startsWith("Un buen");
        boolean b2=s.startsWith("A");
        boolean b3=s.endsWith("java");
        boolean b4=s.endsWith("Un buen");

        System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4+"\n");

    }//end main
}//end PrefixesAndSuffixes