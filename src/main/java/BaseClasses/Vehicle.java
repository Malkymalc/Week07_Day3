package BaseClasses;

import Interfaces.IDriveable;

public class Vehicle implements IDriveable {
    private int avgSpeed;
    private String name;

    public Vehicle(int avgSpeed, String name) {
        this.avgSpeed = avgSpeed;
        this.name = name;
    }

    @Override
    public int driveTime(int distance) {
        return distance / this.avgSpeed;
    }

    public int getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(int avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
