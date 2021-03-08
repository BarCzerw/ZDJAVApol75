package wstepoop.gitzadania.highway;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Highway {

    Set<VehicleInfo> vehiclesOnHighway;

    public Highway() {
        this.vehiclesOnHighway = new HashSet<>();
    }

    public void vehicleEntry(String licensePlatesNumber, VehicleType type, LocalDateTime entryTime) throws LicensePlateAlreadyOnHighwayException {
        if (!containsPlatesNumber(licensePlatesNumber)) {
            System.out.println(licensePlatesNumber + " entering highway");
            vehiclesOnHighway.add(new VehicleInfo(licensePlatesNumber, type, entryTime));
        } else {
            throw new LicensePlateAlreadyOnHighwayException(licensePlatesNumber);
        }
    }

    public void searchVehicle(String licensePlatesNumber) throws VehicleNotOnHighwayException {
        for (VehicleInfo vehicleInfo : vehiclesOnHighway) {
            if (licensePlatesNumber.equals(vehicleInfo.getLicensePlatesNumber())) {
                printVehicleInfo(vehicleInfo);
                return;
            }
        }
        throw new VehicleNotOnHighwayException(licensePlatesNumber);
    }

    public VehicleInfo getVehicleFromLicensePlate(String licensePlate) throws VehicleNotOnHighwayException {
        for (VehicleInfo vehicleInfo : vehiclesOnHighway) {
            if (licensePlate.equals(vehicleInfo.getLicensePlatesNumber())) {
                return vehicleInfo;
            }
        }
        throw new VehicleNotOnHighwayException(licensePlate);
    }

    public void vehicleLeave(VehicleInfo vehicleInfo, LocalDateTime exitTime) throws VehicleNotOnHighwayException {
        if (containsPlatesNumber(vehicleInfo.getLicensePlatesNumber())) {
            System.out.println(vehicleInfo.getLicensePlatesNumber() + " is leaving highway."
                    + "\nPassage time - " + VehicleType.calculateTimeOnHighway(vehicleInfo, exitTime)
                    + "\nTotal cost - " + VehicleType.getCostOfPassage(vehicleInfo, exitTime));
            vehiclesOnHighway.remove(vehicleInfo);
        } else {
            throw new VehicleNotOnHighwayException(vehicleInfo.getLicensePlatesNumber());
        }
    }

    private void printVehicleInfo(VehicleInfo vehicleInfo) {
        System.out.println(vehicleInfo.getLicensePlatesNumber() + " - " + vehicleInfo.getType() + " - entered " + vehicleInfo.getTimeEntered());
    }

    private boolean containsPlatesNumber(String platesNumber) {
        for (VehicleInfo vehicleInfo : vehiclesOnHighway) {
            if (platesNumber.equals(vehicleInfo.getLicensePlatesNumber())) {
                return true;
            }
        }
        return false;
    }
}
