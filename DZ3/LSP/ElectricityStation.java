package DZ3.LSP;

import DZ3.FuelType;

public class ElectricityStation implements Station {
    protected FuelType electricity;

    public ElectricityStation(FuelType fuel) {
        this.electricity = fuel;
    }

    public FuelType getElectricity() {
        return this.electricity;
    }

    public void setElectricity(FuelType electricity) {
        this.electricity = electricity;
    }

    @Override
    public FuelType Fuel() {
        return this.electricity;
    }

}
