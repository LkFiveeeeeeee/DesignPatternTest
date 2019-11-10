/**
 * 表示农场所有的养动物、种植的空间
 * 空间需要靠 clone 来复制，实现原型模式？
 */
package MyFarm.farmland;

import MyFarm.creature.Creature;

import java.io.Serializable;

public abstract class BaseLand implements Serializable {
    //内部状态
    public String fieldName;
    //外部状态
    public float attribute;
    protected Creature creature;//作物

    public BaseLand() {

    }

    //要求享元角色必须接受外部状态
    public BaseLand(float attribute) {
        this.attribute = attribute;
    }

    public void plant(Creature _creature) {
        this.creature = _creature;

    }

    //定义业务操作
    public abstract void operate(String att);

    //显示该土地的作物
    public abstract void showCrop();

    // 通过 clone 来复制对象
    protected abstract BaseLand clone();
}
