package MyFarm.menu;

import MyFarm.animals.BaseAnimal;
import MyFarm.creature.Creature;

import java.util.ArrayList;

public class AnimalMenu extends BaseMenu {

    public AnimalMenu() {
        creatures = new ArrayList<Creature>();
    }

    /**
     * 向列表加入动物
     *
     * @param animal 要加入的动物
     */
    public void addAnimal(BaseAnimal animal) {
        creatures.add(animal);
    }

    /**
     * Return 要获取的动物
     *
     * @param index 动物的序号
     * @return 该序号的动物
     */
    public BaseAnimal getAnimal(int index) {
        return (BaseAnimal) creatures.get(index);
    }

    /**
     * 通过序号删除该动物
     *
     * @param index 序号
     */
    public void removeAnimal(int index) {
        creatures.remove(index);
    }

    /**
     * 删除某个动物
     *
     * @param animal 动物实体
     */
    public void removeAnimal(BaseAnimal animal) {
        creatures.remove(animal);
    }

    /**
     * 获取总数
     *
     * @return 列表长度
     */
    public int size() {
        return creatures.size();
    }


}