package MyFarm.iterator;

import MyFarm.menu.BaseMenu;

public class NameRepository implements Container {
    //创建实现了Container接口的实体类，该类有实现了Iterator接口的内部类
    BaseMenu basemenu;//获取动物列表
    String[] product_names = getString();//存放当前所有动物名称的数组

    public String[] getString() {
        int size = BaseMenu.creatures.size();//获取动物数量
        String[] names = new String[10];
        for (int i = 0; i < size; i++) {
            //通过for循环将动物名字置入String[]数组中
            names[i] = BaseMenu.creatures.get(i).name;
        }
        return names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            //当未遍历到数组末尾时继续往后遍历
            return index < product_names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return product_names[index++];
            }
            return null;
        }
    }
}