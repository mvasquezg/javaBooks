/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 30: Use Casting.
*/

public class Casting{
    public static void main(String[] args){
        int number=43;

        System.out.println("Numero entero: "+number);

        System.out.println("Casteando el numero entero a String: "+(Integer.toString(number)));

        System.out.println("Casteando el numero de String a entero: "+(Integer.parseInt(Integer.toString(number))));

        double decimalNumber=24.2;

        System.out.println("\nNumero decimal: "+decimalNumber);

        System.out.println("Casteando el numero decimal a String: "+(Double.toString(decimalNumber)));

        System.out.println("Casteando el numero de String a decimal: "+(Double.parseDouble(Double.toString(decimalNumber))));
        
    }//end main
}//end Casting