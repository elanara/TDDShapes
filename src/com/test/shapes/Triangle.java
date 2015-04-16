package com.test.shapes;

public class Triangle implements Shape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        // TODO Auto-generated constructor stub
        System.out.println("Base :" + base);
        System.out.println("Height: " + height);
    }

    @Override
    public double computeArea() {
        // TODO Auto-generated method stub
        return 0;
    }

}
