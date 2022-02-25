/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 02.- Class AccountApp for execute the app. 
*/
import java.util.Scanner;

public class AccountApp{
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        //Variables
        double depositAmount=0;
        //Add Modified chapter 03 exercise 3.12
        double withdrawal;

        Account account01=new Account(50.00);
        Account account02=new Account(-7.53);

        //Show balance of the objects
        System.out.println("Saldo cuenta 01: "+account01.getBalance());
        System.out.println("Saldo cuenta 02: "+account02.getBalance());

        System.out.print("\n\nIngrese el deposito para la cuenta 01: ");
        depositAmount=in.nextDouble();
        account01.payToAccount(depositAmount);
        System.out.println("Sumando "+depositAmount+" al saldo de la cuenta 01");

        System.out.println("\n\nSaldo de la cuenta 01: "+account01.getBalance());
        System.out.println("Saldo de la cuenta 02: "+account02.getBalance());

        System.out.print("\n\nIngrese el deposito para la cuenta 02: ");
        depositAmount=in.nextDouble();
        account02.payToAccount(depositAmount);
        System.out.println("Sumando "+depositAmount+" al saldo de la cuenta 02");

        System.out.println("\n\nSaldo de la cuenta 01: "+account01.getBalance());
        System.out.println("Saldo de la cuenta 02: "+account02.getBalance());

        //Modified chapter 03 exercise 3.12
        System.out.print("\nIngrese el saldo a retirar de la cuenta 01: ");
        withdrawal=in.nextDouble();
        account01.withdrawals(withdrawal);
        
        System.out.print("\nIngrese el saldo a retirar de la cuenta 02: ");
        withdrawal=in.nextDouble();
        account02.withdrawals(withdrawal);
    }//end main    
}//end AccountApp