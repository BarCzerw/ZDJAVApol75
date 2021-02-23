package podstawytestowanie.programowanie.zestawzadan.zadanie17;

import podstawytestowanie.programowanie.zestawzadan.Input;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimeTillNextSDA {

    public static void main(String[] args) {

        System.out.println("Next lesson in " + ChronoUnit.DAYS.between(LocalDate.now(), getDateFromUser()) + " days");
    }

    public static LocalDate getDateFromUser() {
        return LocalDate.parse(Input.readString("Date of next lesson [yyyy-mm-dd]: "));
    }

}
