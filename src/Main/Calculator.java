package Main;

import Operations.*;

import java.util.PriorityQueue;
import java.util.Queue;

public class Calculator {

    private Queue<String> operationsHistory;
    private Operation[] operations;
    private final int operationsCount = 4;

    public Calculator() {
        operationsHistory = new PriorityQueue<>();
        operations = new Operation[operationsCount];
        operations[CommandsEnum.Sum.getValue()] = new Sum();
        operations[CommandsEnum.Subtraction.getValue()] = new Subtraction();
        operations[CommandsEnum.Multiplication.getValue()] = new Multiplication();
        operations[CommandsEnum.Division.getValue()] = new Division();
    }

    public float calculateResult(float a, float b, CommandsEnum cmd) throws Exception {
        if (cmd.getValue() > operationsCount) {
            throw new Exception("\nCalculator received unknown command.\n");
        }

        float result = operations[cmd.getValue()].calculateResult(a, b);
        String operation = a + " " + cmd.getSign() + " " + b + " = " + result;

        if (operationsHistory.size() >= 5) {
            operationsHistory.remove();
        }
        operationsHistory.add(operation);

        return result;
    }

    public Queue<String> getOperationsHistory() {
        return operationsHistory;
    }

}
