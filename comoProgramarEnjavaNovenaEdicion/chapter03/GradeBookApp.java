/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 01.- Class GradeBookApp is the application for execute. 
*/
import java.util.Scanner;

public class GradeBookApp{
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String nameCourse="";

        //Creaate object type GradeBook
        GradeBook gradeBook01=new GradeBook();

        /*call method of the class GradeBook
        gradeBook01.showMessage();*/

        /*Modified of chapter 3.3
        System.out.print("Ingrese el nombre del curso: ");
        nameCourse=in.nextLine();
        System.out.println();

        call method with pased of parameter
        gradeBook01.showMessage(nameCourse);*/
        
        /*Modified of chapter 3.4*/
        System.out.print("El nombre del curso es: "+gradeBook01.getNameCourse());
        
        System.out.print("\nIngrese el nombre del curso: ");
        nameCourse=in.nextLine();
        gradeBook01.setNameCourse(nameCourse);
        System.out.println();

        gradeBook01.showMessage();
    }//end main

}//end class GradeBookApp