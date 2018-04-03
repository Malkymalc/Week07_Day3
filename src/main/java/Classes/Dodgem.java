package Classes;

import BaseClasses.Vehicle;

public class Dodgem extends Vehicle {

    private int numberOfSeats;

    public Dodgem(int avgSpeed, String name, int numberOfSeats) {
        super(avgSpeed, name);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
