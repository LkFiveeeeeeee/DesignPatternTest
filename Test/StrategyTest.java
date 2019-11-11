import MyFarm.strategy.Fertilize;
import MyFarm.strategy.Plant1;
import MyFarm.strategy.Plant2;
import MyFarm.strategy.Plant3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;
import java.io.PrintStream;

public class StrategyTest {

    private  PrintStream console = null;
    private ByteArrayOutputStream bytes = null;

    @Before
    public void setUp() {
        System.out.println("策略模式开始测试");
        bytes = new ByteArrayOutputStream();    // 把标准输出指定到ByteArrayOutputStream中
        console = System.out;                   // 获取System.out 输出流的句柄
        System.setOut(new PrintStream(bytes));  // 将原本输出到控制台Console的字符流重定向到bytes
    }

    @After
    public void tearDown() {
        System.setOut(console);
        System.out.println("策略模式测试成功");
    }

    @Test
    public void fertilizeTest() {

        // 施钾肥测试
        Fertilize fertilize = new Fertilize(new Plant3());
        fertilize.operate();
        assertTrue(bytes.toString().contains("施钾肥"));

        // 施磷肥测试
        fertilize = new Fertilize(new Plant2());
        fertilize.operate();
        assertTrue(bytes.toString().contains("施磷肥"));

        // 施氮肥测试
        fertilize = new Fertilize(new Plant1());
        fertilize.operate();
        assertTrue(bytes.toString().contains("施氮肥"));
    }
}
