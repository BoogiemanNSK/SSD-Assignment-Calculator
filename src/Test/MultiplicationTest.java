package Test;

import Operations.Division;
import Operations.Multiplication;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    private static Multiplication multiplication;

    @BeforeAll
    static void initTest() {
        multiplication = new Multiplication();
    }

    @Test
    void calculateResultTest() throws Exception {
        float res = multiplication.calculateResult(10.0f, 2.0f);
        assertEquals(res, 20.0f);
    }

    @AfterAll
    static void afterTest() {
        multiplication = null;
    }

}