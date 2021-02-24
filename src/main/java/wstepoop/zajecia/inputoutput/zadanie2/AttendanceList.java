package wstepoop.zajecia.inputoutput.zadanie2;

import wstepoop.homework.io.IOHelper;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AttendanceList {

    private HashMap<User, Integer> attendanceList;

    public AttendanceList() {
        attendanceList = new HashMap<>();
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
        attendanceList.forEach((k, v) -> userList.add(k + " " + v));
        IOHelper.saveToFile(Paths.get(name), userList);
    }
}
