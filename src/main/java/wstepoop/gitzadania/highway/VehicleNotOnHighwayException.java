package wstepoop.gitzadania.highway;

public class VehicleNotOnHighwayException extends Exception {
    public VehicleNotOnHighwayException(String licensePlate) {
        System.out.println(licensePlate + " not found on highway");
    }
}
