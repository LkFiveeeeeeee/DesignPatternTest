import MyFarm.animalState.Adapter;
import MyFarm.animalState.ConcreateDuck;
import MyFarm.animals.Duck;
import org.junit.Test;
public class AdapterTest {

    /**
     * 适配器模式测试
     * 无问题
     */
    @Test
    public void adapterTest(){
        Duck duck = new ConcreateDuck();
        duck.attribute();
        //普通鸭子的属性
        Duck duckPet = new Adapter();
        duckPet.attribute();
    }
}
