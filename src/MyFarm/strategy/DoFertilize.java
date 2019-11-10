package MyFarm.strategy;

import java.util.Scanner;

public class DoFertilize {
    public static void main(String[] args) {
        Fertilize fertilize;
        while (true) {
            Scanner sc = new Scanner(System.in);
            String plant = sc.nextLine();
            switch (plant) {
                case "钾肥":
                    fertilize = new Fertilize(new Plant3());
                    fertilize.operate();
                    System.out.println("\n");
                    break;
                case "磷肥":
                    fertilize = new Fertilize(new Plant2());
                    fertilize.operate();
                    System.out.println("\n");
                    break;
                case "氮肥":
                    fertilize = new Fertilize(new Plant1());
                    fertilize.operate();
                    System.out.println("\n");
                    break;
            }
        }
    }
}
