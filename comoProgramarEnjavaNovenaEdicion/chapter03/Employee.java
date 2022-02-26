/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 07.-Class to create objects. 
*/
public class Employee{

    private String nameEmployee;
    private String firstName;
    private double monthlySalary;

    //Constructor
    public Employee(String nameEmployee, String firstName, double monthlySalary){
        this.nameEmployee=nameEmployee;
        this.firstName=firstName;
        
        if(monthlySalary>0){
            this.monthlySalary=monthlySalary;
        }
        
    }//end Employee

    //Methods set
    public void setNameEmployee(String nameEmployee){
        this.nameEmployee=nameEmployee;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary>0){
            this.monthlySalary=monthlySalary;
        }     
    }

    //Methods get
    public String getNameEmployee(){
        return this.nameEmployee;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public double getMonthlySalary(){
        return this.monthlySalary;
    }

    //Others Methods
    public double calculateAnnualSalary(){
        double totalSalary=0;

        totalSalary=getMonthlySalary()*12;

        return totalSalary;
    }

    public double calculateNewAnnualSalary(){
        double newSalary=0;

        newSalary=calculateAnnualSalary()*1.10;

        return newSalary;
    }
}//end Employee