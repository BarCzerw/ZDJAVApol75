package podstawytestowanie.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Report {

    EmergencyType type;
    String description;
    LocalTime arrived;
    String id;

    public Report(EmergencyType type, String description, String id) {
        this(type,description,id, LocalTime.now());
    }

    public Report(EmergencyType type, String description, String id, LocalTime arrived){
        this.type = type;
        this.description = description;
        this.arrived = arrived;
        this.id = id;
    }

    @Override
    public String toString() {
        return "[" + arrived.format(DateTimeFormatter.ofPattern("hh:mm:ss")) + " - " + type + " - " + description + "]";
    }
}
