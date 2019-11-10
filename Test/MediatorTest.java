

import MyFarm.Mediator;
import MyFarm.animals.Dog;
import MyFarm.animals.Pig;
import MyFarm.menu.AnimalMenu;
import MyFarm.owner.Owner;
import org.junit.Test;

public class MediatorTest {
    /**
     * 中介者模式测试
     * 问题：Mediator没有查看动物的饥饿状态就一律全部喂养，不合理
     */
    @Test
    public void testOne(){
        AnimalMenu animalMenu = new AnimalMenu();
        Pig pig = new Pig();
        Dog dog = new Dog();
        animalMenu.addAnimal(pig);
        animalMenu.addAnimal(dog);
        Mediator mediator = new Mediator(animalMenu);
        pig.showHunger();
        Owner.getInstance().feedAll();
    }
}
