package podstawytestowanie.programowanie.testowanie.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    public Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {

        //given
        double a = 2.0;
        double b = 2.0;
        double expected = 4.0;

        //when
        double result = calculator.add(a, b);

        //then
        assertEquals(expected, result);

    }

    @Test
    void testSubtract() {

        //given
        double a = 5.0;
        double b = 2.0;
        double expected = 3.0;

        //when
        double result = calculator.subtract(a, b);

        //then
        assertEquals(expected, result);

    }

    @Test
    void testMultiply() {

        //given
        double a = 5.0;
        double b = 2.0;
        double expected = 10.0;

        //when
        double result = calculator.multiply(a, b);

        //then
        assertEquals(expected, result);

    }

    @Test
    void testDivide() {

        //given
        double a = 1.0;
        double b = 10.0;
        double expected = 0.1;

        //when
        double result = calculator.divide(a, b);

        //then
        assertEquals(expected, result);

    }

    @Test
    void testDivideByZero() {

        //given
        double a = 1.0;
        double b = 0;
        double expected = Double.MIN_VALUE;

        //when
        double result = calculator.divide(a, b);

        //then
        assertEquals(expected, result);

    }

    @Test
    void testArraySum(){

        //given
        double[] array = new double[]{3.5,2.5,1.0,-5.0};
        double expected = 2.0;

        //when
        double result = calculator.arraySum(array);

        //then
        assertEquals(expected, result);

    }

    @ParameterizedTest
    @ValueSource(ints={1,3,9999,-1,-17,Integer.MAX_VALUE, Integer.MIN_VALUE+1})
    void testIdOddShouldBeTrue(int number){

        //given

        //when
        boolean result = calculator.isOdd(number);

        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints={0,-2,2,1998,Integer.MAX_VALUE-1,Integer.MIN_VALUE})
    void testIdOddShouldBeFalse(int number){

        //given

        //when
        boolean result = calculator.isOdd(number);

        //then
        assertFalse(result);
    }
}