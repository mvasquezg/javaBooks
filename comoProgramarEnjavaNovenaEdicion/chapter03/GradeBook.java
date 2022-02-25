/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 01.- Class GradeBook for create objects this type. 
*/
public class GradeBook{
    /* 
    public void showMessage(){
        System.out.println("Bienvenido al libro de calificaciones");
    }*/

    /*Modified of chapter 3.3
        Method with parameter
        public void showMessage(String nameCourse){
            System.out.println("Bienvenido al libro de calificaciones: "+nameCourse);
        }//end showMessage
    */

    /*Modified of chapter 3.4*/
    //Variables
    private String nameCourse;
    
    //Modified of chapter 3 exercise 3.11
    private String nameInstructor;

    /*Modified of chapter 3.6 add constructor
    public GradeBook(String name){
        nameCourse=name;
    }//end GradeBook*/

    //Modified of chapter 3 exercise 3.11
    public GradeBook(String name, String instructor){
        nameCourse=name;
        nameInstructor=instructor;
    }//end GradeBook*/

    //Methods sets
    public void setNameCourse(String name){
        nameCourse=name;
    }//end setNameCourse

    //Modified of chapter 3 exercise 3.11
    public void setNameInstructor(String name){
        nameInstructor=name;
    }//end setNameInstructor

    //Method gets
    public String getNameCourse(){
        return nameCourse;
    }//end getNameCourse

    //Modified of chapter 3 exercise 3.11
    public String getNameInstructor(){
        return nameInstructor;
    }//end getNameInstructor

    //Others Methods
    /*public void showMessage(){
        System.out.println("Bienvenido al libro de calificaciones: "+getNameCourse());
    }//end showMessage*/

    //Modified of chapter 3 exercise 3.11
    public void showMessage(){
        System.out.println("Bienvenido al libro de calificaciones: "+getNameCourse()+"\nEste curso es presentado por: "+getNameInstructor());
    }

}//end class GradeBook