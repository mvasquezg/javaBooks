/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 28: Use String Buffer.
*/

public class UseStringBuffer{
    public static void main(String[] args){
        //get milisecond current
        long miliStart=System.currentTimeMillis();

        StringBuffer sb=new StringBuffer();

        int n=100000;

        char c;

        for(int i=0; i<n; i++){
            c=(char) ('A'+ i%('Z'-'A'+1));

            sb.append(c);
        }

        long miliEnd=System.currentTimeMillis();

        System.out.println(sb.toString());

        System.out.println(miliEnd-miliStart);    




    }//end main
}//end UseStringBuffer