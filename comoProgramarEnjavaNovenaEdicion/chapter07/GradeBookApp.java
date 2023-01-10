/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 11: Grade Book App.
*/

public class GradeBookApp{
    public static void main(String[] args){
        int[] arrayCal={87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook gradeBook=new GradeBook("CS101 Introduccion a la programacion en Java", arrayCal);

        gradeBook.showMessage();
        gradeBook.processQualification();
    }//end main
}//end GradeBookApp