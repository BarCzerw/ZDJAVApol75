package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie3;

public class Student {
    static int count = 0;
    private int id;

    public Student() {
        id = count++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
