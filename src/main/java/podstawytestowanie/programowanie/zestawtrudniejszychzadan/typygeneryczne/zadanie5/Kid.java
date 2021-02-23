package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie5;

public class Kid implements IFamilyMember {
    private String name;
    private int age;

    public Kid() {
        this.name="";
        this.age=0;
    }

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return "Mother " + this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
