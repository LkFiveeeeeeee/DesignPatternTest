package MyFarm.nullobject;

import MyFarm.menu.BaseMenu;

public class ProductFactory {
    BaseMenu basemenu;//获取动物列表
    String[] names = getString();

    public String[] getString() {
        int size = BaseMenu.creatures.size();
        String[] name = new String[10];
        for (int i = 0; i < size; i++) {
            //使用for循环将动物列表中的动物名称置入String[]数组中
            name[i] = BaseMenu.creatures.get(i).name;
        }
        return name;
    }

    public AbstractProduct getProduct(String name) {
        for (int i = 0; i < names.length; i++) {
            //逐个检测要搜索的动物名称是否存在于name数组中
            if (names[i] != null && names[i].equalsIgnoreCase(name)) {
                //存在，则使用RealProduct类
                return new RealProduct(name);
            }
        }
        //不存在则使用NullProduct类
        return new NullProduct();
    }
}