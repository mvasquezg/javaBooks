/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 09.-Class to create objects type Heart Rate. 
*/
public class HeartRate{

    private String name;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private int currentYear=2022;
    private int pulse=220;

    public HeartRate(String name, String lastName, int day, int month, int year){
        this.name=name;
        this.lastName=lastName;
        this.day=day;
        this.month=month;
        this.year=year;
    }

    //Method Set
    public void setName(String name){
        this.name=name;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
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

    //Method get
    public String getName(){
       return this.name;
    }

    public String getLastName(){
        return this.lastName;
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

    //Other methods
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

}//end HeartRate