package MyFarm.animals;

import MyFarm.animalState.FullState;
import MyFarm.creature.Creature;


public class Dog extends BaseAnimal implements Cloneable {
    public Dog() {
        this.isMature = false;
        this.value = 1;
        this.name = "Dog";
    }

    /**
     * @return 狗的价值
     */
    public double cost() {
        return this.value;
    }

    /**
     * 原型模式 返回克隆动物
     *
     * @return dog
     */

    @Override
    public Creature clone() {
        Dog dog = null;
        try {
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dog;
    }

    /**
     * 返回姓名
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * 随时间变化，狗状态变化
     *
     * @param currentTime
     */
    @Override
    public void timeChange(int currentTime) {
        if (currentTime - lastSupplyTime > 5) {
            state.getHungry(this);
            System.out.println("Dog becomes hungry");
        } else {
            state.gainExperience(this);
        }
        if (this.experience >= 100) {
            this.isMature = true;
        }
    }


    /**
     * 狗被喂食
     *
     * @param currentTime
     */
    public void getFed(int currentTime) {
        this.state = FullState.getInstance();
        lastSupplyTime = currentTime;
    }

    public void add() {
        System.out.println("狗");
    }

}
