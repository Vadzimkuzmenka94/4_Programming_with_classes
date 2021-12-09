package task2_2.entity;

public class Automobile {
    private String brand;
    private Engine engine;
    private Wheel leftFront;
    private Wheel rightFront;
    private Wheel leftRear;
    private Wheel rightRear;
    private FuelTank fuelTank;

    public Automobile(String brand, Engine engine, Wheel leftFront, Wheel rightFront, Wheel leftRear, Wheel rightRear, FuelTank fuelTank) {
        this.brand = brand;
        this.engine = engine;
        this.leftFront = leftFront;
        this.rightFront = rightFront;
        this.leftRear = leftRear;
        this.rightRear = rightRear;
        this.fuelTank = fuelTank;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", leftFront=" + leftFront +
                ", rightFront=" + rightFront +
                ", leftRear=" + leftRear +
                ", rightRear=" + rightRear +
                ", fuelTank=" + fuelTank +
                '}';
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getLeftFront() {
        return leftFront;
    }

    public void setLeftFront(Wheel leftFront) {
        this.leftFront = leftFront;
    }

    public Wheel getRightFront() {
        return rightFront;
    }

    public void setRightFront(Wheel rightFront) {
        this.rightFront = rightFront;
    }

    public Wheel getLeftRear() {
        return leftRear;
    }

    public void setLeftRear(Wheel leftRear) {
        this.leftRear = leftRear;
    }

    public Wheel getRightRear() {
        return rightRear;
    }

    public void setRightRear(Wheel rightRear) {
        this.rightRear = rightRear;
    }

    public void setLeftFront(String michelin, String summer, int i, String left_front) {
    }

    public void setRightFront(String michelin, String summer, int i, String right_front) {
    }
}
