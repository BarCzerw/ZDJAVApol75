package wstepoop.gitzadania.highway;

import java.time.Duration;
import java.time.LocalDateTime;

public enum VehicleType {
    TRUCK(0.15),
    CAR(0.09),
    MOTORCYCLE(0.07);

    private final double costPerSecondOnHighway;

    VehicleType(double costPerSecondOnHighway) {
        this.costPerSecondOnHighway = costPerSecondOnHighway;
    }

    public static VehicleType interpretVehicleType(String type) throws UnknownCommandArgumentException {
        String userInput = type.toLowerCase();
        switch (userInput) {
            case "car":
                return VehicleType.CAR;
            case "truck":
                return VehicleType.TRUCK;
            case "motorcycle":
                return VehicleType.MOTORCYCLE;
            default:
                throw new UnknownCommandArgumentException(type);
        }
    }

    public static double getCostOfPassage(VehicleInfo vehicleInfo, LocalDateTime exitTime) {
        double cost;
        switch (vehicleInfo.getType()) {
            case TRUCK:
                cost = TRUCK.costPerSecondOnHighway;
            case CAR:
                cost = CAR.costPerSecondOnHighway;
            case MOTORCYCLE:
                cost = MOTORCYCLE.costPerSecondOnHighway;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + vehicleInfo.getType());
        }
        return cost * calculateTimeOnHighway(vehicleInfo, exitTime);
    }

    public static long calculateTimeOnHighway(VehicleInfo vehicleInfo, LocalDateTime exitTime) {
        return Duration.between(vehicleInfo.getTimeEntered(), exitTime).toSeconds();
    }
}
