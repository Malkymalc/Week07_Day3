package Classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void setUp(){
        dodgem = new Dodgem(10, "Mystery Machine", 2);

    }

    @Test
    public void canGetDriveTime() {
        assertEquals(2, dodgem.driveTime(20));
    }

    @Test
    public void getAvgSpeed() {
        assertEquals(10, dodgem.getAvgSpeed());
    }

    @Test
    public void setAvgSpeed() {
        dodgem.setAvgSpeed(11);
        assertEquals(11, dodgem.getAvgSpeed());
    }

    @Test
    public void getName() {
        assertEquals("Mystery Machine", dodgem.getName());
    }


    @Test
    public void getNumberOfSeats() {
        assertEquals(2, dodgem.getNumberOfSeats());
    }


}