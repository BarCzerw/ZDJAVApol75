package wstepoop.homework.inheritance.zadanie7;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius=(double) percent/100 * this.radius;
    }
}
