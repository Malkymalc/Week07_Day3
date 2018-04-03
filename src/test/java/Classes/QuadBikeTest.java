package Classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadBikeTest {

    QuadBike quadBike;

    @Before
    public void setUp(){
        quadBike = new QuadBike(20, "Mr Q Fourster", 10);

    }

    @Test
    public void canGetDriveTime() {
        assertEquals(1, quadBike.driveTime(20));
    }

    @Test
    public void getAvgSpeed() {
        assertEquals(20, quadBike.getAvgSpeed());
    }

    @Test
    public void setAvgSpeed() {
        quadBike.setAvgSpeed(15);
        assertEquals(15, quadBike.getAvgSpeed());
    }

    @Test
    public void getName() {
        assertEquals("Mr Q Fourster", quadBike.getName());
    }


    @Test
    public void getEngineCC() {
        assertEquals(10, quadBike.getEngineCC());
    }
}