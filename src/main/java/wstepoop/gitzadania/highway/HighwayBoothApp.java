package wstepoop.gitzadania.highway;

import java.time.LocalDateTime;
import java.util.Scanner;

public class HighwayBoothApp {

    public static void main(String[] args) {

        Highway a4 = new Highway();

        printHelloMessage();
        boolean shouldContinue;
        do {
            shouldContinue = run(a4);
        } while (shouldContinue);

    }

    private static boolean run(Highway highway) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        LocalDateTime commandTime = LocalDateTime.now();
        String licensePlate;
        if (validateUserInput(input, 2)) {
            licensePlate = input[1];
        } else {
            System.out.println("Error inputting command!");
            return true;
        }
        switch (input[0].toLowerCase()) {
            case "enter":
                runEnterCommand(highway, input, licensePlate, commandTime);
                break;
            case "exit":
                runExitCommand(highway, licensePlate, commandTime);
                break;
            case "check":
                runCheckCommand(highway, licensePlate);
                break;
            default:
                System.out.println("Unknown command. Try again");
        }
        return true;
    }

    private static void runCheckCommand(Highway highway, String licensePlate) {
        try {
            highway.searchVehicle(licensePlate);
        } catch (VehicleNotOnHighwayException e) {
            return;
        }
    }

    private static void runExitCommand(Highway highway, String licensePlate, LocalDateTime commandTime) {
        try {
            highway.vehicleLeave(highway.getVehicleFromLicensePlate(licensePlate), commandTime);
        } catch (VehicleNotOnHighwayException e) {
            return;
        }
    }

    private static void runEnterCommand(Highway highway, String[] input, String licensePlate, LocalDateTime commandTime) {
        if (validateUserInput(input, 3)) {
            VehicleType type;
            try {
                type = VehicleType.interpretVehicleType(input[2]);
                highway.vehicleEntry(licensePlate, type, commandTime);
            } catch (UnknownCommandArgumentException | LicensePlateAlreadyOnHighwayException e) {
                return;
            }
        } else {
            System.out.println("Wrong number of arguments!");
            return;
        }
    }

    private static boolean validateUserInput(String[] input, int numberOfArguments) {
        return input.length >= numberOfArguments;
    }

    private static void printHelloMessage() {
        System.out.println("available commands:\n-enter 'license plate' 'vehicle type'\n-exit 'license plate'\n-check 'license plate'");
    }

}
