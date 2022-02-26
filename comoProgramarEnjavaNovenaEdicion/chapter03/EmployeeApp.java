/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 07.-Class for execute the app. 
*/
import java.util.Scanner;

public class EmployeeApp{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Employee employee01=new Employee("Miguel", "Vasquez", 100);
        Employee employee02=new Employee("Geovani", "Hernandez", 200);    

        System.out.println("Empleado: "+employee01.getNameEmployee()+" "+employee01.getFirstName()+"\nSalario Mensual: "+employee01.getMonthlySalary()+"\nSalario Anual: "+employee01.calculateAnnualSalary()+"\nSalario con el 10% anual: "+employee01.calculateNewAnnualSalary());
        System.out.println("\nEmpleado: "+employee02.getNameEmployee()+" "+employee02.getFirstName()+"\nSalario Mensual: "+employee02.getMonthlySalary()+"\nSalario Anual: "+employee02.calculateAnnualSalary()+"\nSalario con el 10% anual: "+employee02.calculateNewAnnualSalary());

    }//end main

}//end EmployeeApp