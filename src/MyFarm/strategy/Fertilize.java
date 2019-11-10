package MyFarm.strategy;

public class Fertilize {
    private FertilizeStrategy strategy;

    public Fertilize(FertilizeStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
