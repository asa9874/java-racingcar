package racingcar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarRacingSimulation {
    private final List<Car> cars = new ArrayList<>();
    private int round = 0;

    public void CreateCars(String carsString){
        String[] carNames = carsString.split(",");
        for (String carName : carNames) {
            this.cars.add(new Car(carName));
        }
    }

    public void setRound(String roundString) {
        try {
            this.round = Integer.parseInt(roundString);
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] round Error");
        }
    }

    public void simulate() {
        System.out.println("\n실행 결과");
        for (int i = 0; i < this.round; i++) {
            for (Car car : cars) {
                car.move();
            }
            System.out.println();
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
        
        System.out.print("최종 우승자 : "+ String.join(", ", winnerCarNames));
    }
}
