package Main;

import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

public class UI {

    // Local variable with getter, setter
    private boolean _userWantsToExit;
    public boolean userWantsToExit() {
        return _userWantsToExit;
    }
    public void setUserWantToExitTrue() {
        _userWantsToExit = true;
    }

    private Scanner inputReader;

    public UI() {
        _userWantsToExit = false;
        inputReader = new Scanner(System.in);
    }

    // Prints menu of calculator
    public void printMenu() {
        System.out.print(Constants.MENU);
    }

    // Issues command index from user
    public CommandsEnum getUserCommand(String inputTip) {
        System.out.print(inputTip);
        int cmdIndex = inputReader.nextInt();

        for (CommandsEnum cmd: CommandsEnum.values()) {
            if (cmdIndex == cmd.getValue()) {
                return cmd;
            }
        }

        // Of no command with such index, re-try
        return getUserCommand(Constants.USER_COMMAND_INPUT_TIP_ERROR);
    }

    // Issues single float from user
    public float getFloatFromUser(String inputTip) {
        try {
            System.out.print(inputTip);
            return inputReader.nextFloat();
        } catch (InputMismatchException ex) {
            inputReader.nextLine();
            return getFloatFromUser(Constants.FLOAT_INPUT_TIP_ERROR);
        }
    }
    
    public void printResult(CommandsEnum cmdCalled, float A, float B, float Result) {
        System.out.println("\n" + A + " " + cmdCalled.getSign() + " " + B + " = " + Result + "\n");
    }

    public void printHistory(Queue<String> history) {
        System.out.println();
        for (Object a: history.toArray()) {
            System.out.println((String)a);
        }
        System.out.println();
    }

}
