package litec;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

/**
 * jUnit4 demo test
 */
public class Ex01CarTest {

    @Rule
    public Timeout globalTimeout = new Timeout(1000, TimeUnit.MILLISECONDS);    

    @Test
    public void car_test_name(){
        Car golf = new Car("Golf",100000);
        assertEquals("Golf", golf.getName());
    }

    @Test
    public void car_test_km() {
        Car golf = new Car("Golf",100000);
        assertEquals(100000, golf.getKmTotal(), 0.1);
    }

    @Test
    public void car_test_setName() {
        Car golf = new Car("Golf",100000);
        golf.setName("Golf GTI");
        assertEquals("Golf GTI", golf.getName());
    }

    @Test
    public void car_test_setKm() {
        Car golf = new Car("Golf",100000);
        golf.setKmTotal(5000);
        assertEquals(5000, golf.getKmTotal(), 0.1);
    }

    @Test
    public void car_test_drive() {
        Car golf = new Car("Golf",100000);
        golf.drive(100);
        assertEquals(100100, golf.getKmTotal(), 0.1);
    }

    @Test
    public void car_test_drive2() {
        Car golf = new Car("Golf",100000);
        golf.drive(100);
        golf.drive(500);
        assertEquals(100600, golf.getKmTotal(), 0.1);
    }
}