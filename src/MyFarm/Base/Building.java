package MyFarm.Base;

import MyFarm.Building.Facility;

public class Building implements Facility {
    protected String name;

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getDescription() {
        System.out.print("");
    }
}
