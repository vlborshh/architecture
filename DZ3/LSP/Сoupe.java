package DZ3.LSP;

import DZ3.BodyType;
import DZ3.Car;
import DZ3.Color;
import DZ3.FuelType;
import DZ3.GearboxType;

public class Сoupe extends Car implements Station {

    protected FuelType fuel;

    public Сoupe(String make, String model, Color color, BodyType bodyType, FuelType fuelType, GearboxType gearboxType,
            double engineCapacity) {
        super(make, model, color, bodyType, fuelType, gearboxType, engineCapacity);
        this.fuel = fuel;
    }

    @Override
    public FuelType Fuel() {
        return this.fuel;
    }

    public FuelType getFuel() {
        return this.fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
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
