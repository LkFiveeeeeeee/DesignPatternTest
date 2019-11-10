/**
 * 存储动物的牧场
 */
package MyFarm.farmland;

public class BuildingLand extends BaseLand {


    public BuildingLand(float attribute) {
        super(attribute);
    }

    public BuildingLand() {

    }

    @Override
    public void operate(String att) {

    }

    public void showCrop() {
        System.out.println("该养殖场加入了");
        creature.add();
    }

    public BaseLand clone() {
        return null;
    }
}