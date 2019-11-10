package MyFarm.Building;

import MyFarm.Base.DecorateOfFacility;

public class YellowFlower extends DecorateOfFacility {
    public YellowFlower(Facility facility) {
        super(facility);
    }

    public void getDescription() {
        DecoratedFacility.getDescription();
        plantyellowflower();
    }

    private void plantyellowflower() {
        System.out.println("yellow flowers");
    }
}