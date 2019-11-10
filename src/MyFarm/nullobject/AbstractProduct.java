package MyFarm.nullobject;

public abstract class AbstractProduct {
    //创建一个抽象类
    protected String name;//动物名称

    public abstract boolean isNil();//是否不存在

    public abstract String getName();//获取名称
}