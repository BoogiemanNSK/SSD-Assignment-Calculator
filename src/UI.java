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

    public enum commandsEnum {
        Sum, Subtraction, Multiplication, Division, Exit
    }

    public UI() {
        _userWantsToExit = false;
        inputReader = new Scanner(System.in);
    }

    public void printMenu() {
        System.out.print(Constants.MENU);
    }

    public commandsEnum getUserCommand(String inputTip) {
        System.out.print(inputTip);
        int cmdIndex = inputReader.nextInt();
        switch (cmdIndex) {
            case 0:
                return commandsEnum.Exit;
            case 1:
                return commandsEnum.Sum;
            case 2:
                return commandsEnum.Subtraction;
            case 3:
                return commandsEnum.Multiplication;
            case 4:
                return commandsEnum.Division;
            default:
                return getUserCommand(Constants.USER_COMMAND_INPUT_TIP_ERROR);
        }
    }

    // TODO Error for non-floats
    public float getFloatFromUser(String inputTip) {
        System.out.print(inputTip);
        return inputReader.nextFloat();
    }

    public void printResult(commandsEnum cmdCalled, float A, float B, float Result) {
        System.out.println("\n" + A + " " +
                Constants.CMD_ENUM_TO_SIGN_STRING.get(cmdCalled) +
                " " + B + " = " + Result + "\n");
    }
}
