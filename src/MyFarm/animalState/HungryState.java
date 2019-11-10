package MyFarm.animalState;

import MyFarm.creature.Creature;

public class HungryState implements State {
    private static HungryState hungryState = new HungryState();

    private HungryState() {

    }

    public static State getInstance() {
        return hungryState;
    }

    public void getFull(Context context) {
    }

    public void getHungry(Context context) {
    }

    public void gainExperience(Creature animal) {
    }
}
