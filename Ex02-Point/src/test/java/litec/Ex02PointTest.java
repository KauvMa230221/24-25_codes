package litec;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

/**
 * jUnit4 demo test
 */
public class Ex02PointTest {

    @Rule
    public Timeout globalTimeout = new Timeout(1000, TimeUnit.MILLISECONDS);    

    @Test
    public void point_test() {
        Point p = new Point(10,10);

        assertEquals(10.0, p.getXPos(), 0.01);
        assertEquals(10.0, p.getYPos(), 0.01);
    }

    @Test
    public void point_test_move1() {
        Point p = new Point(10,10);
        p.movePoint(5,5);

        assertEquals(15.0, p.getXPos(), 0.01);
        assertEquals(15.0, p.getYPos(), 0.01);

    }

    @Test
    public void point_test_move2() {
        Point p = new Point(10,10);
        p.movePoint(5,5);
        p.movePoint(-5,0);

        assertEquals(10.0, p.getXPos(), 0.01);
        assertEquals(15.0, p.getYPos(), 0.01);

    }

    @Test
    public void point_test_dist1() {
        Point p = new Point(10,10);
        assertEquals(14.14213, p.distToOrigin(), 0.01);
    }

    @Test
    public void point_test_dist2() {
        Point p = new Point(10,10);
        p.movePoint(5,2);
        assertEquals(19.20937, p.distToOrigin(), 0.01);
    }
}