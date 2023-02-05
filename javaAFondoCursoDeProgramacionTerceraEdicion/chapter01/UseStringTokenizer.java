/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 32: Use StringTokenizer.
*/
import java.util.StringTokenizer;

public class UseStringTokenizer{
    public static void main(String[] args){
        String names="Juan|Marcos|Carlos|Matias";
        StringTokenizer st=new StringTokenizer(names, "|");

        System.out.println("Cadena original: "+names);

        String tok;

        while(st.hasMoreTokens()){
            tok=st.nextToken();
            System.out.println(tok);    
        }
    }//end main
}//end UseStringTokenizer