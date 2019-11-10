package MyFarm.tool;

public abstract class Bowl extends Tool {
    protected Food food;

    public Bowl() {
        System.out.println("=====Initiallize a Bowl");
    }

    public abstract void AddFood(int amount);
}
