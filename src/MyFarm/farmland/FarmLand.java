/**
 *
 */
package MyFarm.farmland;

import MyFarm.creature.Creature;

public abstract class FarmLand extends BaseLand {
    public FarmLand(float attribute) {
        super(attribute);
    }

    public FarmLand() {
        super();
    }

    //接受外部状态
    public FarmLand(String sd, float attribute) {
        super(attribute);
    }

    //根据外部状态进行逻辑处理
    @Override
    public void operate(String att) {
        System.out.println("具体属性值:" + att);
    }

    /**
     *
     * @param creature
     */
    public void addCreature(Creature creature) {

    }


    public void showCrop() {
        System.out.println("该土地种下了");
        creature.add();
    }

    public BaseLand clone() {
        return null;
    }
}
