package MyFarm;

import MyFarm.animalState.Adapter;
import MyFarm.animalState.ConcreateDuck;
import MyFarm.animals.Duck;

public class AdapterTest {
    public static void main(String[] args) {
        Duck duck = new ConcreateDuck();
        duck.attribute();
        //普通鸭子的属性
        Duck duckPet = new Adapter();
        duckPet.attribute();
    }
}
