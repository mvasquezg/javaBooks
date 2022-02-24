/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 23.- Given World Population and annual growth rate, calculate World population in one, two, three, four and five years .
*/
import java.util.Scanner;

public class WorldPopulation{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        long currentWorldPopulation=0;
        int annualGrowthrate=0;
        int years=0;
        int currentYear=2022;

        System.out.print("Ingrese la poblacion mundial actual: ");
        currentWorldPopulation=in.nextLong();//7 962 725 466

        System.out.print("Ingrese la tasa de creimiento anual: ");
        annualGrowthrate=in.nextInt();

        System.out.print("A cuantos anhos desea calcular la poblacion: ");
        years=in.nextInt();

        System.out.println("Poblacion actual: "+currentWorldPopulation);
        for(int i=1; i<=years; i++){
            currentWorldPopulation+=(currentWorldPopulation*annualGrowthrate)/100;
            System.out.println("Anho "+i+": "+(currentYear+i)+" poblacion mundial: "+currentWorldPopulation);
        }
    }//main

}//end WorldPopulation