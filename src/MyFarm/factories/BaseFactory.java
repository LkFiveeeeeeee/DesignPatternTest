package MyFarm.factories;

import MyFarm.farmland.BaseLand;
import MyFarm.tool.Tool;

import java.io.Serializable;

public abstract class BaseFactory implements Serializable {
    public abstract BaseLand getLand(String land_type);

    public abstract Tool getTool(String tool_type);

}
