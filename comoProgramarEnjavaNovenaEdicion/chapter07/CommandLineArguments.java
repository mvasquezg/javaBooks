/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 07: Arrays and ArrayList Object.
  *Programa 15: Command Line Arguments
*/
public class CommandLineArguments{
    public static void main(String[] args){
        if(args.length!=3){
            System.out.println("Error: Vuelva a escribir el comando completo, incluyendo: \nel tamano del arreglo, el valor inicial y el incremento");
        }else{
            int lengthArray=Integer.parseInt(args[0]);
            int[] array=new int[lengthArray];

            int initialValue=Integer.parseInt(args[1]);
            int increment=Integer.parseInt(args[2]);

            for(int i=0; i<array.length; i++){
                array[i]=initialValue+increment*i;
            }

            System.out.printf("%s%8s\n", "Indice", "Valor");

            for(int j=0; j<array.length; j++){
                System.out.printf("%5d%8d\n", j, array[j]);
            }
        }
    }
}//end CommandLineArguments