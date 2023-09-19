package DZ3;

//абстрактный класс «Car» с заданными свойствами и методами

public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private BodyType bodyType;
    private FuelType fuelType;
    private GearboxType gearboxType;
    private double engineCapacity;

    public Car(String make, String model, Color color, BodyType bodyType, FuelType fuelType, GearboxType gearboxType,
            double engineCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.gearboxType = gearboxType;
        this.engineCapacity = engineCapacity;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BodyType getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public GearboxType getGearboxType() {
        return this.gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public double getEngineCapacity() {
        return this.engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void movement() {

    }

    public void maintenance() {

    }

    public void gearShifting() {

    }

    public void turningHeadlights() {

    }

    public void turningWipers() {

    }
}
