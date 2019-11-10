import MyFarm.Farm;
import MyFarm.factories.BaseFactory;
import MyFarm.factories.ToolFactory;
import MyFarm.tool.PackageBuilder;
import MyFarm.tool.ToolPackage;
import org.junit.Test;

public class BuilderTest {
    /**
     * 工厂模式测试
     * 无问题
     */
    @Test
    public void factoryTest(){
        BaseFactory tool_factory = Farm.getInstance().tool_factory;
        ToolPackage tool_package = new ToolPackage();
        PackageBuilder packageBuilder = new PackageBuilder();
        packageBuilder.buildPackage(tool_package, (ToolFactory) tool_factory);
    }
}
