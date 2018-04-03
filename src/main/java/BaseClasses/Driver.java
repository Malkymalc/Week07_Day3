package BaseClasses;

import Interfaces.IDriveable;

public class Driver {
    private String name;
    private IDriveable vehicle;

    public Driver(String name, IDriveable vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public Driver(String name) {
        this.name = name;
        this.vehicle = null;
    }


    public int getDriveTime(int distance){
        return this.vehicle.driveTime(distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IDriveable getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
