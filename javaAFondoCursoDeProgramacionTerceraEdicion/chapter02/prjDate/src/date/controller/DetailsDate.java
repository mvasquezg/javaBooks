package date.controller;

public class DetailsDate extends Date{
    private static String[] arrayMonth={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public DetailsDate(){
        this(0,0,0);
    }

    public DetailsDate(String date){
        super(date);
    }

    public DetailsDate(int day, int month, int year){
        super(day, month, year);
    }

    public String toString(){
        return getDay() + " de "+ (arrayMonth[getMonth()-1]) +" de "+getYear();
    }
}//end DetailsDate    