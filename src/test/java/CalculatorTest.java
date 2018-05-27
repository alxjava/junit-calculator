import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator classUnderTest;

    @Before
    public void setUp() {
        System.out.println("Metoda zostanie wykonana przed kazdym testem");
        classUnderTest = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Metoda zostanie wykonana po kazdym tescie");
    }

    @Test
    public void testDodawania() throws Exception {
        double a = 2.0;
        double b = 3.0;

        double c = 4.5;
        double d = 1.2;

        double suma1 = classUnderTest.sum(a, b);
        double suma2 = classUnderTest.sum(c, d);

        Assert.assertEquals("Bledny wynik sumowania", 5.0, suma1, 0.001);
        Assert.assertEquals("Bledny wynik sumowania", 5.7, suma2, 0.001);
    }

    @Test
    public void testOdejmowania() {
        double a = 2.0;
        double b = 3.0;


        double wynik = classUnderTest.subtract(a, b);

        Assert.assertEquals("Bledny wynik odejmowania", -1.0, wynik, 0.001);
    }
    @Test
    public void testMnozenia() {
        double a = 2.0;
        double b = 3.0;


        double wynik = classUnderTest.multiply(a, b);

        Assert.assertEquals("Bledny wynik mnozenia", 6.0, wynik, 0.001);
    }

    @Test
    public void testDzielenia() {
        double a = 5.0;
        double b = 2.0;

        double wynik = classUnderTest.divide(a, b);

        Assert.assertEquals("Bledny wynik dzielenia", 2.5, wynik, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDzieleniaPrzezZero() {
        double a = 4.0;
        double b = 0.0;

        double wynik = classUnderTest.divide(a, b);


    }
}
