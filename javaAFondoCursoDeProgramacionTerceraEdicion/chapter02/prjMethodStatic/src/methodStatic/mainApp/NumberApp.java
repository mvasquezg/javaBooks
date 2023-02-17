package methodStatic.mainApp;

import methodStatic.controller.Number;

public class NumberApp{
    public static void main(String[] args){
        double d = Number.showSum(2,3);

        System.out.println(d);

        Number n1=new Number(5);
        n1.showSum(4);

        System.out.println(n1);

        n1.showSum(4).showSum(6).showSum(8).showSum(1);

        System.out.println(n1);    
    }

}//end NumberApp