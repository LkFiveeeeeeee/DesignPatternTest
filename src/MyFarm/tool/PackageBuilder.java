package MyFarm.tool;

import MyFarm.factories.ToolFactory;

public class PackageBuilder {

    public void buildPackage(ToolPackage tool_package, ToolFactory tool_factory) {
        tool_package.addTool(tool_factory.getTool("Hoe"));
        tool_package.addTool(tool_factory.getTool("BigBowl"));
        tool_package.addTool(tool_factory.getTool("SmallBowl"));
        System.out.println("A new toolpackage is created!");
    }

}

