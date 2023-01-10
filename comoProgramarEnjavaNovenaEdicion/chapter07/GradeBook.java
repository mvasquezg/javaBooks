/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 11: Grade Book.
*/
public class GradeBook{
    private String nameCourse;

    private int[] arrayQualification;

    public GradeBook(String nameCourse, int[] arrayQualification){
       this.nameCourse=nameCourse;
        this.arrayQualification=arrayQualification; 
    }

    public void setNameCourse(String nameCourse){
        this.nameCourse=nameCourse;
    }//end setNameCourse

    public String getNameCourse(){
        return nameCourse;
    }//End getNameCourse

    public void showMessage(){
        System.out.printf("¡Bienvenido al libro de calificaciones para %s!\n\n", getNameCourse());
    }

    public void processQualification(){
        printQualification();

        System.out.printf("\nEl promedio de la clase es: %.2f\n", getAverage());

        System.out.printf("\n\nLa calificacion mas baja en el libro de calificaciones es: %d\nLa calificacion mas alta en el libro de calificaciones es: %d\n", getMinimun(), getMaximun());

        printBartChart();
    }

    public int getMinimun(){
        int calMinimun=arrayQualification[0];

        for(int cal: arrayQualification){
            if(cal<calMinimun){
                calMinimun=cal;
            }
        }

        return calMinimun;
    }

    public int getMaximun(){
        int calMaximun=arrayQualification[0];

        for(int cal: arrayQualification){
            if(cal>calMaximun){
                calMaximun=cal;
            }
        }

        return calMaximun;
    }

    public double getAverage(){
        int total=0;

        for(int cal:arrayQualification){
            total+=cal;
        }   

        return (double) total/arrayQualification.length;
    }

    public void printBartChart(){
        System.out.println("\n\nDistribucion de calificaciones: ");

        int[] arrayFrequency=new int[11];

        for(int cal: arrayQualification){
            ++arrayFrequency[ cal/10];
        }

        for(int i=0; i<arrayFrequency.length; i++){
            if(i==10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", i*10, i*10+9);
            }

            for(int j=0; j<arrayFrequency[i]; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println();
    }  

    public void printQualification(){
        System.out.println("Las calificaciones son: ");

        for(int i=0; i<arrayQualification.length; i++){
            System.out.printf("Estudiante %2d: %3d\n", i+1, arrayQualification[i]);
        }
    }
    
}//end GradeBook