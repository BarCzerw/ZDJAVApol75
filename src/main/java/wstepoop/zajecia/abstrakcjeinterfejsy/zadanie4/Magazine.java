package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie4;

public class Magazine extends Copy {

    public Magazine(String title, int pageCount) {
        super(title, pageCount);
    }

    @Override
    public String toString() {
        return "Magazine " + super.toString();
    }
}
