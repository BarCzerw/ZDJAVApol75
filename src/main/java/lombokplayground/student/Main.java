package lombokplayground.student;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setAge(25);
        s1.setName("Shady");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1);
    }
}
