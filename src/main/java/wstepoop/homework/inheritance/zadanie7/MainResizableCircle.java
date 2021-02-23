package wstepoop.homework.inheritance.zadanie7;

public class MainResizableCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle(5.87);

        System.out.println(c1);

        ResizableCircle rc1 = new ResizableCircle(5.87);

        System.out.println(rc1);

        System.out.println("Should stay the same");
        rc1.resize(100);
        System.out.println(rc1);

        System.out.println("Should be double");
        rc1.resize(200);
        System.out.println(rc1);

        System.out.println("Should be 1/10");
        rc1.resize(10);
        System.out.println(rc1);

    }


}
