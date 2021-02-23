package podstawytestowanie.programowanie.zestawtrudniejszychzadan.exceptions.zadanie1;

public class TryCatchAndIf {

    public static void main(String[] args) {

        System.out.println(divideIf(2,0));
        System.out.println(divideHandled(2,0));

    }

    public static int divideIf(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.err.println("Can't divide by 0!");
            return 0;
        }
    }

    public static int divideHandled(int a, int b) {
        try {
            return a / b;
        } catch (Exception exception) {
            System.err.println("Can't divide by 0!");
            return 0;
        }
    }
}
