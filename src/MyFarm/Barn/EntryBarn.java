package MyFarm.Barn;

import MyFarm.Base.Item;

//空仓库类 作为根节点
public abstract class EntryBarn extends Item {
    public abstract String getName();

    protected abstract void printlist(String p);

    public String toString() {
        return getName() + "(" + getValue() + ")";
    }

}
