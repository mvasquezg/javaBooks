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

}//end Account