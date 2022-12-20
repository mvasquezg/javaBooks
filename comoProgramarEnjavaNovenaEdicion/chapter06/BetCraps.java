/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 38: Bet craps
*/

import java.util.Random;
import java.util.Scanner;

public class BetCraps{
    private static final Random randomNumber=new Random();

    //CONSTANTES QUE REPRESENTRAN EL ESTADO DEL JUEGO
    private enum PLAYSTATUS{NEXT, WIN, LOOSE};    
    
    //CONSTANTES QUE REPRESENTAN TIROS COMUNES
    private static final int TWO_ONES=2;
    private static final int THREE=3;
    private static final int SEVEN=7;
    private static final int ELEVEN=11;
    private static final int TWELVE=12;
    private static double balance=0;
    private static double bet=0;
    private static double cash=0;
    private static Scanner in=new Scanner(System.in);
    private static int myPoint=0;
    private static int sumDice=0;
    //private static double cash=0;
    private static PLAYSTATUS playStatus;



    static void setBalanceBank(){
        System.out.print("Ingrese una cantidad a la cuenta: ");
        cash=in.nextDouble();
        
        balance=cash;
    }//calculateBalanceBank

    static boolean canYouBet(double bet){
        boolean isBet=false;

        if(balance>=bet){
            isBet=true;            
        }else{
            isBet=false;
        }
        return isBet;
    }

    static void betCash(){
        do{
            System.out.print("Ingrese cantidad a apostar que sea menor o igual a su saldo: ");
            bet=in.nextDouble();

            if(!(balance>=bet)){
                System.out.println("La cantidad apostar es mayor a saldo.");
            }
        }while(bet>balance && bet==balance);            
    }

    static double removeCash(double cash){
        return balance-=cash;
    }

    public static void main(String[] args){
        
        
        System.out.println("========================= Inicia el saldo para realizar apuestas =========================");
        setBalanceBank();
        
        do{
            System.out.println("\n\n========================= Apuestas =========================");
            betCash();

            if(bet<balance){
                sumDice=rollDice();

                switch(sumDice){
                    case SEVEN:
                    case ELEVEN:
                        playStatus=PLAYSTATUS.WIN;
                        break;
                    case TWO_ONES:
                    case THREE:
                    case TWELVE:
                        playStatus=PLAYSTATUS.LOOSE;
                        break;
                    default:
                        playStatus=PLAYSTATUS.NEXT;
                        myPoint=sumDice;
                        System.out.print("El punto es: "+myPoint+"\n\n");
                        break;
                }//end switch

                while(playStatus==PLAYSTATUS.NEXT){
                    sumDice=rollDice();

                    if(sumDice==myPoint){
                        playStatus=PLAYSTATUS.WIN;
                    }else if(sumDice==SEVEN){
                        playStatus=PLAYSTATUS.LOOSE;
                    }
                }//end while

                if(playStatus==PLAYSTATUS.WIN){
                    System.out.println("El jugador gana.\n\n");
                    addCash(bet*2);
                    System.out.println("Usted tiene para apostar: "+getBalanceBank());
                }else{
                    System.out.println("El jugador pierde.\n\n");
                    removeCash(bet);
                    System.out.println("Usted tiene para apostar: "+getBalanceBank());
                }
            }else{
                break;
            }

        }while(balance!=0 && bet<=balance);
        
        
    }//end main

    public static int rollDice(){
        int dice01=1+randomNumber.nextInt(6);
        int dice02=1+randomNumber.nextInt(6);

        int sum=dice01+dice02;

        System.out.println("El jugador tiro\nDado 1: "+dice01+"\nDado 2: "+dice02+"\nTotal de puntos: "+sum+"\n");
        return sum;
    }

    static double getBalanceBank(){
        return balance;
    }//calculateBalanceBank

    

    static double addCash(double cash){
        return balance+=cash;
    }
    
}//end BetCraps