/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 04: Control instructions part I.
  *Programa 09: Write four instructions for increment ona the variable x 
*/
public class FourInstruccionsAddingOneToVariable{
    public static void main(String[] args){
        int x=0;

        System.out.println("x inicia en = "+x+"\n");

        System.out.println("Primera forma de agregar 1 a la varable: x=x+1 = "+(x=x+1)+"\n");

        System.out.print("Segunda forma de agregar 1 a la varable: ++x = ");
        ++x;    
        System.out.print(x+"\n");

        System.out.println("\nTerecera forma de agregar 1 a la varable: x+=1 = "+(x+=1)+"\n");
        
        System.out.print("Cuarta forma de agregar 1 a la varable: x++ = ");
        x++;
        System.out.print(x+"\n\n");

    }
}//end FourInstruccionsAddingOneToVariable