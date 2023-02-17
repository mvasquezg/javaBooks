package methodStatic.controller;

public class Number{
    private double num;

    public Number(double num){
        this.num=num;
    }
    
    public static double showSum(double a, double b){
        return a+b;
    }

    public Number showSum(double a){
        num+=a;
        return this;
    }

    public String toString(){
        return Double.toString(num);
    }//end toString


}//end Number