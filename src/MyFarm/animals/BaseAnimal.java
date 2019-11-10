package MyFarm.animals;

import MyFarm.Farm;
import MyFarm.Mediator;
import MyFarm.animalState.FullState;
import MyFarm.animalState.HungryState;
import MyFarm.creature.Creature;
import MyFarm.owner.Owner;

public abstract class BaseAnimal extends Creature {

    public int lastSupplyTime = 0;

    //种植函数
    public abstract void add();

    // 喂食
    public void getFed(int currentTime) {
        this.state = FullState.getInstance();
        lastSupplyTime = currentTime;
    }

    /**
     * 查看饥饿状态
     *
     * @return hungry state
     */
    public boolean isHungry() {
        return this.state == HungryState.getInstance();
    }

    //吴
    public void showHunger() {
        Mediator.showHunger(getName());
    }

    /**
     * 卖掉动物
     */
    public void doSell() {
        if (this.isSaled) {
            System.out.println("This animal is already saled!");
        } else {
            this.isSaled = true;

            // Judge the case of the animal
            String name = this.getName();
            if (name == "Pig") {
                Owner.getInstance().editMoney(3000);
            } else if (name == "Dog") {
                Owner.getInstance().editMoney(5000);
            }

            // Remove the animal from menu
            Farm instance = Farm.getInstance();
            instance.animalMenu.removeAnimal(this);
            System.out.println("Sale finished!");
        }
    }

    /**
     * Adapter 要用
     */
    public void attribute() {
    }
}
