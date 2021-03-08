package wstepoop.gitzadania.highway;

import java.time.LocalDateTime;

public class VehicleInfo {

    private final String licensePlatesNumber;
    private final VehicleType type;
    private final LocalDateTime timeEntered;

    public VehicleInfo(String licensePlatesNumber, VehicleType type, LocalDateTime timeEntered) {
        this.licensePlatesNumber = licensePlatesNumber;
        this.type = type;
        this.timeEntered = timeEntered;
    }

    public String getLicensePlatesNumber() {
        return licensePlatesNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public LocalDateTime getTimeEntered() {
        return timeEntered;
    }
}
