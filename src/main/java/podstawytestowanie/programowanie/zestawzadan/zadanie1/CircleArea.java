package podstawytestowanie.programowanie.zestawzadan.zadanie1;

import java.util.Scanner;

public class CircleArea {

    static float PI = 3.14f;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Circle diameter:");

        try {
            float d = input.nextFloat();

            if (d > 0) {
                System.out.println("Circle Area:\nMy PI - " + areaPI(d) + "\nMath PI: - " + areaMathPI(d));
            } else {
                System.out.println("Diameter cannot be negative");
            }
        } catch (Exception e) {
            System.out.println("Error reading diameter!");
        }

    }

    public static float areaPI(float diameter) {
        return (float) (PI * Math.pow(diameter, 2) / 4);
    }

    public static float areaMathPI(float diameter) {
        return (float) (Math.PI * Math.pow(diameter, 2) / 4);
    }

}
