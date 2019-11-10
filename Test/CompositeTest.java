package MyFarm;

import MyFarm.Barn.BoxOfBarn;
import MyFarm.Barn.ItemOfBarn;
import org.junit.Test;

public class CompositeTest {
    /**
     * 组合模式测试
     * 无问题
     */
    @Test
    public void adapterTest(){
        BoxOfBarn boxOfBarn1=new BoxOfBarn("1");
        BoxOfBarn boxOfBarn2=new BoxOfBarn("2");
        BoxOfBarn boxOfBarn3=new BoxOfBarn("3");
        ItemOfBarn itemOfBarn=new ItemOfBarn("10",7);
        boxOfBarn1.add(boxOfBarn2);
        boxOfBarn2.add(itemOfBarn);
        boxOfBarn2.add(boxOfBarn3);
        boxOfBarn1.printlist("test");

    }
}
