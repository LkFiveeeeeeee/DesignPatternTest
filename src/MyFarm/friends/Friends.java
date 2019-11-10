package MyFarm.friends;

import MyFarm.visitor.MyVisitor;

public class Friends implements MyAccept {
    public int size;
    MyAccept[] myAccepts;

    //构造函数
    public Friends() {
        myAccepts = new MyAccept[]{
                new Man("张三", 23),
                new Woman("张丽", 27)
        };
    }

    //composite构造数组
    @Override
    public void accept(MyVisitor myVisitor) {
        for (int i = 0; i < myAccepts.length; i++) {
            myAccepts[i].accept(myVisitor);
        }
        myVisitor.visit(this);
    }
}
