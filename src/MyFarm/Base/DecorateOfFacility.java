package MyFarm.Base;

import MyFarm.Building.Facility;

public class DecorateOfFacility implements Facility {
    protected Facility DecoratedFacility;

    public DecorateOfFacility(Facility DecoratedFacility) {
        this.DecoratedFacility = DecoratedFacility;
    }

    public void getDescription() {
        DecoratedFacility.getDescription();
    }
}
