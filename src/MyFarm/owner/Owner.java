package MyFarm.owner;

import MyFarm.Mediator;
import MyFarm.shopping.Customer;
import MyFarm.shopping.ShoppingUtils;

public class Owner implements People, ShoppingUtils {
    public static double money;
    private static Owner instance = new Owner();
    private Customer buyer;

    public Owner(Customer buyer) {
        this.buyer = buyer;
    }

    public Owner() {
        money = 1000;
    }

    /**
     * 返回主人的实例
     *
     * @return owner instance
     */
    public static Owner getInstance() {
        Owner temp = instance;
        if (temp == null) {
            synchronized (Owner.class) {
                temp = instance;
                if (temp == null) {
                    instance = new Owner();
                    temp = instance;
                }
            }
        }
        return temp;
    }

    public void setOwnerCustomerName(Customer vis) {
        this.buyer = vis;
    }

    /**
     * Get the money of the owner
     *
     * @return The money of the owner
     */
    public double getMoney() {
        return money;
    }

    /**
     * Plus or minus the money of the owner
     *
     * @param money the number of money
     */
    public void editMoney(double money) {
        Owner.money += money;
    }

    @Override
    public void OutGood(String category) {
        System.out.println("admin售出一只" + category + "给" + buyer.getName());
    }

    public void feedAll() {
        Mediator.feedAll();
    }


}
