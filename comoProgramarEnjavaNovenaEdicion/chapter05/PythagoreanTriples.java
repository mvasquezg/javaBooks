/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 26: Show Pythagorean triple.
*/

public class PythagoreanTriples{
    public static void main(String[] args){
        final int POTENCY=2;

        for(double i=1; i<500; i++){
            for(double j=1; j<500; j++){
                for(double k=1; k<500; k++){
                    
                    if( (Math.pow(i, POTENCY) + Math.pow(j, POTENCY))  == Math.pow(k, POTENCY)){
                        System.out.println(i +"^"+POTENCY+" + "+j+"^"+POTENCY+" = "+k+"^"+2+" ("+Math.pow(k, POTENCY)+")");
                    }   

                }
            }   
        }

    }//end main
}//end PythagoreanTriples