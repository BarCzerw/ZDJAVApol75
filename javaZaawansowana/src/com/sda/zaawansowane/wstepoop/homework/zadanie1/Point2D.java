package com.sda.zaawansowane.wstepoop.homework.zadanie1;

public class Point2D {

    protected float x, y;

    public Point2D() {
        this(0, 0);
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "( " + x + " , " + y + " )";
    }
}
