package MyFarm.animalState;

import MyFarm.creature.Creature;

import java.io.Serializable;

public interface State extends Serializable {
    void getFull(Context context);  // 饱

    void getHungry(Context context);  // 饿

    void gainExperience(Creature bc);  //获取经验
}
