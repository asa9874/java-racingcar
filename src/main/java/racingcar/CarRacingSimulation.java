package racingcar;

import java.util.ArrayList;
import java.util.Comparator;
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

    public void getWinners() {
        List<String> winnerCarNames = new ArrayList<>();
        List<Car> sortedCars = this.cars.stream()
                .sorted(Comparator.comparingInt(Car::getLocation).reversed())
                .toList();
        int maxLocation = sortedCars.get(0).getLocation();

        for (Car car : sortedCars) {
            if (car.getLocation() == maxLocation) {
                winnerCarNames.add(car.getName());
            }
            else break;
        }
        
        System.out.print("최종 우승자는 "+ String.join(", ", winnerCarNames) +" 입니다.");
    }
}
