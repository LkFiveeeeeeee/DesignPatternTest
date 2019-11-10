package MyFarm.animals;

import MyFarm.animalState.FullState;
import MyFarm.creature.Creature;

public class Duck extends BaseAnimal implements Cloneable {

    public Duck() {

        this.isSaled = false;
        this.isMature = false;
        this.value = 1;
        this.name = "Duck";

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
     * 原型模式 克隆
     *
     * @return
     */
    @Override
    public Creature clone() {
        Duck duck = null;
        try {
            duck = (Duck) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return duck;
    }

    /**
     * 获取名字
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
            System.out.println("Duck becomes hungry");
        } else {
            state.gainExperience(this);
        }
        if (this.experience >= 144) {
            this.isMature = true;
        }
    }

    /**
     * 被喂食
     *
     * @param currentTime 现在的时间
     */
    public void getFed(int currentTime) {
        this.state = FullState.getInstance();
        lastSupplyTime = currentTime;
    }

    public void add() {
        System.out.println("鸭子");
    }

    @Override
    public void attribute() {

    }
}
