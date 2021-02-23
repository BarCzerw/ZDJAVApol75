package lombokplayground.student;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor //wymaga podania tych pol, ktore sa finalne - wymagane do istnienia klasy
@Getter
@Setter
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = "Slim " + name;
    }
}
