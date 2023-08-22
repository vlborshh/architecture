package DZ3.OCP;

import DZ3.BodyType;
import DZ3.Car;
import DZ3.Color;
import DZ3.FuelType;
import DZ3.GearboxType;

public class Sedan extends Car implements TurningFogLights {

    private boolean taxi;

    public Sedan(String make, String model, Color color, BodyType bodyType, FuelType fuelType, GearboxType gearboxType,
            double engineCapacity) {
        super(make, model, color, bodyType, fuelType, gearboxType, engineCapacity);
        this.taxi = taxi;
    }

    @Override
    public void RunFogLights() {

    }

    public boolean isTaxi() {
        return this.taxi;
    }

    public boolean getTaxi() {
        return this.taxi;
    }

    public void setTaxi(boolean taxi) {
        this.taxi = taxi;
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
