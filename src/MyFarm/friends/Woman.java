package MyFarm.friends;

import MyFarm.visitor.MyVisitor;

public class Woman implements MyAccept {
    public String name;
    public int age;

    //构造函数
    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void accept(MyVisitor myVisitor) {
        myVisitor.visit(this);
    }
}
