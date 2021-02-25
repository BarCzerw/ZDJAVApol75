package wstepoop.zajecia.inputoutput.zadanie2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class AttendanceMain {

    public static void main(String[] args) {


        AttendanceList al = new AttendanceList(getNUsers(10));
        randomizeAttendance(al);
        al.saveToFile("attendance.txt");

    }

    private static List<User> getNUsers(int count) {
        List<User> users = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            users.add(new User("User " + i));
        }
        return users;
    }

    private static void randomizeAttendance(AttendanceList attendanceList) {
        attendanceList.getAttendanceList().forEach((k, v) -> attendanceList.getAttendanceList().put(k, new Random().nextInt(10)));
    }

}
