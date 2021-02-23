package wstepoop.homework.io.zadanie5;

import wstepoop.homework.io.IOHelper;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UserMain {

    private static final String FILE_PATH = "userData.txt";

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        for (String line : IOHelper.readFromFiles(Paths.get(FILE_PATH))) {
            User temp = User.createFromString(line);
            if (temp != null) {
                users.add(temp);
            }
        }
        System.out.println(users);
    }
}
