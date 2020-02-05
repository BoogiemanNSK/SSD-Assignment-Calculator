package Test;

import Main.Calculator;
import Main.CommandsEnum;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void initTest() {
        calculator = new Calculator();
    }

    @Test
    void calculateResultTest() throws Exception {
        float res = calculator.calculateResult(10.0f, 15.0f, CommandsEnum.Sum);
        assertEquals(res, 25.0f);
    }

    @Test
    void wrongCommandHandleTest() {
        assertThrows(Exception.class, () -> {
            float res = calculator.calculateResult(10.0f, 15.0f, CommandsEnum.Exit);
            assertEquals(res, 25.0f);
        });
    }

    @AfterAll
    static void afterTest() {
        calculator = null;
    }

}