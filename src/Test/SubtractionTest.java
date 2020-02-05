package Test;

import Operations.Subtraction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    private static Subtraction subtraction;

    @BeforeAll
    static void initTest() {
        subtraction = new Subtraction();
    }

    @Test
    void calculateResultTest() throws Exception {
        float res = subtraction.calculateResult(10.0f, 2.0f);
        assertEquals(res, 8.0f);
    }

    @AfterAll
    static void afterTest() {
        subtraction = null;
    }

}