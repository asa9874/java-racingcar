package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        CarRacingSimulation carRacingSimulation = new CarRacingSimulation();
        
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String carsString = Console.readLine();
        carRacingSimulation.CreateCars(carsString);

        System.out.println("시도할 회수는 몇회인가요?");
        String roundString = Console.readLine();
        carRacingSimulation.writeRound(roundString);

        carRacingSimulation.simulate();
        carRacingSimulation.getWinners();
    }

}
