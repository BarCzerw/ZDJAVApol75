package wstepoop.gitzadania.highway;

public class LicensePlateAlreadyOnHighwayException extends Exception {
    public LicensePlateAlreadyOnHighwayException(String licensePlatesNumber) {
        System.out.println(licensePlatesNumber + " already on highway!");
    }
}
