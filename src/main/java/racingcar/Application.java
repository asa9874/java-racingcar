package racingcar;

public class Application {
    public static void main(String[] args) {
        CarRacingSimulation carRacingSimulation = new CarRacingSimulation("pobi,crong,honux");
        carRacingSimulation.simulate(5);
        carRacingSimulation.getWinners();
    }

}
