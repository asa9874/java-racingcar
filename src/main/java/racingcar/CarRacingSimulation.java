package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarRacingSimulation {
    private List<Car> cars = new ArrayList<>();

    public CarRacingSimulation(String cars) {
        String[] carNames = cars.split(",");
        for (String carName : carNames) {
            this.cars.add(new Car(carName));
        }
    }

    public void simulate(int round) {
        for (int i = 0; i < round; i++) {
            for (Car car : cars) {
                car.move();
            }
        }
    }
}
