package racingcar.util;

public class ValidationUtil {
    private static final int MAX_NAME_LENGTH = 5;

    public static void validateCarName(String name) {
        if (name == null || name.length() > MAX_NAME_LENGTH || name.length() == 0) {
            throw new IllegalArgumentException("[ERROR] Car Name Error");
        }
    }
}
