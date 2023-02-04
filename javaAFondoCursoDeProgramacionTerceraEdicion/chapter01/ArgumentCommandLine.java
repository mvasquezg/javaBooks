/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 21: Arguments from command line.
*/

public class ArgumentCommandLine{
    public static void main(String[] args){

        System.out.println();

        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }

        System.out.println("\nTotal: "+args.length+" argumentos.");

    }//end main
}//end ArgumentCommandLine