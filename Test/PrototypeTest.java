import MyFarm.animals.Dog;
import MyFarm.animals.Pig;

/**
 * 原型模式测试
 * 通过
 */
public class PrototypeTest {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("原型dog");
        Dog dog1 = (Dog) dog.clone();
        System.out.println("创建的原型dog名字：" + dog.getName());
        System.out.println("克隆下来的dog名字：" + dog1.getName());

    }
}
