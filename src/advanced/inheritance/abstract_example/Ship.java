package advanced.inheritance.abstract_example;

public class Ship extends Vehicle {
    private String model;

    public Ship(String model, int maxSpeed) {
        super(maxSpeed);
        this.model = model;
    }

    @Override
    public int vehicleMaxSpeed() {

        return maxSpeed * 10;
    }
}