/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 06: A more detailed analysis.
  *Programa 39: Table of Numbers
*/
public class TableOfNumbers{
    
    static String convertBinary(int number){
        int squareNumber=0;
        int position=0;
        int dividend=0,residue=0;
        String binaryNumber="";
        
        for(int i=0; i<=8; i++){
            squareNumber=(int) Math.pow(2, i);
            
            if(squareNumber<=number){
                position=i;
            }
        }
        
        squareNumber=(int) Math.pow(2, position);
        while(position>=0){
            dividend=number/squareNumber;
            residue=number%squareNumber;

            binaryNumber+=dividend;
            number=residue;
            squareNumber=(int) Math.pow(2, --position);
        }
        return binaryNumber;
    }//end convertBinary

    static String convertHexadecimalNumber(int number){
        long parameterNumber=number;
        long hexaNumber=0;
        int position=0;
        long dividend=0,residue=0;
        String hexadecimalNumber="";
        
        for(int i=0; i<=16; i++){
            hexaNumber=(long) Math.pow(16, i);
            if(hexaNumber<=parameterNumber){
                position=i;
            }
        }

        hexaNumber=(int) Math.pow(16, position);
        while(position>=0){
            dividend=parameterNumber/hexaNumber;
            residue=parameterNumber%hexaNumber;
            hexadecimalNumber+=dividend;
            parameterNumber=residue;
            hexaNumber=(int) Math.pow(16, --position);
        }
        return hexadecimalNumber;
    }//end convertBinary

    public static void main(String[] args){
        System.out.println("Numeros decimales\tNumeros binarios\tNumeros hexadecimal");
        for(int i=0; i<256; i++){
            System.out.println(i+"\t\t\t"+convertBinary(i)+"\t\t\t"+convertHexadecimalNumber(i));
        }

        System.out.println();
    
        
    }//end main
}//end TableOfNumbers