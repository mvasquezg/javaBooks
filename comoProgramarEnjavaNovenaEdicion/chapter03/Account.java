/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 02.- Class Account for create objects this type. 
*/

public class Account{
    
    //variables of instance
    private double balance;

    //Constructor
    public Account(double initialBalance){
        if(initialBalance>0){
            balance=initialBalance;
        }
    }

    //method Set

    //method Get
    public double getBalance(){
        return balance;
    }//end getBalance

    //Others methods
    public void payToAccount(double amount){
        balance=balance+amount;
    }//end payToAccount

    //Modified chapter 03 exercise 3.12
    public void withdrawals(double amount){
        if(amount>balance){
            System.out.println("Error: El monto a retirar es mayor al saldo.\nSaldo disponible: "+balance);
        }else {
            balance=balance-amount;
            System.out.println("Su saldo actual es igual a: "+balance);
        }
    }//end withdrawals
}//end Account