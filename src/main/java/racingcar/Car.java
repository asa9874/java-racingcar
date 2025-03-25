package racingcar;

import racingcar.util.RandomNumberUtil;
import racingcar.util.ValidationUtil;

public class Car {
    private String name = "홍길동";
    private int location = 0;

    public Car(String name) {
        ValidationUtil.validateCarName(name);
        this.name = name;
        this.location = 0;
    }

    public void move() {
        if (RandomNumberUtil.generateNumber() >= 4) {
            location++;
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
