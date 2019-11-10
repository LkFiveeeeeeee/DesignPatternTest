package MyFarm;

import MyFarm.Barn.BoxOfBarn;
import MyFarm.Barn.ItemOfBarn;

public class CompositeTest {
    public static void main(String[] args) {
        BoxOfBarn boxOfBarn1=new BoxOfBarn("1");
        BoxOfBarn boxOfBarn2=new BoxOfBarn("2");
        BoxOfBarn boxOfBarn3=new BoxOfBarn("3");
        ItemOfBarn itemOfBarn=new ItemOfBarn("10",7);
        boxOfBarn1.add(boxOfBarn2);
        boxOfBarn2.add(itemOfBarn);
        boxOfBarn2.add(boxOfBarn3);
        boxOfBarn1.printlist("test");

    }
}
