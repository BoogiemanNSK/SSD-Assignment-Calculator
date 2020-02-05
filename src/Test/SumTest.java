package Test;

import Operations.Sum;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    private static Sum sum;

    @BeforeAll
    static void initTest() {
        sum = new Sum();
    }

    @Test
    void calculateResultTest() throws Exception {
        float res = sum.calculateResult(10.0f, 2.0f);
        assertEquals(res, 12.0f);
    }

    @AfterAll
    static void afterTest() {
        sum = null;
    }

}