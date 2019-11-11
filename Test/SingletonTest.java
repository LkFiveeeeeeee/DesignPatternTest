import MyFarm.Farm;

public class SingletonTest {
    /**
     * 单例模式测试
     * 问题1：实例可以用new创建，实例并不唯一
     */
    public static void main(String[] args) {
        Farm farm1 = new Farm();
        Farm farm2 = Farm.getInstance();
        Farm farm3 = Farm.getInstance();

        System.out.println("测试实例的地址是否唯一："+(farm1==farm2));
        System.out.println("测试实例的地址是否唯一："+(farm2==farm3));

    }
}
