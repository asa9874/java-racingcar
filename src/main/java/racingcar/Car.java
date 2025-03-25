package racingcar;

import racingcar.util.RandomNumberUtil;

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

    public void move(){
        if(RandomNumberUtil.generateNumber()>= 4){
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
