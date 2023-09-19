package DZ3.LSP;

import DZ3.FuelType;

public class GasolineStation implements Station {

    protected FuelType gasoline;

    public GasolineStation(FuelType fuel) {
        this.gasoline = fuel;
    }

    public FuelType getFuel() {
        return this.gasoline;
    }

    public void setFuel(FuelType fuel) {
        this.gasoline = fuel;
    }

    @Override
    public FuelType Fuel() {
        return this.gasoline;
    }

}
