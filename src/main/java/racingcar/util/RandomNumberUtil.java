package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberUtil {
    private static final int START_NUMBER = 0;
    private static final int END_NUMBER = 9;

    public static int generateNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
