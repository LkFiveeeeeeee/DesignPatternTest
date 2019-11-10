package MyFarm.tool;

public class SmallBowl extends Bowl {
    public SmallBowl() {
        this.name = "SmallBowl";
        this.food = new AddLittleFood();
    }

    /**
     * 添加食物
     *
     * @param amount 食物数量
     */
    public void AddFood(int amount) {
        this.food.AddFood(amount);
    }
}
