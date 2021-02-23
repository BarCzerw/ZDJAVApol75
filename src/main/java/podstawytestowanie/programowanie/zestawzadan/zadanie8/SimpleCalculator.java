package podstawytestowanie.programowanie.zestawzadan.zadanie8;

import podstawytestowanie.programowanie.zestawzadan.Input;

public class SimpleCalculator {

    public static void main(String[] args) {
        System.out.println("---Simple calculator---");
        float a = Input.readFloat("");
        //Input.consumeNextLine();
        //String sign = Input.readString("");

        String sign = Input.readNext();

        float b = Input.readFloat("");

        float result=0;
        boolean isPrintable=true;

        switch (sign) {
            case "+":
                result = add(a, b);
                break;
            case "-":
                result = subtract(a, b);
                break;
            case "*":
                result = multiply(a, b);
                break;
            case "/":
                if (b != 0) {
                    result = divide(a, b);
                } else {
                    isPrintable=false;
                    System.out.println("Błąd!");
                }
                break;
            case "^":
                result = powerOf(a,b);
                break;
            default:
                isPrintable=false;
                System.out.println("Błędny znak!");
        }

        if(isPrintable){
            System.out.println(result);
        }

    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }

    public static float powerOf(float a, float b) {
        return (float) Math.pow(a,b);
    }

}
