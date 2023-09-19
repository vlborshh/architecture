package DZ3.LSP;

import DZ3.FuelType;

public class DieselStation implements Station {
    protected FuelType diesel;

    public DieselStation(FuelType fuel) {
        this.diesel = fuel;
    }

    public FuelType getFuel() {
        return this.diesel;
    }

    public void setFuel(FuelType fuel) {
        this.diesel = fuel;
    }

    @Override
    public FuelType Fuel() {
        return this.diesel;
    }
}
