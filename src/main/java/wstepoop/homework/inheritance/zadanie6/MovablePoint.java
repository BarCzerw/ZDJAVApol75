package wstepoop.homework.inheritance.zadanie6;

public class MovablePoint implements Movable{

    protected int x, y, xSpeed, ySpeed;

    public MovablePoint() {
        this(0,0,1,1);
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y+=ySpeed;
    }

    @Override
    public void moveDown() {
        this.y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x-=xSpeed;
    }

    @Override
    public void moveRight() {
        this.x+=xSpeed;
    }

    @Override
    public String toString() {
        return "Point (" + x +","+ y + ")" ;
    }
}
