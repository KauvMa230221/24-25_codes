package litec;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

/**
 * jUnit4 demo test
 */
public class Ex05PasswordCheckerTest {

    @Rule
    public Timeout globalTimeout = new Timeout(1000, TimeUnit.MILLISECONDS);    

    @Test
    public void passwordChecker_test_1()
    {
        String pwd = "12345";
        PasswordChecker checker = new PasswordChecker();
        checker.setMinLength(3);
        checker.setMustContainNumbers(false);
        checker.setMustContainUpperAndLowerCase(false);
        assertTrue(checker.checkPassword(pwd));
    }

    @Test
    public void passwordChecker_test_2()
    {
        String pwd = "password";
        PasswordChecker checker = new PasswordChecker();
        checker.setMinLength(8);
        checker.setMustContainNumbers(false);
        checker.setMustContainUpperAndLowerCase(false);
        assertTrue(checker.checkPassword(pwd));
    }

    @Test
    public void passwordChecker_test_3()
    {
        String pwd = "password";
        PasswordChecker checker = new PasswordChecker();
        checker.setMinLength(9);
        checker.setMustContainNumbers(false);
        checker.setMustContainUpperAndLowerCase(false);
        assertFalse(checker.checkPassword(pwd));
    }

    @Test
    public void passwordChecker_test_4()
    {
        String pwd = "password";
        PasswordChecker checker = new PasswordChecker();
        checker.setMinLength(8);
        checker.setMustContainNumbers(true);
        checker.setMustContainUpperAndLowerCase(false);
        assertFalse(checker.checkPassword(pwd));
    }

    @Test
    public void passwordChecker_test_5()
    {
        String pwd = "password";
        PasswordChecker checker = new PasswordChecker();
        checker.setMinLength(8);
        checker.setMustContainNumbers(false);
        checker.setMustContainUpperAndLowerCase(true);
        assertFalse(checker.checkPassword(pwd));
    }

    @Test
    public void passwordChecker_test_6()
    {
        String pwd = "password12345";
        PasswordChecker checker = new PasswordChecker();
        checker.setMinLength(8);
        checker.setMustContainNumbers(true);
        checker.setMustContainUpperAndLowerCase(false);
        assertTrue(checker.checkPassword(pwd));
    }

    @Test
    public void passwordChecker_test_7()
    {
        String pwd = "Password12345";
        PasswordChecker checker = new PasswordChecker();
        checker.setMinLength(8);
        checker.setMustContainNumbers(true);
        checker.setMustContainUpperAndLowerCase(true);
        assertTrue(checker.checkPassword(pwd));
    }


    @Test
    public void passwordChecker_test_8()
    {
        String pwd = "Password12345";
        PasswordChecker checker = new PasswordChecker();
        checker.setMinLength(20);
        checker.setMustContainNumbers(true);
        checker.setMustContainUpperAndLowerCase(true);
        assertFalse(checker.checkPassword(pwd));
    }
}