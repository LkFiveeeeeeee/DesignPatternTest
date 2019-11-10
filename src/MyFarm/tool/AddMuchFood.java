package MyFarm.tool;

import MyFarm.Farm;

import java.io.Serializable;

public class AddMuchFood implements Food, Serializable {
    public void AddFood(int amount) {
        Farm farm = Farm.getInstance();

        while (amount > 0) {
            int per;
            if (amount >= 10) per = 10;
            else per = amount;
            farm.foodMachine += per;
            amount -= per;
            farm.foodWarehouse -= per;
            System.out.println("添加食物：10，食物机中食物总量：" + farm.foodMachine);
        }
    }
}
