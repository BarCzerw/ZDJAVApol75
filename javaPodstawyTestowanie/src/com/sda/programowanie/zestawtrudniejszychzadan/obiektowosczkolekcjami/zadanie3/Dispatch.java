package com.sda.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class Dispatch {

    private Map<String, Report> reports = new HashMap<>();
    private final static Comparator<Report> cmrByArrival = new Comparator<Report>() {
        @Override
        public int compare(Report o1, Report o2) {
            return Duration.between(o1.arrived,o2.arrived).isZero()? 0: (Duration.between(o1.arrived,o2.arrived).isNegative() ? 1 : -1);
        }
    };

    public void addReport(String description, EmergencyType type) {
        UUID uuid = UUID.randomUUID();
        reports.put(uuid.toString(), new Report(type, description, uuid.toString()));
    }

    public void addTimedReport(String description, EmergencyType type, LocalTime time) {
        UUID uuid = UUID.randomUUID();
        reports.put(uuid.toString(), new Report(type, description, uuid.toString(), time));
    }

    public List<Report> getFirstReports(int count) {

        List<Report> firstReports = reports.values().stream().sorted(cmrByArrival).limit(3).collect(Collectors.toList());

        return firstReports.stream().limit(count).collect(Collectors.toList());
    }

    public List<Report> getTypedReports(EmergencyType type) {

        List<Report> resultList = new ArrayList<>();

        for (Report repo :
                reports.values()) {
            if (repo.type == type) {
                resultList.add(repo);
            }
        }

        return resultList.stream().sorted(cmrByArrival).collect(Collectors.toList());
    }

}
