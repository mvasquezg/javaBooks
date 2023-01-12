/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 13: Grade Book using Two-Dimensional array APP.
*/

public class GradeBookBidimensionalArrayApp{
    public static void main(String[] args){
        int[][] arrayCal={{87, 96, 70},
                          {68, 87, 90}, 
                          {94, 100, 90},
                          {100, 81, 82},
                          {83, 65, 85},
                          {78, 87, 65},
                          {85, 75, 83},
                          {91, 94, 100},
                          {76, 72, 84},
                          {87, 93, 73}};

        GradeBookBidimensionalArray gradeBook=new GradeBookBidimensionalArray("CS101 Introduccion a la programacion en Java", arrayCal);

        gradeBook.showMessage();
        gradeBook.processQualification();
    }//end main
}//end GradeBookApp