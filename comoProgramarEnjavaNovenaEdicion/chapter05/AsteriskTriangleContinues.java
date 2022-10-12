/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 05: Control instructions part II.
  *Programa 27: Print asterisk triangles continues.
*/

public class AsteriskTriangleContinues{
    public static void main(String[] args){

        int row=10;
        int column=row;

        System.out.print("a)\t\tb)\t\tc)\t\td)\n");
        for(int i=1; i<=row; i++){
            
            for(int j=1; j<=column; j++){
                if(j<=i && j<=column){
                    System.out.print("*");
                }else if(j>i && j<=column){
                    System.out.print(" ");
                }
            }//end for j
          
            System.out.print("     ");
          
            for(int x=0; x<=column; x++){
           
                if(x<=(column-i)){
                    System.out.print("*");
                }else if(x<=column){
                    System.out.print(" ");
                }
            }

            System.out.print("     ");

            for(int z=1; z<=column; z++){
                
                if((column-i)<(column-z)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }  

            System.out.print("     ");
          
            for(int y=1; y<=column; y++){
                if(y <= (column-i)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }

            System.out.println();
        }//end for i
        System.out.println();
    }//end main
}//end AsteriskTriangleContinues