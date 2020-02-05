package Operations;

public class Division extends Operation {

    @Override
    public float calculateResult(float a, float b) throws ArithmeticException {
        if (b == 0.0f) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

}
