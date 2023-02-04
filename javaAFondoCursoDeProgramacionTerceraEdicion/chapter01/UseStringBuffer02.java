/**
  *Book: Java in depth programming course
  *Chapter 01: Introduction to programming language.
  *Programa 29: Use String Buffer.
*/

public class UseStringBuffer02{
    public static void main(String[] args){
        //get milisecond current
        long miliStart=System.currentTimeMillis();

        StringBuffer sb=new StringBuffer();

        int n=100000;
        String s="";
        char c;

        for(int i=0; i<n; i++){
            c=(char) ('A'+ i%('Z'-'A'+1));

            s=s+c;
        }

        long miliEnd=System.currentTimeMillis();

        System.out.println(s);

        System.out.println(miliEnd-miliStart);    




    }//end main
}//end UseStringBuffer02