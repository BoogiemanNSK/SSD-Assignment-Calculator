package Test;

import Operations.Division;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    private static Division division;

    @BeforeAll
    static void initTest() {
        division = new Division();
    }

    @Test
    void calculateResultTest() throws Exception {
        float res = division.calculateResult(10.0f, 2.0f);
        assertEquals(res, 5.0f);
    }

    @Test
    void wrongCommandHandleTest() {
        assertThrows(ArithmeticException.class, () -> {
            float res = division.calculateResult(10.0f, 0.0f);
        });
    }

    @AfterAll
    static void afterTest() {
        division = null;
    }

}