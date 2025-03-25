package racingcar.util;

public class ValidationUtil {
    public static void validateCarName(String name) {
        if (name == null || name.length() > 5 || name.length() == 0) {
            throw new IllegalArgumentException("[ERROR] Car Name Error");
        }
    }
}
