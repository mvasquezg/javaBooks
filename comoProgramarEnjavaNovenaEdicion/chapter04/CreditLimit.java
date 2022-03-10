/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 16: Caculate the credi limit.
*/
import java.util.Scanner;

public class CreditLimit{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int accountNumber=0, balanceBenginningMonth=0, totalItemInTheMonth=0, totalCredit=0, creditLimit=0, newBalance;

        System.out.print("Ingresa el numero de cuenta numerico: ");
        accountNumber=in.nextInt();
        
        System.out.print("Ingresa el numero el saldo Inicial del mes del cliente: ");
        balanceBenginningMonth=in.nextInt();

        System.out.print("Ingresa el numero total de articulos cargados por el cliente en el mes: ");
        totalItemInTheMonth=in.nextInt();

        System.out.print("Ingresa el total de los creditos aplicados a la cuenta del cliente en el mes: ");
        totalCredit=in.nextInt();

        System.out.print("Ingresa el limite de credito: ");
        creditLimit=in.nextInt();

        newBalance=(balanceBenginningMonth+totalItemInTheMonth-totalCredit);

        System.out.println("Su nuevo saldo es: "+newBalance);

        if(newBalance>creditLimit){
            System.out.println("Se excedio del limite de Credito");
        }
    }//end main
}//end CreditLimit