import org.junit.*;

import static org.junit.Assert.*;


public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {

        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass() {

        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {

        calculator = new Calculator();
    }

    @After
    public void afterTest() {

        calculator = null;
    }

    @Test
    public void testGetSum() {
        assertEquals(4, calculator.getSum(2, 2));
    }

    @Test
    public void testGetDivide() {
        assertEquals(3, calculator.getDivide(15, 5));
    }

    @Test
    public void testGetMultiple() {
        assertEquals(15, calculator.getMultiple(3, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDivide(15, 0);
    }


}