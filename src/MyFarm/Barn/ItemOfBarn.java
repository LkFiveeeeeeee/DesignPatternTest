package MyFarm.Barn;

//仓库储藏的物品类 作为叶节点
public class ItemOfBarn extends EntryBarn {
    private String name;

    public ItemOfBarn(String name, int value) {
        this.name = name;
        this.setValue(value);
    }

    @Override
    public String getName() {
        return name;
    }

    public void printlist(String p) {
        System.out.println(p + "|" + this);
    }
}
