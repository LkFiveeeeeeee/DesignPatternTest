package MyFarm;

import MyFarm.factories.BaseFactory;
import MyFarm.factories.FactoryProducer;
import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;
import MyFarm.tool.AddLittleFood;
import MyFarm.tool.AddMuchFood;

import java.io.Serializable;

public class Farm implements Serializable {
    private static Farm instance = new Farm();

    public AnimalMenu animalMenu = new AnimalMenu();
    public PlantMenu plantMenu = new PlantMenu();


    public BaseFactory tool_factory;
    public BaseFactory land_factory;


    public AddLittleFood add_little_food;
    public AddMuchFood add_much_food;

    public int foodWarehouse = 500;
    public int foodMachine = 200;

    /**
     * 获取工厂
     */
    public Farm() {
        FactoryProducer factory_producer = new FactoryProducer();
        tool_factory = factory_producer.getFactory("Tool");
        land_factory = factory_producer.getFactory("Land");

        add_little_food = new AddLittleFood();
        add_much_food = new AddMuchFood();
    }

    /**
     * 返回农场的实例
     *
     * @return farm instance
     */
    public static Farm getInstance() {
        Farm temp = instance;
        if (temp == null) {
            synchronized (Farm.class) {
                temp = instance;
                if (temp == null) {
                    instance = new Farm();
                    temp = instance;
                }
            }
        }
        return temp;
    }


}
