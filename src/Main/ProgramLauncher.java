package Main;

public class ProgramLauncher {

    public static void main(String[] args) {
        UI ui = new UI();
        Calculator calculator = new Calculator();

        while (!ui.userWantsToExit()) {
            ui.printMenu();
            CommandsEnum cmdEntered = ui.getUserCommand(Constants.USER_COMMAND_INPUT_TIP);

            // If User wants to exit, simply skip all further execution
            if (cmdEntered == CommandsEnum.Exit) {
                ui.setUserWantToExitTrue();
                continue;
            }
            // If user wants to see history, show it, then continue
            else if (cmdEntered == CommandsEnum.PrintHistory) {
                ui.printHistory(calculator.getOperationsHistory());
                continue;
            }

            // Otherwise, get input from user, and produce result from command
            float A, B, Result;
            A = ui.getFloatFromUser(Constants.FLOAT_A_INPUT_TIP);
            B = ui.getFloatFromUser(Constants.FLOAT_B_INPUT_TIP);

            try {
                Result = calculator.calculateResult(A, B, cmdEntered);
                ui.printResult(cmdEntered, A, B, Result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
