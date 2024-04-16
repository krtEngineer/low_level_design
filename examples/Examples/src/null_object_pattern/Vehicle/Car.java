package null_object_pattern.Vehicle;

public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 100;
    }

    @Override
    public int getSeatCapacity() {
        return 6;
    }
}
