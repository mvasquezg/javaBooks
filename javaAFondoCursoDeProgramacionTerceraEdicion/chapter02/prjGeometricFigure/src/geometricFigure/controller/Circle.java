package geometricFigure.controller;

import geometricFigure.abstracClass.GeometricFigure;

public class Circle extends GeometricFigure{
    private int radio;
    
    public Circle(int radio){
        super("Circulo");
        this.radio=radio;

    }

    public double showArea(){
        return Math.PI*Math.pow(radio, 2);
    }

}//end Circle