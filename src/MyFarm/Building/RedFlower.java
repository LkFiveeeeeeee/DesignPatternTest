package MyFarm.Building;

import MyFarm.Base.DecorateOfFacility;

public class RedFlower extends DecorateOfFacility {
    public RedFlower(Facility facility) {
        super(facility);
    }

    public void getDescription() {
        DecoratedFacility.getDescription();
        plantredflower();
    }

    private void plantredflower() {
        System.out.println("red flowers");
    }
}
