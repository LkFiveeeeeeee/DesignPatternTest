import MyFarm.shopping.Customer;
import MyFarm.shopping.Proxy;
import org.junit.Test;

import java.util.Scanner;

public class ProxyTest {
    /**
     * 测试代理模式
     * 存在问题：
     * 1. 购买的货物是自己手动输入的字符串，不存在的货物也可以被购买
     * 2. 和其他场景完全孤立，不会从仓库中扣除货物数量，也不会扣除顾客的钱。
     */
    @Test
    public void testCaseOne(){
        String category = "牛肉";
        Customer customer = new Customer("小明");

        Proxy proxySeller = new Proxy(customer);
        proxySeller.OutGood(category);
    }
}
