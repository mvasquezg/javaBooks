/**
  *Book: Java in depth programming course
  *Chapter 02: Classes and Objects.
  *Programa 01: Date
*/

public class Date{
    
    private int day;
    private int month;
    private int year;

    // ------------- Start Methods Set -------------
    public void setDay(int day){
        this.day=day;
    }

    public void setMonth(int month){
        this.month=month;
    }

    public void setYear(int year){
        this.year=year;
    }
    // ------------- end Methods Set -------------

    // ------------- Start Methods Get -------------
    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }
    // ------------- end Methods Get -------------

    // ------------- Start Others Methods -------------
    public String toString(){
        return this.day+"/"+month+"/"+year;
    }
    // ------------- end Others Methods -------------

}//end Date