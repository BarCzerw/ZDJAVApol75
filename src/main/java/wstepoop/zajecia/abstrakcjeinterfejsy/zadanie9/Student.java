package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie9;

public class Student implements Comparable{

    protected String name;
    protected String surname;
    protected int index;

    public Student(String name, String surname, int index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", index=" + index +
                '}';
    }

    //to sort in reverse order just switch return values in else
    @Override
    public int compareTo(Object o) {
        if(this==o || !(o instanceof Student)){
            return 0;
        }else {
            Student other = (Student) o;
            if (this.index < other.index){
                return -1;
            }else {
                return 1;
            }
        }
    }
}
