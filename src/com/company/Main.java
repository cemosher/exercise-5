package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle1 = new Circle(3, "yellow");
        Circle circle2 = new Circle(17, "red");
        Circle circle3 = new Circle(5, "pink");

        System.out.println(circle1.getArea());
        System.out.println(circle1.toString());

        System.out.println(circle2.getArea());
        System.out.println(circle2.toString());

        System.out.println(circle3.getArea());
        System.out.println(circle3.toString());


    }
}
