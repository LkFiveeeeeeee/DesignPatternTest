package MyFarm.Building;

import MyFarm.Base.Building;

public class House extends Building {
    public House(String name) {
        super(name);
    }

    public void getDescription() {
        System.out.print(getName() + " is a house, has:" + '\n');
    }
}
