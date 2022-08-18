/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 06: Execute the app calling to class that executed Multiple selection switch
*/
public class GradeBookApp{

    public static void main(String[] args){
        GradeBook gradeBook=new GradeBook("CS101 Introduccion a la programacion en Java");

        gradeBook.showMessage();
        gradeBook.enterRaiting();
        gradeBook.showReportCards();
    }//end main

}//end GradeBook