/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 09.-Class for execute the app. 
*/
import java.util.Scanner;

public class HeartRateApp{

  public static void main(String[] args){
    Scanner in=new Scanner(System.in);

    HeartRate hearRate01=new HeartRate("", "", 0, 0, 0);

    System.out.println("Nombre del paciente: "+hearRate01.getName());
    System.out.println("Apellido del paciente: "+hearRate01.getLastName());
    System.out.println("Fecha de nacimiento del paciente mes: "+hearRate01.getMonth()+", dia: "+hearRate01.getDay()+", anho: "+hearRate01.getYear());
  
    System.out.print("\nIngrese el nombre del paciente: ");
    hearRate01.setName(in.nextLine());
    System.out.print("Ingrese el Apellido del paciente: ");
    hearRate01.setLastName(in.nextLine());
    System.out.print("Fecha de nacimiento del paciente: \ndia: ");
    hearRate01.setDay(in.nextInt());
    System.out.print("Fecha de nacimiento del paciente: \nmes: ");
    hearRate01.setMonth(in.nextInt());
    System.out.print("Fecha de nacimiento del paciente: \nanho: ");
    hearRate01.setYear(in.nextInt());
    
    System.out.println("\nNombre del paciente: "+hearRate01.getName());
    System.out.println("Apellido del paciente: "+hearRate01.getLastName());
    System.out.println("Edad del paciente: "+hearRate01.calculateAge());
    System.out.println("Frecuencia Cardiaca Maxima: "+hearRate01.calculateHeartRate());
    hearRate01.expectedHeartRate();

    
  }//end main

}//end HeartRateApp