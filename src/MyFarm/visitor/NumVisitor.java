package MyFarm.visitor;

import MyFarm.friends.Friends;
import MyFarm.friends.Man;
import MyFarm.friends.Woman;

public class NumVisitor implements MyVisitor {

    @Override
    public void visit(Friends friends) {
        System.out.println("显示完毕");
    }

    @Override
    public void visit(Man man) {
        System.out.println("男性的名称为" + man.name);
    }

    @Override
    public void visit(Woman woman) {
        System.out.println("女性的名称为" + woman.name);
    }


}
