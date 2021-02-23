package podstawytestowanie.programowanie.zestawtrudniejszychzadan.exceptions.zadanie2;

public class DivisionWithMyException {

    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0));
        } catch (CholeroException exception) {
            exception.printStackTrace();
        }
    }

    public static int divide(int a, int b) throws CholeroException {
        if (b == 0) {
            throw new CholeroException();
        } else {
            return a / b;
        }
    }

}
