package litec;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * jUnit4 demo test
 */
public class Ex04RobotTest {

    @Rule
    public Timeout globalTimeout = new Timeout(1000, TimeUnit.MILLISECONDS);    

    @Test
    public void robot_test_turnRight_1() {
        Robot rob = new Robot();
        rob.moveForward(5);
        rob.turnRight();
        rob.moveForward(3);
        assertEquals(5, rob.getxPos());
        assertEquals(3,rob.getyPos());
    }

    @Test
    public void robot_test_turnRight_2() {
        Robot rob = new Robot();
        rob.moveForward(5);
        rob.turnRight();
        rob.moveForward(3);
        rob.turnRight();
        rob.moveForward(3);
        assertEquals(2, rob.getxPos());
        assertEquals(3,rob.getyPos());
    }

    @Test
    public void robot_test_turnRight_3() {
        Robot rob = new Robot();
        rob.moveForward(5);
        rob.turnRight();
        rob.moveForward(3);
        rob.turnRight();
        rob.moveForward(3);
        rob.turnRight();
        rob.moveForward(2);
        assertEquals(2, rob.getxPos());
        assertEquals(1,rob.getyPos());
    }

    @Test
    public void robot_test_turnLeft_1() {
        Robot rob = new Robot();
        rob.moveForward(5);
        rob.turnLeft();
        rob.moveForward(3);
        assertEquals(5, rob.getxPos());
        assertEquals(-3,rob.getyPos());
    }

    @Test
    public void robot_test_turnLeft_2() {
        Robot rob = new Robot();
        rob.moveForward(5);
        rob.turnLeft();
        rob.moveForward(3);
        rob.turnLeft();
        rob.turnLeft();
        rob.moveForward(2);
        assertEquals(5, rob.getxPos());
        assertEquals(-1,rob.getyPos());
    }

    @Test
    public void robot_test_rotateRight_1() {
        Robot rob = new Robot();
        rob.moveForward(5);
        for(int i=0;i<4;i++) {
            rob.turnRight();
        }

        rob.moveForward(5);
        assertEquals(10, rob.getxPos());
        assertEquals(0,rob.getyPos());
    }

    @Test
    public void robot_test_rotateLeft_1() {
        Robot rob = new Robot();
        rob.moveForward(5);
        for(int i=0;i<4;i++) {
            rob.turnLeft();
        }

        rob.moveForward(5);
        assertEquals(10, rob.getxPos());
        assertEquals(0,rob.getyPos());
    }

    @Test
    public void robot_test_rotateRight_2() {
        Robot rob = new Robot();
        rob.moveForward(5);
        for(int i=0;i<6;i++) {
            rob.turnRight();
        }

        rob.moveForward(5);
        assertEquals(0, rob.getxPos());
        assertEquals(0,rob.getyPos());
    }

    @Test
    public void robot_test_rotateLeft_2() {
        Robot rob = new Robot();
        rob.moveForward(5);
        for(int i=0;i<11;i++) {
            rob.turnLeft();
        }

        rob.moveForward(5);
        assertEquals(5, rob.getxPos());
        assertEquals(5,rob.getyPos());
    }

    @Test
    public void robot_test_rotateLeftRight() {
        Robot rob = new Robot();
        rob.moveForward(5);
        for(int i=0;i<4;i++) {
            rob.turnLeft();
        }

        rob.moveForward(5);

        for(int i=0;i<2;i++) {
            rob.turnRight();
        }

        rob.moveForward(2);

        for(int i=0;i<6;i++) {
            rob.turnRight();
        }

        rob.moveForward(2);

        assertEquals(10, rob.getxPos());
        assertEquals(0,rob.getyPos());
    }
}