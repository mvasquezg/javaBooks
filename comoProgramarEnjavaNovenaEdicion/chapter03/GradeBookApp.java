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
        //GradeBook gradeBook01=new GradeBook();

        /*call method of the class GradeBook
        gradeBook01.showMessage();*/

        /*Modified of chapter 3.3
        System.out.print("Ingrese el nombre del curso: ");
        nameCourse=in.nextLine();
        System.out.println();

        call method with pased of parameter
        gradeBook01.showMessage(nameCourse);*/
        
        /*Modified of chapter 3.4
        System.out.print("El nombre del curso es: "+gradeBook01.getNameCourse());
        
        System.out.print("\nIngrese el nombre del curso: ");
        nameCourse=in.nextLine();
        gradeBook01.setNameCourse(nameCourse);
        System.out.println();

        gradeBook01.showMessage();
        */

        /*modified chapter 3.6
        GradeBook gradeBook01=new GradeBook("CS101 Introduccion a la programacion en Java");
        GradeBook gradeBook02=new GradeBook("CS102 Estructuras de datos en Java");

        System.out.println("El nombre del curso de libro calificaciones 01 es: "+gradeBook01.getNameCourse());
        System.out.println("El nombre del curso de libro calificaciones 01 es: "+gradeBook02.getNameCourse());
      */
      
      //Modified of chapter 3 exercise 3.11
      GradeBook gradeBook01=new GradeBook("CS101 Introduccion a la programacion en Java", "Atilano Sanchez Aguilar");
      GradeBook gradeBook02=new GradeBook("CS102 Estructuras de datos en Java", "Erasmo Gonzalez");

      gradeBook01.showMessage();
      System.out.println();
      gradeBook02.showMessage();


    }//end main

}//end class GradeBookApp