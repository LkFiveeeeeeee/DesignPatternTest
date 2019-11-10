package MyFarm.state;

public class Fertilize implements State {//施肥，将土地状态改为fertilized

    public void doAction(Context context) {
        System.out.println("the land is fertilized");
        context.setState(this);
    }

    public String toString() {
        return "fertilized";
    }
}
