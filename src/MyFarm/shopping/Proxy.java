package MyFarm.shopping;

import MyFarm.owner.Owner;

public class Proxy implements ShoppingUtils {
    private Owner buyer;

    public Proxy(Customer vis) {
        buyer = new Owner(vis);

    }


    @Override
    public void OutGood(String category) {

        buyer.OutGood(category);

    }
}
