package MyFarm.Responsibility;

import MyFarm.Farm;

public class CropHandler extends Handler {
    //Override
    public void handleRequest() {
        Farm farm = Farm.getInstance();
        if (farm.plantMenu.size() > 0) {
            System.out.println("用户作物不足");
            return;
        }

        if (getNextHandler() != null) {   //若后续处理器非空
            getNextHandler().handleRequest();   //处理下一处理器
        }
    }

}
