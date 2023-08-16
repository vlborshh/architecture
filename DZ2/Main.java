package DZ2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import DZ2.Generator.FoodGenerator;
import DZ2.Generator.GemGenerator;
import DZ2.Generator.GoldGenerator;
import DZ2.Generator.HealthPotionGenerator;
import DZ2.Generator.ManaPotionGenerator;

public class Main {
    public static void main(String[] args) {
        Random rand = ThreadLocalRandom.current();
        List<ItemFabric> fabricsList = new ArrayList<>();

        fabricsList.add(new GoldGenerator());
        fabricsList.add(new GemGenerator());
        fabricsList.add(new FoodGenerator());
        fabricsList.add(new ManaPotionGenerator());
        fabricsList.add(new HealthPotionGenerator());

        int sizeList = fabricsList.size();
        int index = rand.nextInt(sizeList);
        ItemFabric fabric = fabricsList.get(index);
        fabric.openReward();

    }

}
