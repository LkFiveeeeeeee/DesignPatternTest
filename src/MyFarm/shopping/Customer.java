package MyFarm.shopping;

public class Customer {
    public String wantGrocery;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWantGrocery() {
        return wantGrocery;
    }

    public void setWantGrocery(String wantGrocery) {
        this.wantGrocery = wantGrocery;
    }
}
