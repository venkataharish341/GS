package com.logicbig.example;

public class Rectangle extends Shape {
    private int w;
    private int h;
    private String name = "Rectangle";

    public Rectangle(){}

    public String getName() {
        return name;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Rectangle(int width, int height) {
        this.w = width;
        this.h = height;
    }
}