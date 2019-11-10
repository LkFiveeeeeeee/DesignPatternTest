import MyFarm.Building.*;
import MyFarm.Facade;
import MyFarm.menu.AnimalMenu;
import MyFarm.menu.PlantMenu;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void FacadeTestCaseOne(){
        PlantMenu plantMenu = new PlantMenu();
        AnimalMenu animalMenu = new AnimalMenu();
        Facade facade = new Facade(plantMenu,animalMenu);
        facade.newPig("pig_1");
        facade.newPig("pig_1");
        facade.plantCrop("crop_2");
    }
}
