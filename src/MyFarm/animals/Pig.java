package MyFarm.animals;

import MyFarm.animalState.FullState;
import MyFarm.creature.Creature;

public class Pig extends BaseAnimal implements Cloneable {

    public Pig() {

        this.isSaled = false;
        this.isMature = false;
        this.value = 1;
        this.name = "Pig";
    }

    /**
     * 返回价值
     *
     * @return
     */
    public double cost() {
        return this.value;
    }

    /**
     * 原型模式克隆
     *
     * @return
     */
    @Override
    public Creature clone() {
        Pig pig = null;
        try {
            pig = (Pig) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pig;
    }

    /**
     * 返回名字
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    @Override
    /**
     * 随时间变化状态的变化
     * @param currentTime
     */
    public void timeChange(int currentTime) {
        if (currentTime - lastSupplyTime > 5) {
            state.getHungry(this);
            System.out.println("Pig becomes hungry");
        } else {
            state.gainExperience(this);
        }
        if (this.experience >= 120) {
            this.isMature = true;
        }
    }


    /**
     * 被喂食
     *
     * @param currentTime 现在时间
     */
    public void getFed(int currentTime) {
        this.state = FullState.getInstance();
        lastSupplyTime = currentTime;
    }

    public void add() {
        System.out.println("猪");
    }

}
