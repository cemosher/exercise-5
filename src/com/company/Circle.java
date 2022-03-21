package com.company;

public class Circle {
    private int Radius;
    private String Color;

    //1 constructor
    public Circle() {
        this.Radius = 2;
        this.Color = "green";
    }
    //2 constructor
    public Circle(int pRadius) {
        this.Radius = pRadius;
    }

    //3 parameter constructor
    public Circle(int pRadius, String pColor) {
        this.Radius = pRadius;
        this.Color = pColor;
    }

    public int getRadius() {
        return Radius;
    }

    public String getColor() {
        return Color;
    }


    //method
    public double getArea() {
        double Area = 2 * Math.PI * Radius;
        return Area;
    }

    public String toString() {
        return "Radius = " + getRadius() + " | Color = " + getColor();
    }
}
