/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Program 01.- Class GradeBookApp is the application for execute. 
*/

public class GradeBookApp{
      public static void main(String[] args){

      GradeBook gradeBook01=new GradeBook("CS101 Introduccion a la programacion en Java", "Atilano Sanchez Aguilar");
      
      gradeBook01.showMessage();
      System.out.println();
      gradeBook01.calculateClassAverage();


    }//end main

}//end class GradeBookApp