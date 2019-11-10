package MyFarm.observer;

import java.util.Observable;

public class Plant extends Observable {
    public void watering() {
        System.out.println("某植物需要浇水");
        super.setChanged();
        super.notifyObservers("该植物需要浇水");
    }

    public void fertilizing() {
        System.out.println("某植物需要施肥");
        super.setChanged();
        super.notifyObservers("该植物需要施肥");
    }
}
