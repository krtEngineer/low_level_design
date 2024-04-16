package null_object_pattern.Vehicle.Enum;

import java.util.Arrays;

public enum VehicleType {
    CAR("CAR"), BIKE("BIKE");

    public final String label;

    private VehicleType(String label) {
        this.label = label;
    }

    public static VehicleType get(String label) {
        return Arrays.stream(VehicleType.values())
                .filter(vehicleType -> vehicleType.label.equals(label))
                .findFirst()
                .orElse(null);
    }
}
