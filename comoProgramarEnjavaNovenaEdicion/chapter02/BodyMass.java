/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 02: Introduction to apps in Java,
  *Program 22.- Show el BMI in libs o Kg.
*/

import java.util.Scanner;

public class BodyMass{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int option=0;
        double bodyMass=0, height=0, weight=0;

        System.out.print("Si desea calcular tu masa corporal en\n\nLibras presiona 1\nKilogramos presiona 2\nPresiona una opcion: ");    
        option=in.nextInt();

        

        if(option==1){
            
            System.out.print("\nIngresa tu peso en libras: ");
            weight=in.nextDouble();

            System.out.print("Ingresa tu altura en pulgadas: ");
            height=in.nextDouble();
            
            bodyMass= (weight*703)/(height*height);

            System.out.println("\ntu masa corporal es igual a: "+bodyMass+" libs");
        }else if(option==2){
            
            System.out.print("\nIngresa tu peso en Kilogramos: ");
            weight=in.nextDouble();

            System.out.print("Ingresa tu altura en Metros: ");
            height=in.nextDouble();
            
            
            bodyMass= weight/(height*height);
            System.out.println("\ntu masa corporal es igual a: "+bodyMass+" Kg");
        }

        System.out.println("\nVALORES DEL BMI\nBajo de peso: menos de 18.5\nNormal: entre 18.5 y 24.9\nSobrepeso: entre 25 y 29.9\nObeso: 30 o mas.");
    }//end main

}//end BodyMass