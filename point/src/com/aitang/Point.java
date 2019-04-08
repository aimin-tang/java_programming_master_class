package com.aitang;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)* (this.y - y));
    }

    public double distance(Point p) {
        return Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
    }
}
