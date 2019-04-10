package com.aitang;

public class Wall {
    double width;
    double height;

    public Wall() {
        this.setWidth(0.0);
        this.setHeight(0.0);
    }

//    public Wall(int width, int height) {
//        this.setWidth((double)width);
//        this.setHeight((double)height);
//    }

    public Wall(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.height * this.width;
    }
}