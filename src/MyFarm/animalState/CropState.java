package MyFarm.animalState;

import MyFarm.creature.Creature;

public class CropState implements State {
    private static CropState singleton = new CropState();

    private CropState() {
    }

    /**
     * 获取单例
     *
     * @return
     */
    public static State getInstance() {
        return singleton;
    }

    public void getHungry(Context context) {
    }

    public void getFull(Context context) {
    }

    /**
     * 得到经验
     *
     * @param plant 植物类
     */
    public void gainExperience(Creature plant) {
        plant.experience++;
    }
}
