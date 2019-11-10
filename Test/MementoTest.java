
import MyFarm.Facade;
import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;
import MyFarm.owner.Owner;
import org.junit.Test;

import java.sql.Time;

public class MementoTest {
    static boolean isStop = false;

    /**
     * 备忘录模式测试
     * 问题1：该模式的类图中的类指代不明和Mement<<interface>>不存在，且代码中的Memento类没有使用到
     * 问题2：金币复原的场景中，金币是直接复原到初始金币，完全不符合逻辑，且该场景也不适合用备忘录模式
     */
    @Test
    public void testOne(){
        Time time = new Time();
        Thread th = new Thread(time);
        th.start();
        double state = Owner.money;
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前拥有金币" + Owner.money);
        System.out.println("复原");
        Owner.money = state;
        System.out.println("复原后拥有金币" + Owner.money);
        isStop =true;

        PlantMenu plantMenu = new PlantMenu();
        AnimalMenu animalMenu = new AnimalMenu();
        Facade facade = new Facade(plantMenu,animalMenu);
        facade.plantCrop("Crop2");
        facade.plantCrop("Crop3");
        System.out.println("当前的作物为");
        plantMenu.displayInfo();
        System.out.println("复原");
        plantMenu.memo();
        System.out.println("复原后的作物为");
        plantMenu.displayInfo();
    }
    static class Time implements Runnable {
        @Override
        public void run() {
            try {
                while (!isStop) {
                    Owner.money++;
                    System.out.println("现在拥有金币" + Owner.money);
                    Thread.sleep(1000);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
