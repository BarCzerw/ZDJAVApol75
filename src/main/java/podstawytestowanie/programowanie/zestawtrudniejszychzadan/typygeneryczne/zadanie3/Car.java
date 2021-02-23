package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie3;

public class Car {
    static int count = 0;
    private int id;

    public Car() {
        id=count++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                '}';
    }
}
