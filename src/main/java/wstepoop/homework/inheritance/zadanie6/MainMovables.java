package wstepoop.homework.inheritance.zadanie6;

public class MainMovables {

    public static void main(String[] args) {

        Movable[] movables = new Movable[]{
                new MovablePoint(),
                new MovableCircle(),
                new MovablePoint(-4,8,2,2),
                new MovableCircle(5,new MovablePoint(-3,6,3,3))
        };

        System.out.println("Initial position");

        for (Movable movable : movables) {
            System.out.println(movable);
        }

        for (Movable movable : movables) {
            movable.moveDown();
            movable.moveRight();
        }

        System.out.println("-----------------------\nAfter moving down and right");
        for (Movable movable : movables) {
            System.out.println(movable);
        }

        System.out.println("-----------------------\nBut if you pass instance of existing MovablePoint this happens");

        MovablePoint p1 = new MovablePoint(5,5,99,99);
        MovableCircle c1 = new MovableCircle(5,p1);

        System.out.println("Inital point and circle");
        System.out.println(p1+"\n"+c1);
        System.out.println("Moving POINT ONLY up and left");
        p1.moveUp();
        p1.moveLeft();
        System.out.println(p1+"\n"+c1);

        System.out.println("-----------------------\nSolution is to create new MovablePoint in MovableCircle's constructor using coordinates and speed of passed argument");

    }

}
