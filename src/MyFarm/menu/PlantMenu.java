package MyFarm.menu;

import MyFarm.plants.BasePlant;

import java.util.ArrayList;
import java.util.List;

public class PlantMenu extends BaseMenu {
    public List<BasePlant> Plants;

    public PlantMenu() {
        Plants = new ArrayList<BasePlant>();
    }

    /**
     * 加入植物
     *
     * @param Plant 植物
     */
    public void addPlant(BasePlant Plant) {
        Plants.add(Plant);
    }

    /**
     * 通过序号返回植物
     *
     * @param index 序号
     * @return列表中的植物
     */
    public BasePlant getPlant(int index) {
        return Plants.get(index);
    }

    /**
     * 删除列表中的植物
     *
     * @param index 序号
     */
    public void removePlant(int index) {
        Plants.remove(index);
    }

    /**
     * 删除列表中的植物
     *
     * @param Plant 要删除的植物
     */
    public void removePlant(BasePlant Plant) {
        Plants.remove(Plant);
    }

    /**
     * 获取植物数量
     *
     * @return 列表长度
     */
    public int size() {
        return Plants.size();
    }

    public void memo() {
        Plants.remove(Plants.size() - 1);
    }

    public void displayInfo() {
        for (int i = 0; i < Plants.size(); ++i) {
            System.out.println(Plants.get(i).getName());
        }
    }

    /**
     * Get a iterator of plant list
     * @return A iterator
     */

}