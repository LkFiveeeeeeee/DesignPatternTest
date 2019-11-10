package MyFarm.observer;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        Observer owner = new Observer1();
        Observer visitor = new Observer2();

        Plant plant = new Plant();

        plant.addObserver(owner);
        plant.addObserver(visitor);

        // 例：需要浇水
        plant.watering();
    }
}
