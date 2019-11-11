import MyFarm.Farm;
import MyFarm.factories.BaseFactory;
import MyFarm.factories.LandFactory;
import MyFarm.farmland.BaseLand;
import MyFarm.tool.Tool;
import MyFarm.tool.ToolPackage;


/**
 *享元模式测试
 * 问题：第二个享元模式测试未通过，本应共享地址的对象地址不相等一个为空
 */
public class FlyweightTest {
    public static void main(String[] args) {
        BaseFactory tool_factory = Farm.getInstance().tool_factory;
        System.out.println("从Factory获取工具");
        Tool hoe = tool_factory.getTool("Hoe");
        Tool hoe2 = tool_factory.getTool(("Hoe"));
        System.out.println("测试共享对象的地址是否相等："+(hoe==hoe2));


        System.out.println();
        BaseLand land1 = LandFactory.getFlyweight("黄土地");
        BaseLand land2 = LandFactory.getFlyweight("黄土地");

        System.out.println("测试共享对象的地址是否相等："+(land1==land2));
    }

}
