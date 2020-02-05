package Main;

public enum CommandsEnum {
    Sum (0, "+"),
    Subtraction (1, "-"),
    Multiplication (2, "*"),
    Division (3, "/"),
    PrintHistory (4, ""),
    Exit (5, "");

    private final int value;
    private final String sign;

    CommandsEnum(int value, String sign) {
        this.value = value;
        this.sign = sign;
    }

    public int getValue() {
        return value;
    }

    public String getSign() {
        return sign;
    }
}
