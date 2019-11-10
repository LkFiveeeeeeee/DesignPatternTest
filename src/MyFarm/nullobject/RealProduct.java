package MyFarm.nullobject;

public class RealProduct extends AbstractProduct {
    ////创建扩展上述抽象类的实体类，当搜索的动物存在时使用该类获取动物名称
    public RealProduct(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}