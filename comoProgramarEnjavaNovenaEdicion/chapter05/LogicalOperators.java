/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 09: Use logical operators. 
*/

public class LogicalOperators{
    public static void main(String[] args){
        System.out.println("Operadores Logicos\n");

        System.out.println("Operador Logico condicional AND && "+
            "\nFalse && False == "+(false && false)+
            "\nFalse && True == "+(false && true)+
            "\nTrue && False == "+(true && false)+
            "\nTrue && True == "+(true && true)
        );

        System.out.println("\nOperador Logico condicional OR || "+
            "\nFalse || False == "+(false || false)+
            "\nFalse || True == "+(false || true)+
            "\nTrue || False == "+(true || false)+
            "\nTrue || True == "+(true || true)
        );

        System.out.println("\nOperador Logico booleano AND & "+
            "\nFalse & False == "+(false & false)+
            "\nFalse & True == "+(false & true)+
            "\nTrue & False == "+(true & false)+
            "\nTrue & True == "+(true & true)
        );

        System.out.println("\nOperador Logico booleano OR | "+
            "\nFalse | False == "+(false | false)+
            "\nFalse | True == "+(false | true)+
            "\nTrue | False == "+(true | false)+
            "\nTrue | True == "+(true | true)
        );

        System.out.println("\nOperador Logico exclusivo OR ^ "+
            "\nFalse ^ False == "+(false ^ false)+
            "\nFalse ^ True == "+(false ^ true)+
            "\nTrue ^ False == "+(true ^ false)+
            "\nTrue ^ True == "+(true ^ true)
        );

        System.out.println("\nOperador Logico Negacion ! "+
            "\n!False == "+(!false)+
            "\n!True == "+(!true)
        );
        
    }//end main
}//end LogicalOperators