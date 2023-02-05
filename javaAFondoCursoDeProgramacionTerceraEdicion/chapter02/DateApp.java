/**
  *Book: Java in depth programming course
  *Chapter 02: Classes and Objects.
  *Programa 01: Date
*/

public class DateApp{
    public static void main(String[] args){
        Date date=new Date();

        date.setDay(2);
        date.setMonth(10);
        date.setYear(1970);

        System.out.println("Dia = "+date.getDay());
        System.out.println("Mes = "+date.getMonth());
        System.out.println("Anho = "+date.getYear());




    }//end main
}//end DateApp