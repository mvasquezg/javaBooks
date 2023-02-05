/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 33: Use Method Split
*/

public class UseSplit{
    public static void main(String[] args){
        String names="Juan|Marcos|Carlos|Matias";
        String[] arrayToken=names.split("[|]");

        System.out.println("Cadena original: "+names);
        System.out.println("\nCadena usando el split: "); 
        for(int i=0; i<arrayToken.length; i++){
            System.out.println(arrayToken[i]);    
        }
    }//end main
}//end UseSplit