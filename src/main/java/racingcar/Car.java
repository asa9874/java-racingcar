package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name = "홍길동";
    private int location = 0;

    public Car(String name) {
        if( name == null || name.length()>5 || name.length()==0 ){
            throw new IllegalArgumentException("[ERROR] Car Name Error");
        }
        this.name = name;
        this.location = 0;
    }

    // 무작위 숫자가 4이상일때 움직임
    public void move(){
        if(Randoms.pickNumberInRange(0,9) >= 4){
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
