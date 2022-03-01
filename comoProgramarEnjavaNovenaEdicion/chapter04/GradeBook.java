/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Program 01.- Class GradeBookApp execute while iteration. 
*/
import java.util.Scanner;

public class GradeBook{
    
    //Variables
    private String nameCourse;
    private String nameInstructor;

    public GradeBook(String nameCourse, String nameInstructor){
        this.nameCourse=nameCourse;
        this.nameInstructor=nameInstructor;
    }//end GradeBook*/

    //Methods sets
    public void setNameCourse(String nameCourse){
        this.nameCourse=nameCourse;
    }//end setNameCourse

    //Modified of chapter 3 exercise 3.11
    public void setNameInstructor(String nameInstructor){
        this.nameInstructor=nameInstructor;
    }//end setNameInstructor

    //Method gets
    public String getNameCourse(){
        return this.nameCourse;
    }//end getNameCourse

    //Modified of chapter 3 exercise 3.11
    public String getNameInstructor(){
        return this.nameInstructor;
    }//end getNameInstructor

    public void showMessage(){
        System.out.println("Bienvenido al libro de calificaciones: "+getNameCourse()+"\nEste curso es presentado por: "+getNameInstructor());
    }

    public void calculateClassAverage(){
        Scanner in=new Scanner(System.in);
        int sumQualifications=0;
        int countQualifications=0;
        int qualification=0;
        //int average=0;
        
        //Modified Chapter 04.9
        double average=0.0f;
        
        System.out.print("Ingrese la calificacion o -1 para terminar: ");
        qualification=in.nextInt();

        while(qualification!=-1){
            sumQualifications=sumQualifications+qualification;
            countQualifications=countQualifications+1;

            System.out.print("Ingrese la calificacion o -1 para terminar: ");
            qualification=in.nextInt();
        }//end while

        if(countQualifications!=0){
            average=(double) sumQualifications/countQualifications;
            System.out.println("\nEl total de las "+countQualifications+" calificaciones es: "+sumQualifications);
            System.out.println("El promedio de la clase es: "+average);
        }else{
            System.out.println("No se introdujeron calificaciones.");
        }     
    }
}//end class GradeBook