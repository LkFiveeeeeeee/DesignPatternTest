import MyFarm.Building.*;
import org.junit.Test;

public class DecoratorTest {
    /**
     * 装饰着模式测试
     * 符合装饰着模式要求
     */
    @Test
    public void testCaseOne(){
        Facility house = new House("house");
        house = new YellowFlower(house);
        house.getDescription();
        Facility garden = new Garden("garden");
        garden = new Canopy(garden);
        garden = new RedFlower(garden);
        garden.getDescription();

    }
}
