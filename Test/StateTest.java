package MyFarm;

import MyFarm.state.Context;
import MyFarm.state.State;
import MyFarm.state.Water;
import org.junit.Test;

public class StateTest{
    @Test
    public void STest() {
        State state = new Water();
        Context context = new Context();
        context.setState(state);
        //setState 没有任何附加动作
        //doAction也没有体现
    }
}

