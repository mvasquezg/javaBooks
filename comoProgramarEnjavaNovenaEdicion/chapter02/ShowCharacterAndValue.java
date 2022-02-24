/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 18.- Show the integer value some of characters upper letters, lower letters, numbers and special characters.
  * Muestre los equivalentes enteros de los sigiienetes caracteres: A B C a b c 0 1 2 $ * + /  y el caracter en blanco.
*/

public class ShowCharacterAndValue{

    public static void main(String[] args){
        System.out.println("A = "+ (int)('A')+"\n"+"B = "+ (int)('B')+"\n"+"C = "+ (int)('C')+"\n\na = "+ (int)('a')+"\n"+"b = "+ (int)('b')+"\n"+"c = "+ (int)('c')+"\n"+"\n0 = "+ (int)('0')+"\n"+"1 = "+ (int)('1')+"\n"+"2 = "+ (int)('2')+"\n"+"\n$ = "+ (int)('$')+"\n"+"* = "+ (int)('*')+"\n"+"+ = "+ (int)('+')+"\n/ = "+ (int)('/')+"\n = "+ (int)(' ')+"\n");
    }//end main

}//end ShowCharacterAndValue