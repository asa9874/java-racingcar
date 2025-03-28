package racingcar;

import racingcar.util.RandomNumberUtil;
import racingcar.util.ValidationUtil;

public class Car {
    private String name = "홍길동";
    private int location = 0;
    private static final int MOVE_DISTANCE = 1;
    private static final int MOVE_AVAILABLE_NUMBER = 4;

    public Car(String name) {
        ValidationUtil.validateCarName(name);
        this.name = name;
        this.location = 0;
    }

    public void move() {
        if (RandomNumberUtil.generateNumber() >= MOVE_AVAILABLE_NUMBER) {
            location+= MOVE_DISTANCE;
        }
        System.out.println(name + " : " + "-".repeat(location));
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }
}
