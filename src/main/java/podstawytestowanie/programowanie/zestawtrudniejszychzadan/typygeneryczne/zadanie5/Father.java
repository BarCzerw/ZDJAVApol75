package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie5;

public class Father implements IFamilyMember {
    private String name;
    private int age;

    public Father() {
        this.name="";
        this.age=0;
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return "Father " + this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
