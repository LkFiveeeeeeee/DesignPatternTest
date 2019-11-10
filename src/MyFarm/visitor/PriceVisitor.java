package MyFarm.visitor;

import MyFarm.friends.Friends;
import MyFarm.friends.Man;
import MyFarm.friends.Woman;

public class PriceVisitor implements MyVisitor {


    @Override
    public void visit(Friends friends) {
        System.out.println("显示完毕");
    }

    @Override
    public void visit(Man man) {
        System.out.println("男性好友" + man.name + "的年龄为" + man.age + "岁");
    }

    @Override
    public void visit(Woman woman) {
        System.out.println("女性好友" + woman.name + "的年龄为" + woman.age + "岁");
    }
}
