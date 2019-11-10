package MyFarm.Building;

import MyFarm.Base.DecorateOfFacility;

public class Canopy extends DecorateOfFacility {
    public Canopy(Facility DecoratedFacility) {
        super(DecoratedFacility);
    }

    public void getDescription() {
        DecoratedFacility.getDescription();
        buildCanopy();
    }

    private void buildCanopy() {
        System.out.println("canopy");
    }
}