package MyFarm.Building;

import MyFarm.Base.Building;

public class Garden extends Building {
    public Garden(String name) {
        super(name);
    }

    public void getDescription() {
        System.out.print(getName() + " is a garden, has:" + '\n');
    }
}