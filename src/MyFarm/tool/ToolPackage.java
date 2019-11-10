package MyFarm.tool;

import java.util.ArrayList;

public class ToolPackage {
    public ArrayList<Tool> my_package;

    public ToolPackage() {
        my_package = new ArrayList<Tool>();
    }

    /**
     * 向工具包中加入工具
     *
     * @param tool 工具
     */
    public void addTool(Tool tool) {
        this.my_package.add(tool);
    }
}