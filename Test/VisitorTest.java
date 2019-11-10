package MyFarm;

import MyFarm.Building.*;
import MyFarm.Facade;
import MyFarm.friends.Friends;
import MyFarm.friends.MyAccept;
import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;
import MyFarm.visitor.MyVisitor;
import MyFarm.visitor.NumVisitor;
import MyFarm.visitor.PriceVisitor;
import org.junit.Test;

public class VisitorTest {
    @Test
    public void VTest(){
        MyVisitor myVisitor = new NumVisitor();
        MyVisitor my2Visitor = new PriceVisitor();
        MyAccept persons = new Friends();
        persons.accept(myVisitor);
        persons.accept(my2Visitor);
    }

}