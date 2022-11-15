/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 07: Scope of variables
*/

public class ScopeVariables{
    private static int x=1;

    
    public static void main(String[] args){
        int x=5;

        System.out.println("La variable x local en main es: "+x);

        useVariableLocal();
        useField();
        useVariableLocal();
        useField();

        System.out.println("\nLa x local en main es "+x);
    }//end main

    public static void useVariableLocal(){
        int x =25;

        System.out.println("\nLa x local, al entrar en el metodo useVariableLocal es "+x);
        ++x;
        System.out.println("La x local, antes de salir del metodo useVariableLocal es "+x);
    }

    public static void useField(){
       
        System.out.println("\nEl campo x al entrar al metodo useField: "+x);
        x*=10;
        System.out.println("El campo x antes de salir del metodo useField: "+x); 
    }
}//end ScopeVariables