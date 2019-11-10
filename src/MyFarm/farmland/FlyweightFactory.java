package MyFarm.farmland;

import java.util.HashMap;

public class FlyweightFactory {

    //定义一个池容器
    private static HashMap<String, Float> pool = new HashMap<>();

    //享元工厂
    public static BaseLand getFlyweight(String fieldName) {
        BaseLand flyweight = null;

        if (pool.containsKey(fieldName)) {    //池中有该对象
            // flyweight = pool.get(fieldName);
            System.out.print("已有 " + fieldName + " 直接从池中取---->");
            String st = pool.get(fieldName).toString();
            System.out.println(fieldName + "的属性值为" + st);
            //  flyweight.operate(st);
        } else {
            //根据外部状态创建享元对象
            float attribute = 0;
            //放入池中
            if (fieldName == "黄土地") {
                attribute = (float) 0.1;
            } else if (fieldName == "黑土地") {
                attribute = (float) 0.2;
            } else if (fieldName == "金土地") {
                attribute = (float) 0.3;
            }
            flyweight = new FarmLand(fieldName, attribute) {
                @Override
                public void showCrop() {

                }

                @Override
                public BaseLand clone() {
                    return null;
                }
            };
            pool.put(fieldName, attribute);
            System.out.print("创建 " + fieldName + " 并从池中取出---->");
            flyweight.operate(fieldName + "的属性值" + flyweight.attribute);
        }
        return flyweight;
    }
}