package MyFarm.Barn;

import MyFarm.Base.Item;

import java.util.ArrayList;
import java.util.Iterator;

//仓库容器类 描述仓库容器 作为叶节点
public class BoxOfBarn extends EntryBarn {
    private String name;
    private ArrayList<Item> boxOfBarn = new ArrayList();

    public BoxOfBarn(String name) {
        this.name = name;
    }

    public BoxOfBarn add(Item item) {
        boxOfBarn.add(item);
        int newValue = this.getValue() + item.getValue();
        this.setValue(newValue);
        return this;
    }

    public String getName() {
        return this.name;
    }

    public void printlist(String p) {
        System.out.println(p + "|" + this);
        Iterator iter = boxOfBarn.iterator();
        while (iter.hasNext()) {
            EntryBarn e = (EntryBarn) iter.next();
            e.printlist(p + "|" + name);
        }
    }

}
