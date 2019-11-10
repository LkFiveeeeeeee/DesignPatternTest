package MyFarm.Responsibility;

import MyFarm.owner.Owner;

public class MoneyHandler extends Handler {
    //Override
    public void handleRequest() {
        Owner owner = Owner.getInstance();
        if (owner.getMoney() < 10) {
            System.out.println("用户金钱不足");
            return;
        }

        if (getNextHandler() != null) {   //若后续处理器非空
            getNextHandler().handleRequest();   //处理下一处理器
        }
    }

}
