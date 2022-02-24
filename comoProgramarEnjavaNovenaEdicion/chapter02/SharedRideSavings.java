/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 24.-Show the cost per day for driven to job. 
*/
import java.util.Scanner;

public class SharedRideSavings{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int kilometersDrivenPerDay=0;
        int costPerLiterOfGasoline=0;
        int averageKilometersPerLiters=0;
        int parkingFeePerDay=0;
        int tollPerDay=0;
        int averageExpensesPerDay=0;

        System.out.print("Ingrese la cantidad de kilometros manejado por dia: ");
        kilometersDrivenPerDay=in.nextInt();

        System.out.print("Ingrese el costo de gasolina por dia: ");
        costPerLiterOfGasoline=in.nextInt();

        System.out.print("Ingrese el promedio de kilometros por litro: ");
        averageKilometersPerLiters=in.nextInt();

        System.out.print("Ingrese la couta de estacionamiento por dia: ");
        parkingFeePerDay=in.nextInt();

        System.out.print("Ingrese peaje por dia: ");
        tollPerDay=in.nextInt();

        averageExpensesPerDay=(costPerLiterOfGasoline+parkingFeePerDay+tollPerDay)/3;

        System.out.println("Total de gastos por dia: "+averageExpensesPerDay);

    }//end main
}//end SharedRideSavings