package null_object_pattern.Vehicle;

import null_object_pattern.Vehicle.Enum.VehicleType;

public class VehicleFactory {
    public static Vehicle getVehicleObject(String vehicleType){
        if(VehicleType.CAR.equals(VehicleType.get(vehicleType))){
            return new Car();
        }
        return new NullVehicle();
    }
}
