package wstepoop.homework.io.zadanie5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class User {
    private String name, surname;
    private int age;

    public static User createFromString(String string) {
        String[] data = string.split("[\\s,;]");
        if (data.length==3){
            try {
                return new User(data[0], data[1], Integer.parseInt(data[2]));
            }catch (Exception e){
                System.out.println("Error creating User from file");
                return null;
            }
        }else {
            System.out.println("Error creating User from file");
            return null;
        }
    }
}
