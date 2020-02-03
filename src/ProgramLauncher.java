public class ProgramLauncher {

    public static void main(String[] args) {
        UI ui = new UI();
        Calculator calculator = new Calculator();

        while (!ui.userWantsToExit()) {
            ui.printMenu();
            UI.commandsEnum cmdEntered = ui.getUserCommand(Constants.USER_COMMAND_INPUT_TIP);

            // If User wants to exit, simply skip all further execution
            if (cmdEntered == UI.commandsEnum.Exit) {
                ui.setUserWantToExitTrue();
                continue;
            }

            // Otherwise, get input from user, and produce result from command
            float A, B, Result;
            A = ui.getFloatFromUser(Constants.FLOAT_A_INPUT_TIP);
            B = ui.getFloatFromUser(Constants.FLOAT_B_INPUT_TIP);
            switch (cmdEntered) {
                case Sum:
                    Result = calculator.sumTwoFloats(A, B);
                    break;
                case Subtraction:
                    Result = calculator.subtractTwoFloats(A, B);
                    break;
                case Multiplication:
                    Result = calculator.multiplyTwoFloats(A, B);
                    break;
                case Division:
                    Result = calculator.divideTwoFloats(A, B);
                    break;
                default:
                    Result = 0.0f;
            }

            ui.printResult(cmdEntered, A, B, Result);
        }
    }

}
