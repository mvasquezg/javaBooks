/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 10.-Class to create objects type Medical Profile. 
*/

public class MedicalProfile{

    private String name;
    private String lastName;
    private String sex;
    private int day, month, year;
    private int heightInCentimeters;
    private int weightInKilograms;
    private int currentYear=2022;
    private int pulse=220;

    public MedicalProfile(String name, String lastName, String sex, int day, int month, int year, int heightInCentimeters, int weightInKilograms){
        this.name=name;
        this.lastName=lastName;
        this.day=day;
        this.month=month;
        this.year=year;
        this.heightInCentimeters=heightInCentimeters;
        this.weightInKilograms=weightInKilograms;
    }

    //Methods set
    public void setName(String name){
        this.name=name;
    } 

    public void setLastName(String lastName){
        this.lastName=lastName;
    }   

    public void setSex(String sex){
        this.sex=sex;
    }
    
    public void setDay(int day){
        this.day=day;
    }
    
    public void setMonth(int month){
        this.month=month;
    }

    public void setYear(int year){
        this.year=year;
    }

    public void setHeightInCentimeters(int heightInCentimeters){
        this.heightInCentimeters=heightInCentimeters;
    }
    
    public void setWeightInKilograms(int weightInKilograms){
        this.weightInKilograms=weightInKilograms;        
    }

    //methods get
    public String getName(){
        return this.name;
    } 

    public String getLastName(){
        return this.lastName;
    }   

    public String getSex(){
        return this.sex;
    }
    
    public int getDay(){
        return this.day;
    }
    
    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public int getHeightInCentimeters(){
        return this.heightInCentimeters;
    }
    
    public int getWeightInKilograms(){
        return this.weightInKilograms;        
    }

    //Others methods
    //Calucale the age
    public int calculateAge(){
        int age=0;
        age=currentYear-getYear();

        return age;
    }

    public int calculateHeartRate(){
        int hearRate=0;
        int age=calculateAge();
        hearRate=pulse-age;

        return hearRate;
    }

    public void expectedHeartRate(){
        int rank=0;

        rank=(50*calculateHeartRate())/100;   
        System.out.print("Frecuencia cardiaca esperada:\nRango del 50%-85%\n50% :"+rank);
        rank=(85*calculateHeartRate())/100;   
        System.out.print("\n85%: "+rank+"\n");
    }

    public void calculateBodyMassIndex(){
        double bodyMass=0;
        int weight=getWeightInKilograms();
        System.out.println("*********pesos"+weight);
        double height=(double)getHeightInCentimeters()/100;
        System.out.println("*********alto"+height);
        
        bodyMass=weight/(height*height);   
        System.out.println("\ntu masa corporal es igual a: "+bodyMass+" Kg");
        System.out.println("\nVALORES DEL BMI\nBajo de peso: menos de 18.5\nNormal: entre 18.5 y 24.9\nSobrepeso: entre 25 y 29.9\nObeso: 30 o mas.");
    }

}//end MedicalProfile