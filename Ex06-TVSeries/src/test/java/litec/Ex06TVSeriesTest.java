package litec;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

/**
 * jUnit4 demo test
 */
public class Ex06TVSeriesTest {

    @Rule
    public Timeout globalTimeout = new Timeout(1000, TimeUnit.MILLISECONDS);    

    @Test
    public void tvSeries_test_1()
    {
        TVSeries s = new TVSeries();
        s.addSeries("Breaking Bad", 1);
        s.addSeries("Cobra Kai", 2);
        s.addSeries("Friends", 3);
        s.addSeries("Mad Men", 4);
        s.addSeries("Peaky Blinders", 5);

        assertEquals("[Breaking Bad, Cobra Kai, Friends, Mad Men, Peaky Blinders]", s.showSeries());
    }

    @Test
    public void tvSeries_test_2()
    {
        TVSeries s = new TVSeries();
        s.addSeries("Breaking Bad", 1);
        s.addSeries("Cobra Kai", 1);
        s.addSeries("Friends", 1);
        s.addSeries("Mad Men", 1);
        s.addSeries("Peaky Blinders", 1);

        assertEquals("[Peaky Blinders, Mad Men, Friends, Cobra Kai, Breaking Bad]", s.showSeries());
    }

    @Test
    public void tvSeries_test_3()
    {
        TVSeries s = new TVSeries();
        s.addSeries("Breaking Bad", 1);
        s.addSeries("Cobra Kai", 1);
        s.addSeries("Friends", 3);
        s.addSeries("Mad Men", 3);
        s.addSeries("Peaky Blinders", 5);

        assertEquals("[Cobra Kai, Breaking Bad, Mad Men, Friends, Peaky Blinders]", s.showSeries());
    }

    @Test
    public void tvSeries_test_4()
    {
        TVSeries s = new TVSeries();
        s.addSeries("Breaking Bad", 1);
        s.addSeries("Cobra Kai", 1);
        s.addSeries("Friends", 3);
        s.addSeries("Mad Men", 3);
        s.addSeries("Peaky Blinders", 5);
        s.addSeries("Prison Break", 4);

        assertEquals("[Cobra Kai, Breaking Bad, Mad Men, Prison Break, Friends]", s.showSeries());
    }

    @Test
    public void tvSeries_test_5()
    {
        TVSeries s = new TVSeries();
        s.addSeries("Breaking Bad", 1);
        s.addSeries("Cobra Kai", 1);
        s.addSeries("Friends", 3);
        s.addSeries("Mad Men", 3);
        s.addSeries("Peaky Blinders", 5);
        s.addSeries("Prison Break", 4);
        s.addSeries("Better Call Saul", 1);

        assertEquals("[Better Call Saul, Cobra Kai, Breaking Bad, Mad Men, Prison Break]", s.showSeries());
    }

    @Test
    public void tvSeries_test_6()
    {
        TVSeries s = new TVSeries();
        assertEquals(0, s.addSeries("Breaking Bad", 1));
    }

    @Test
    public void tvSeries_test_7()
    {
        TVSeries s = new TVSeries();
        assertEquals(0, s.addSeries("Breaking Bad", 5));
    }

    @Test
    public void tvSeries_test_8()
    {
        TVSeries s = new TVSeries();
        assertEquals(-1, s.addSeries("Breaking Bad", 0));
    }

    @Test
    public void tvSeries_test_9()
    {
        TVSeries s = new TVSeries();
        assertEquals(-1, s.addSeries("Breaking Bad", 6));
    }
}