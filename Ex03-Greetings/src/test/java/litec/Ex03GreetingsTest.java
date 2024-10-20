package litec;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * jUnit4 demo test
 */
public class Ex03GreetingsTest {

    @Rule
    public Timeout globalTimeout = new Timeout(1000, TimeUnit.MILLISECONDS);    

    @Test
    public void greetings_test_1(){
        Greetings g = new Greetings();
        g.setGender("male");
        g.setTitle("DI");
        g.setFirstName("Craig");
        g.setLastName("Tester");

        assertEquals("Sehr geehrter Herr DI Craig Tester", g.greet());
    }

    @Test
    public void greetings_test_2(){
        Greetings g = new Greetings();
        g.setGender("female");
        g.setTitle("Dr");
        g.setFirstName("Ada");
        g.setLastName("Lovelace");

        assertEquals("Sehr geehrte Frau Dr Ada Lovelace", g.greet());
    }

    @Test
    public void greetings_test_3(){
        Greetings g = new Greetings();
        g.setGender("robot");
        g.setTitle("");
        g.setFirstName("Bender");
        g.setLastName("Bending Rodriguez");

        assertEquals("Sehr geehrte Person Bender Bending Rodriguez", g.greet());
    }
}