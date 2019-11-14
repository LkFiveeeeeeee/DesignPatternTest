import MyFarm.animals.Dog;
import MyFarm.animals.Duck;
import MyFarm.animals.Pig;
import MyFarm.plants.Crop;
import org.junit.Test;

/**
 * 实现错误，具体说明看文档
 */
public class TemplateTest {

    /**
     * 其中每种植物或动物的timeChange()函数不同，因而作者认为实现了模版方法模式;<br/>
     * <h1 color="red">我们认为这完全误解了模版方法模式</h1>
     */
    @Test
    public void templateTest() {

        Dog dog = new Dog();
        dog.timeChange(200);

        Duck duck = new Duck();
        duck.timeChange(100);

        Pig pig = new Pig();
        pig.timeChange(3);

        Crop crop = new Crop();
        crop.timeChange(50);

        System.out.println("实现错误");
    }
}
