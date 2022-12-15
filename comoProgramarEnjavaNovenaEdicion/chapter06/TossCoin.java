/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 34: Toss Coins.
*/
import java.util.Scanner;
import java.util.Random;

public class TossCoin{
    static Scanner in=new Scanner(System.in);
    enum STATUS{SOL, AGUILA};
    static Random num=new Random();
    static int countSol=0;
    static int countAguila=0;
    static int option=0;

    static void tossCoin(){
        int value=0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("======= Lanzamiento de Modeda ========");
        
        do{
            value=num.nextInt(2);
        
            if(value!=1){
                System.out.println(STATUS.AGUILA);
                countAguila++;
            }else{
                System.out.println(STATUS.SOL);
                countSol++;
            }

            System.out.print("\nPresione 1 para lanzar otra moneda.\nPresione 2 para regresar al menu\nIngresa una opcion: ");
            option=in.nextInt();
        }while(option!=2);

        showMenu();
    }//end tossCoin   

    static void showResults(int sol, int aguila){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("======= Resultados de lanzamientos ========");
        System.out.println("\nSol: "+sol+" veces\nAguila: "+aguila+" veces\n");
        
        System.out.print("Ingrese 1 para regresar al menu.\nIngrese 2 para lanzar monedas.\nOpcion: ");
        option=in.nextInt();
        
        if(option!=1){
            tossCoin();
        }else{
            showMenu();
        }
    }

    static void showMenu(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("======= Menu del Volado ========");

        System.out.print("\t1.-Lanzar moneda.\n\t2.-Mostrar lanzamientos.\n\t3.-Salir.\nElegir Opcion: ");
        option=in.nextInt();

        switch(option){
            case 1:
                tossCoin();
                break;
            case 2:
                showResults(countSol, countAguila);
                break;
            default:
                System.out.println("Adios");
                break;       
        }//end switch
    }//end showMenu
    
    public static void main(String[] args){
        
        showMenu();
                
    }//end main
}//end TossCoin