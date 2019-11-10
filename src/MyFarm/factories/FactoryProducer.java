package MyFarm.factories;

public class FactoryProducer {
    public BaseFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Land")) {
            return new LandFactory();
        } else if (choice.equalsIgnoreCase("Tool")) {
            return new ToolFactory();
        }
        return null;
    }
}
