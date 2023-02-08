/**
  *Book: Java in depth programming course
  *Chapter 02: Classes and Objects.
  *Programa 01: Date
*/

public class Date{
    
    private int day;
    private int month;
    private int year;

    //Constructor
    public Date(){
    }

    public Date(String sDate){
        int pos1=sDate.indexOf('/');
        int pos2=sDate.lastIndexOf('/');

        String sDay=sDate.substring(0, pos1);
        this.day=Integer.parseInt(sDay);

        String sMonth=sDate.substring(pos1+1, pos2);
        this.month=Integer.parseInt(sMonth);

        String sYear=sDate.substring(pos2+1);
        this.year=Integer.parseInt(sYear);
    }

    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
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
    //Sobreescribiendo el metodo toString
    public String toString(){
        return this.day+"/"+month+"/"+year;
    }

    //Sobreescribiendo el metodo equals
    public boolean equals(Object o){
        Date otherDate= (Date) o;
        return (this.day==otherDate.day) && (this.month==otherDate.month) && (this.year==otherDate.year);
    }

    private int dateTotalInDays(){
        return year*360+month*30+day;
    }//end dateTotalInDays

    public void daysToDate(int i){
        this.year=i/360;

        int resto=i%360;

        this.month=resto/30;

        this.day=resto%30;

        if(this.day==0){
            this.day=30;
            this.month--;
        }

        if(this.month==0){
            this.month=12;
            this.year--;
        }
    }//end daysToDate

    public void addDays(int days){
        int sum=dateTotalInDays()+days;

        daysToDate(sum);
    }    
    // ------------- end Others Methods -------------

}//end Date