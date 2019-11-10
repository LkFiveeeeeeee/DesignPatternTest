package MyFarm;

import MyFarm.animals.Dog;
import MyFarm.animals.Pig;
import MyFarm.farmland.BaseLand;
import MyFarm.farmland.BuildingLand;
import MyFarm.farmland.FarmLand;
import MyFarm.plants.Crop;

public class BridgeTest {
    public static void main(String[] args) {
        BaseLand baseLand;
        baseLand = new BuildingLand();
        BaseLand baseLand2=new FarmLand() {
            @Override
            public void operate(String att) {
                super.operate(att);
            }
        };
        Pig pig=new Pig();
        Crop crop=new Crop();
        baseLand.plant(pig);
        baseLand2.plant(crop);
        baseLand2.showCrop();
        baseLand.showCrop();
    }
}
