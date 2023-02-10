package date.controller;

public class DetailsDate extends Date{
    private static String[] arrayMonth={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public DetailsDate(){
    }

    public DetailsDate(String date){
        super(date);
    }

    public String toString(){
        return getDay() + " de "+ (arrayMonth[getMonth()-1]) +" de "+getYear();
    }
}//end DetailsDate    