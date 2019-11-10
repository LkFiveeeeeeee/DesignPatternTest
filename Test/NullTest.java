package MyFarm;

import MyFarm.nullobject.NullPatternDemo;
import MyFarm.nullobject.NullProduct;
import MyFarm.state.Context;
import MyFarm.state.State;
import MyFarm.state.Water;
import org.junit.Test;

public class NullTest{
    @Test
    public void NTest() {
        //用的不是很明确，为什么要专门写个demo
        NullProduct project =new NullProduct();
        project.getName();
        project.isNil();
    }
}