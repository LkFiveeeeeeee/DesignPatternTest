package MyFarm.state;

public class Water implements State {//浇水，将土地状态改为watered

    public void doAction(Context context) {
        System.out.println("the land is waterd");
        context.setState(this);
    }

    public String toString() {
        return "watered";
    }
}
