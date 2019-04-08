package com.aitang;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("radius= " + cylinder.getRadius());
        System.out.println("height= " + cylinder.getHeight());
        System.out.println("area= " + cylinder.getArea());
        System.out.println("volume= " + cylinder.getVolume());
    }
}
