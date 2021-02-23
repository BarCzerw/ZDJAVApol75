package podstawytestowanie.programowanie.zestawtrudniejszychzadan.exceptions.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Club {

    private List<Person> inside;

    public Club() {
        this.inside = new ArrayList<>();
    }

    public void enter(Person person) throws NoAdultException {
        if (person.getAge() >= 18) {
            System.out.println(person.getFullname() + ", you are invited to Hawana.");
            inside.add(person);
        } else {
            System.out.println(person.getFullname() + ", you are too young, pal...");
            throw new NoAdultException(person);
        }
    }
}
