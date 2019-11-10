package MyFarm.observer;

import java.util.Observable;

public class Observer1 implements java.util.Observer {
    public void update(Observable observable, Object object) {
        this.doSomething(object.toString());
    }

    private void doSomething(String context) {
        System.out.println("report to Observer1 :" + context);
    }
}
