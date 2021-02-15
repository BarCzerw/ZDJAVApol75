package com.sda.zaawansowane.wstepoop.homework.inheritance.zadanie6;

public class MovableCircle implements Movable {

    protected int radius;
    protected MovablePoint centerPoint;

    public MovableCircle() {
        this(1,new MovablePoint());
    }

    public MovableCircle(int radius, MovablePoint centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    @Override
    public void moveUp() {
        centerPoint.moveUp();
    }

    @Override
    public void moveDown() {
        centerPoint.moveDown();
    }

    @Override
    public void moveLeft() {
        centerPoint.moveLeft();
    }

    @Override
    public void moveRight() {
        centerPoint.moveRight();
    }

    @Override
    public String toString() {
        return "Circle with " + centerPoint;
    }
}
