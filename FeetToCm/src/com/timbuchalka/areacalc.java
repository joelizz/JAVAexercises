package com.timbuchalka;


public class areacalc {
    public static void main(String[] args) {

    }


    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid Value");
            return -1.0;
        }
        double circleArea = radius * radius * Math.PI;
        System.out.println("The Circle area is= " + circleArea);
        return circleArea;
    }

    public static double area(double x, double y) {

        if ((x < 0) || (y < 0)) {
            System.out.println("Invalid Value");
            return -1;
        }
        double rectangleArea = x * y;
        System.out.println("The Rectangle area is = " + rectangleArea);
        return rectangleArea;


    }
}

