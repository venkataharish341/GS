package com.logicbig.example;

public class Circle extends Shape {
    private int radius;
    private String name = "Circle";

    public Circle(){}

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }


}