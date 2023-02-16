package geometricFigure.controller;

import geometricFigure.abstracClass.GeometricFigure;

public class Triangle extends GeometricFigure{
    private double width;
    private double height;

    public Triangle(int width, int height){
        super("Triangulo");
        this.width=width;
        this.height=height;
    }

    public double showArea(){
        return (width*height)/2;
    }

}//end Triangle