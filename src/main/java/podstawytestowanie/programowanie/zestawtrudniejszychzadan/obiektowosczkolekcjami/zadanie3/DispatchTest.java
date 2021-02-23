package podstawytestowanie.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie3;

import java.time.LocalTime;

public class DispatchTest {

    public static void main(String[] args) {

        Dispatch controlCenter = new Dispatch();

        controlCenter.addReport("Wypadek na A2",EmergencyType.WYPADEK);
        controlCenter.addReport("Pożar",EmergencyType.STRAŻ);
        controlCenter.addReport("Krwotok wewnętrzny",EmergencyType.KARETKA);
        controlCenter.addTimedReport("PRIO! Pożar w straży",EmergencyType.STRAŻ, LocalTime.parse("17:56"));
        controlCenter.addTimedReport("PRIO! Pożar w szpitalu",EmergencyType.WYPADEK, LocalTime.parse("15:23"));

        System.out.println(controlCenter.getFirstReports(3).toString());
        System.out.println(controlCenter.getTypedReports(EmergencyType.KARETKA).toString());

    }

}
