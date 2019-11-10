package MyFarm;

public class Memento {
    public int num = 0;
    public int foodMachine = 200;  // 初始机器中有200食物

    public void setnum(int num) {
        this.num = num;
    }

    public int getstate() {
        return foodMachine;
    }

    public void displayInfo(int num) {
        System.out.println("种子的数目为" + num);
    }

}

