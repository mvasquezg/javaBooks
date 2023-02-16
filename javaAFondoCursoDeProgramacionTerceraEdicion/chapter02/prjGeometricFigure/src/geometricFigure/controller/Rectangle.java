package geometricFigure.controller;

import geometricFigure.abstracClass.GeometricFigure;

public class Rectangle extends GeometricFigure{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        super("Rectangulo");
        this.width=width;
        this.height=height;
    }

    public double showArea(){
        return width*height;
    }

}//end Rectangle