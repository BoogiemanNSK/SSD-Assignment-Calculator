import java.util.HashMap;
import java.util.Map;

public class Constants {

    final static String USER_COMMAND_INPUT_TIP = "Please, enter your command (Number 0-4): ";
    final static String USER_COMMAND_INPUT_TIP_ERROR = "Please, enter correct number: ";
    final static String FLOAT_A_INPUT_TIP = "Please, enter float A: ";
    final static String FLOAT_B_INPUT_TIP = "Please, enter float A: ";

    final static String MENU = "List of commands:\n" +
            "1 : A + B (Sum two floats);\n" +
            "2 : A - B (Subtract one float from another);\n" +
            "3 : A * B (Multiply two floats);\n" +
            "4 : A / B (Divide one float on another);\n" +
            "0 : Exit;\n";

    final static Map<UI.commandsEnum, String> CMD_ENUM_TO_SIGN_STRING =
            new HashMap<UI.commandsEnum, String>() {{
                put(UI.commandsEnum.Sum,            "+");
                put(UI.commandsEnum.Subtraction,    "-");
                put(UI.commandsEnum.Multiplication, "*");
                put(UI.commandsEnum.Division,       "/");
            }};

}
