package Classes;

import BaseClasses.Vehicle;

public class QuadBike extends Vehicle{

    private int engineCC;

    public QuadBike(int avgSpeed, String name, int engineCC) {
        super(avgSpeed, name);
        this.engineCC = engineCC;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }
}
