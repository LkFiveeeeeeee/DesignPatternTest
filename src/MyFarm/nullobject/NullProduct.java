package MyFarm.nullobject;

public class NullProduct extends AbstractProduct {
    //创建扩展上述抽象类的实体类，当搜索的动物不存在时使用该类反馈信息
    @Override
    public String getName() {
        return "This Product Not Exist!";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
