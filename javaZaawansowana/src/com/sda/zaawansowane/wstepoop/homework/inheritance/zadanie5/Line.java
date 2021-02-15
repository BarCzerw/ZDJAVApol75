package com.sda.zaawansowane.wstepoop.homework.inheritance.zadanie5;

import com.sda.zaawansowane.wstepoop.homework.inheritance.zadanie1.Point2D;

public class Line {

    protected Point2D startPoint;
    protected Point2D endPoint;

    public Line(Point2D startPoint, Point2D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(float x1, float y1, float x2, float y2) {
        this(new Point2D(x1,y1), new Point2D(x2,y2));
    }

    public Point2D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    public float getLength(){
        float absDX = Math.abs(startPoint.getX()-endPoint.getX());
        float absDY = Math.abs(startPoint.getY()-endPoint.getY());

        return (float) Math.sqrt(Math.pow(absDX,2)+Math.pow(absDY,2));
    }

    public Point2D getMiddlePoint(){

        float dx = endPoint.getX() - startPoint.getX();
        float dy = endPoint.getY() - startPoint.getX();

        return new Point2D((startPoint.getX()+endPoint.getX())/2,(startPoint.getY()+ endPoint.getY())/2);
    }
}
