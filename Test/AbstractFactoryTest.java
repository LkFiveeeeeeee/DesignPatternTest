import MyFarm.Farm;
import MyFarm.factories.BaseFactory;
import MyFarm.farmland.BaseLand;
import MyFarm.tool.Tool;
import org.junit.Test;

public class AbstractFactoryTest {
    /**
     * 抽象工厂模式测试
     * 无问题，但是模式使用不合理，没有必要使用抽象工厂/抽象工厂使用错误
     */
    @Test
    public void factoryTest(){
        BaseFactory land_factory = Farm.getInstance().land_factory;
        BaseFactory tool_factory = Farm.getInstance().tool_factory;
        BaseLand building_land = land_factory.getLand("BuildingLand");
        BaseLand farmLand = land_factory.getLand("FarmLand");
        Tool hoe = tool_factory.getTool("Hoe");
        Tool big_bowl = tool_factory.getTool("BigBowl");
        Tool small_bowl = tool_factory.getTool("SmallBowl");
    }
}
