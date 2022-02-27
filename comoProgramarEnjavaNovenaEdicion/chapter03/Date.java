/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 08.-Class to create objects type date. 
*/
public class Date{

    private int day;
    private int month;
    private int year;

    //Constructor
    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }//end Date

    //Methods Set
    public void setDay(int day){
        this.day=day;
    }   

    public void setMonth(int month){
        this.month=month;
    }

    public void setYear(int year){
        this.year=year;
    }

    //Methods Get
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
    public void showDate(){
        System.out.println(getMonth()+"/"+getDay()+"/"+getYear());
    }

}//end Date