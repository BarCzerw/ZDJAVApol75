package podstawytestowanie.programowanie.zestawtrudniejszychzadan.typygeneryczne.zadanie1;

public class TestObject {

    private String name;
    private int id;

    public TestObject(){
        this.name = "Test";
        this.id = 0;
    }

    public TestObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
