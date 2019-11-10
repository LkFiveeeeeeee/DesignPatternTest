import MyFarm.Farm;
import MyFarm.factories.BaseFactory;
import MyFarm.farmland.BaseLand;
import MyFarm.tool.Tool;
import org.junit.Test;

public class FactoryTest {
    /**
     * 工厂模式测试
     * 无问题
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
