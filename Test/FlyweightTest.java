import MyFarm.Farm;
import MyFarm.factories.BaseFactory;
import MyFarm.factories.LandFactory;
import MyFarm.farmland.BaseLand;
import MyFarm.tool.Tool;
import MyFarm.tool.ToolPackage;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 */
public class FlyweightTest {
    @Test
    public void testOne() {
        Farm farm = Farm.getInstance();
        BaseFactory land_factory = Farm.getInstance().land_factory;
        BaseFactory tool_factory = Farm.getInstance().tool_factory;
        ToolPackage tool_package = new ToolPackage();
        System.out.println("从Factory获取工具");
        Tool hoe = tool_factory.getTool("Hoe");
        Tool big_bowl = tool_factory.getTool("BigBowl");
        Tool small_bowl = tool_factory.getTool("SmallBowl");
        Tool hoe2 = tool_factory.getTool(("Hoe"));
        Assert.assertSame("共享的对象地址不相等",hoe,hoe2);



        System.out.println();
        BaseLand landx = LandFactory.getFlyweight("黄土地");
        BaseLand landy = LandFactory.getFlyweight("黑土地");
        BaseLand landz = LandFactory.getFlyweight("黄土地");
        System.out.println("已创建三块土地");

        Assert.assertSame("共享的对象地址不相等",landx,landz);
    }

}
