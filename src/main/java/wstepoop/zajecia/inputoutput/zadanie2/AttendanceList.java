package wstepoop.zajecia.inputoutput.zadanie2;

import lombok.Getter;
import wstepoop.homework.io.IOHelper;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
public class AttendanceList {

    private final HashMap<User, Integer> attendanceList;

    public AttendanceList() {
        attendanceList = new HashMap<>();
    }

    public AttendanceList(List<User> users) {
        this();
        for (User user : users) {
            attendanceList.put(user,0);
        }
    }

    public void setUserPresent(User user) {
        if (attendanceList.containsKey(user)) {
            attendanceList.put(user, attendanceList.get(user) + 1);
        } else {
            attendanceList.put(user, 1);
        }
    }

    public void saveToFile(String name) {
        List<String> userList = new ArrayList<>();
        attendanceList.forEach((k, v) -> userList.add(k.getName() + " " + v));
        IOHelper.saveToFile(Paths.get(name), userList);
    }
}
