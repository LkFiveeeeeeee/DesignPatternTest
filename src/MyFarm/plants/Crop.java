package MyFarm.plants;

import MyFarm.animalState.CropState;
import MyFarm.creature.Creature;

public class Crop extends BasePlant implements Cloneable {

    public Crop() {
        this.isMature = false;

        this.state = CropState.getInstance();
        this.name = "Crop";
    }

    public void doSell() {

    }

    public void tick() {

    }

    public void add() {
        System.out.println("ֲ��");
    }

    @Override
    public Crop clone() {
        Crop crop = null;
        try {
            crop = (Crop) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return crop;
    }

    public String getName() {
        return name;
    }

    public void timeChange(int currentTime) {
        state.gainExperience(this);
        if (this.experience >= 72) {
            this.isMature = true;
        }
    }

    public double cost() {
        return 0.1;
    }
}
