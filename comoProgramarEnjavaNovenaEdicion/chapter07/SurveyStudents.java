/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 07: Survey Students
*/


public class SurveyStudents{
    public static void main(String[] args){
        int[] answerArray={1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        int[] frequencyArray=new int[6];

        for(int i=0; i<answerArray.length;i++){
            try{
                ++frequencyArray[answerArray[i]];
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf(" Respuesta [%d] = %d\n\n",i, answerArray[i]);
            }
        }//end for from answer

        System.out.printf("%s %10s\n", "Calificacion", "Frecuencia");
        for(int i=1; i<frequencyArray.length; i++){
            System.out.printf("%6d %10d\n", i, frequencyArray[i]);
        }

    }//end main
}//end SurveyStudents