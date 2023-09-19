package DZ3.SRP;

import DZ3.BodyType;
import DZ3.Car;
import DZ3.Color;
import DZ3.FuelType;
import DZ3.GearboxType;

public class Truck extends Car {

    private int loadCapacity;

    public Truck(String make, String model, Color color, BodyType bodyType, FuelType fuelType, GearboxType gearboxType,
            double engineCapacity) {
        super(make, model, color, bodyType, fuelType, gearboxType, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public void gearShifting() {

    }

    @Override
    public void turningHeadlights() {

    }

    @Override
    public void turningWipers() {

    }

}
