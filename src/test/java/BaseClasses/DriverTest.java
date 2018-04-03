package BaseClasses;

import Classes.Dodgem;
import Classes.QuadBike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {

    Driver ryanGosling;
    Driver someDude;
    Dodgem dodgem;
    QuadBike quadBike;

    @Before
    public void before(){
        dodgem = new Dodgem(10, "Mystery Machine", 2);
        quadBike = new QuadBike(20,"Mr Q Fourster", 10);
        ryanGosling = new Driver("Mr Ryan Gosling", dodgem);
        someDude = new Driver("Dude");
    }


    @Test
    public void getName() {
        assertEquals("Mr Ryan Gosling", ryanGosling.getName());
    }

    @Test
    public void canInitializeDriverWithoutVehicle() {
        assertEquals("Dude", someDude.getName());
        assertEquals(null, someDude.getVehicle());
    }


    @Test
    public void getVehicle() {
        assertEquals(dodgem, ryanGosling.getVehicle());
    }

    @Test
    public void driverCanGetDriveTime() {
        assertEquals(2, ryanGosling.getDriveTime(20));
    }

    @Test
    public void canChangeVehicle() {
        ryanGosling.setVehicle(quadBike);
        assertEquals(quadBike, ryanGosling.getVehicle());
    }
}