
import org.junit.Test;
import MyFarm.animals.Dog;
import MyFarm.animals.Pig;
import MyFarm.iterator.Iterator;
import MyFarm.iterator.NameRepository;
import MyFarm.menu.AnimalMenu;

public class IteratorTest {
    /**
     * 迭代器模式测试
     * 问题1：NamesRepository中只存储了在创建NamesRepository前所创建的动物对象名字，当农场中创建了新的动物了，NamesRepository中并没有对新动物的名字进行更新。
     * 问题2：且在使用迭代器模式来遍历动物名称的使用场景不太合理。
     */
    @Test
    public void testOne(){
        AnimalMenu animalMenu = new AnimalMenu();
        Pig pig = new Pig();
        Dog dog = new Dog();

        pig.setName("pig_no_1");
        animalMenu.addAnimal(pig);
        animalMenu.addAnimal(dog);
        NameRepository namesRepository = new NameRepository();
        Dog dog1 = new Dog();
        dog1.setName("dog_no_2");
        animalMenu.addAnimal(dog);

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String product_name = (String) iter.next();
            if (product_name != null) {
                System.out.println("Name : " + product_name);
            }
        }
    }
}
