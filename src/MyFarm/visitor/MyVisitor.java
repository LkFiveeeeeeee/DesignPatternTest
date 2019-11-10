package MyFarm.visitor;

import MyFarm.friends.Friends;
import MyFarm.friends.Man;
import MyFarm.friends.Woman;

public interface MyVisitor {
    void visit(Friends friends);

    void visit(Man man);

    void visit(Woman woman);
}
