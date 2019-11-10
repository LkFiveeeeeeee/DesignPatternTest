package MyFarm;

import MyFarm.Barn.BoxOfBarn;
import MyFarm.Barn.ItemOfBarn;
import MyFarm.Building.*;
import MyFarm.Responsibility.CropHandler;
import MyFarm.Responsibility.MoneyHandler;
import MyFarm.animalState.Adapter;
import MyFarm.animalState.ConcreateDuck;
import MyFarm.animals.Dog;
import MyFarm.animals.Duck;
import MyFarm.animals.Pig;
import MyFarm.factories.BaseFactory;
import MyFarm.factories.LandFactory;
import MyFarm.factories.ToolFactory;
import MyFarm.farmland.BaseLand;
import MyFarm.farmland.BuildingLand;
import MyFarm.friends.Friends;
import MyFarm.friends.MyAccept;
import MyFarm.iterator.IteratorPatternDemo;
import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;
import MyFarm.nullobject.NullPatternDemo;
import MyFarm.owner.Owner;
import MyFarm.shopping.Customer;
import MyFarm.shopping.Proxy;
import MyFarm.tool.PackageBuilder;
import MyFarm.tool.Tool;
import MyFarm.tool.ToolPackage;
import MyFarm.visitor.MyVisitor;
import MyFarm.visitor.NumVisitor;
import MyFarm.visitor.PriceVisitor;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Time time = new Time();
        double state = Owner.money;
        Thread th = new Thread(time);
        th.start();
        // 初始化
        Farm farm = Farm.getInstance();
        AnimalMenu animalMenu = new AnimalMenu();
        PlantMenu plantMenu = new PlantMenu();

        // 测试原型模式

        System.out.println();
        System.out.println("=====现在开始测试原型模式:====：");


        Pig pig = new Pig();

        Dog dog = new Dog();
        dog.setName("原型dog");
        Dog dog1 = (Dog) dog.clone();
        System.out.println("创建的原型dog名字：" + dog.getName());
        System.out.println("克隆下来的dog名字：" + dog1.getName());


        //测试迭代器模式
        System.out.println();
        System.out.println("=====现在开始测试迭代器模式：=====");
        IteratorPatternDemo.PrintProducts();
        //测试空对象模式
        System.out.println();
        System.out.println("=====现在开始测试空对象模式：=====");
        NullPatternDemo.FindProducts(args);

        // 测试抽象工厂模式和享元模式
        System.out.println();
        System.out.println("=====现在开始测试抽象工厂模式=====");
        BaseFactory land_factory = Farm.getInstance().land_factory;
        BaseFactory tool_factory = Farm.getInstance().tool_factory;

        System.out.println("=====现在开始测试工厂模式=====");
        System.out.println("从Factory获取土地");
        BaseLand building_land = land_factory.getLand("BuildingLand");
        BaseLand farmLand = land_factory.getLand("FarmLand");

        System.out.println("从Factory获取工具");
        Tool hoe = tool_factory.getTool("Hoe");
        Tool big_bowl = tool_factory.getTool("BigBowl");
        Tool small_bowl = tool_factory.getTool("SmallBowl");

        //测试中介者模式
        System.out.println();
        System.out.println("=====现在开始测试中介者模式=====");
        Mediator mediator = new Mediator(animalMenu);
        pig.showHunger();
        Owner.getInstance().feedAll();

        //测试外观模式
        System.out.println();
        System.out.println("=====现在开始测试外观模式=====");
        Facade facade = new Facade(plantMenu, animalMenu);
        facade.newPig("Pig3");
        facade.plantCrop("Crop3");

        // 测试建造者模式
        System.out.println();
        System.out.println("=====现在开始测试建造者模式=====");
        ToolPackage tool_package = new ToolPackage();
        PackageBuilder packageBuilder = new PackageBuilder();
        packageBuilder.buildPackage(tool_package, (ToolFactory) tool_factory);

        //测试享元模式
        System.out.println();
        System.out.println("=====现在开始测试享元模式=====");
        tool_package.addTool(hoe);
        tool_package.addTool(big_bowl);
        tool_package.addTool(small_bowl);
        tool_package.addTool(tool_factory.getTool("Hoe"));

        System.out.println();
        BaseLand landx = LandFactory.getFlyweight("黄土地");
        BaseLand landy = LandFactory.getFlyweight("黑土地");
        BaseLand landz = LandFactory.getFlyweight("黄土地");
        System.out.println("已创建三块土地");
        //测试桥接模式
        System.out.println();
        System.out.println("=====现在开始测试桥接模式=====");
        BaseLand land;
        land = new BuildingLand();
        land.plant(new Dog());
        land.showCrop();

        //测试责任链模式
        System.out.println();
        System.out.println("=====现在开始测试责任链模式=====");
        MyFarm.Responsibility.Handler h1 = new MoneyHandler();
        MyFarm.Responsibility.Handler h2 = new CropHandler();
        h1.setNextHandler(h2);   //h1的下一个处理器是h2
        h1.handleRequest();//进行处理操作

        System.out.println("=====现在开始测试适配器模式=====");
        Duck duck = new ConcreateDuck();
        duck.attribute();
        Duck duckPet = new Adapter();
        duckPet.attribute();

        //测试装饰器模式
        System.out.println();
        System.out.println("=====现在开始测试装饰器模式=====");
        Facility f0 = new House("test0");
        f0 = new Canopy(f0);
        f0.getDescription();
        System.out.println();
        Facility f1 = new Garden("test1");
        f1 = new RedFlower(f1);
        f1 = new YellowFlower(f1);
        f1.getDescription();
        System.out.println();

        //测试组合模式
        System.out.println();
        System.out.println("=====现在开始测试组合模式=====");
        BoxOfBarn largeBarn = new BoxOfBarn("largebarn");
        BoxOfBarn mediumBarn = new BoxOfBarn("mediumbarn");
        BoxOfBarn smallBarn = new BoxOfBarn("smallbarn");
        largeBarn.add(mediumBarn);
        mediumBarn.add(smallBarn);
        ItemOfBarn as = new ItemOfBarn("Pig", 100);
        smallBarn.add(as);
        ItemOfBarn bs = new ItemOfBarn("Dog", 6324);
        smallBarn.add(bs);
        largeBarn.printlist("");


        System.out.println("=====现在开始测试代理模式====");
        //测试代理模式
        Scanner sc = new Scanner(System.in);
        System.out.println("询问顾客需要什么商品");
        String category = sc.nextLine();
        Customer lalala = new Customer("赵四");

        Proxy daili = new Proxy(lalala);
        daili.OutGood(category);

        System.out.println("=====现在开始测试访问者模式模式====");
        //测试访问者模式
        MyVisitor myVisitor = new NumVisitor();
        MyVisitor my2Visitor = new PriceVisitor();
        MyAccept persons = new Friends();
        persons.accept(myVisitor);
        persons.accept(my2Visitor);


        //测试备忘录模式

        System.out.println("=====现在开始测试备忘录模式和命令模式====");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("现在拥有金币" + Owner.money);
        System.out.println("复原");
        Owner.money = state;
        System.out.println("复原拥有金币" + Owner.money);


        System.out.println();

        System.out.println("之前的作物为");
        plantMenu.displayInfo();
        System.out.println("复原");
        plantMenu.memo();
        System.out.println("复原后的作物为");
        plantMenu.displayInfo();


    }


    static class Time implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    Owner.money++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }


}
