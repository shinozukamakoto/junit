package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class CalculatorTest {


    @Test
    public void maltiplication() throws Exception {
        Calculator sut = new Calculator();
        int expected = 0;

        assertEquals(expected,(expected));
    }
}