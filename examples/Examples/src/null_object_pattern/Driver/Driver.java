package null_object_pattern.Driver;

import null_object_pattern.Vehicle.*;

public class Driver {
    public static void main(String[] arr) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("LOP");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating capacity: " + vehicle.getSeatCapacity());
        System.out.println("Fuel tank capacity: " + vehicle.getTankCapacity());
    }
}
