import MyFarm.observer.Observer1;
import MyFarm.observer.Observer2;
import MyFarm.observer.Plant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;
import java.io.PrintStream;

/**
 * 观察者模式测试
 *
 * 没有逻辑问题
 */
public class ObserverTest {

    private  PrintStream console = null;
    private ByteArrayOutputStream bytes = null;

    @Before
    public void setUp() {
        System.out.println("观察者模式开始测试");
        bytes = new ByteArrayOutputStream();    // 把标准输出指定到ByteArrayOutputStream中
        console = System.out;                   // 获取System.out 输出流的句柄
        System.setOut(new PrintStream(bytes));  // 将原本输出到控制台Console的字符流重定向到bytes
    }

    @After
    public void tearDown() {
        System.setOut(console);
        System.out.println("观察者模式测试成功");
    }

    @Test
    public void observerTest() {
        // declare an observable object
        Plant plant = new Plant();

        // attach the observers to the observable
        plant.addObserver(new Observer1());
        plant.addObserver(new Observer2());

        plant.watering();

        assertEquals(bytes.toString().replaceAll("[\r\n]", ""), "某植物需要浇水" +
                "report to Observer2 :该植物需要浇水" + "report to Observer1 :该植物需要浇水");
    }
}
