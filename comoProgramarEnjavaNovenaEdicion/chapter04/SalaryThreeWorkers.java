/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 18: Caculate the sales workers.
*/
import java.util.Scanner;

public class SalaryThreeWorkers{
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int hoursWorked=0, normalHours=40, hoursExtra=0;
       //worker=1,
       float payPerHour=0.0f, salary=0.0f, salaryExtra=0.0f, totalSalary=0.0f;


      System.out.print("Para salir del programa presione un numero negativo o cero\n\nIngrese las horas trabajadas del empleado: ");
      hoursWorked=in.nextInt();
        
      while(hoursWorked!=1 && hoursWorked>0){
        System.out.print("Ingrese el pago por hora del trabajador: ");
        payPerHour=in.nextFloat();

        hoursExtra=hoursWorked-normalHours;

        salary=(float) normalHours*payPerHour;
        salaryExtra=hoursExtra*((payPerHour/2)+payPerHour);

        totalSalary=salary+salaryExtra;

        System.out.println("\nTotal de horas trabajadas: "+hoursWorked+"\nPago de las 40 horas: "+salary+"\nHoras extra: "+hoursExtra+"\nPago de las horas extra: "+salaryExtra+"\nTotal a pagar: "+totalSalary);
        System.out.print("\nIngrese las horas trabajadas del empleado, para salir presione un numero negativo o cero: ");
        hoursWorked=in.nextInt();
   
      }     
    }//end main
}//end SalaryThreeWorkers