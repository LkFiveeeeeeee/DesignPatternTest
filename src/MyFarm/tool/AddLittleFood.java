package MyFarm.tool;

import MyFarm.Farm;

import java.io.Serializable;

public class AddLittleFood implements Food, Serializable {
    public void AddFood(int amount) {
        Farm farm = Farm.getInstance();

        while (amount > 0) {
            int per;

            if (amount >= 5) per = 5;
            else per = amount;

            farm.foodMachine += per;
            amount -= per;
            farm.foodWarehouse -= per;
            System.out.println("添加食物：5，食物机中食物总量：" + farm.foodMachine);
        }
    }
}
