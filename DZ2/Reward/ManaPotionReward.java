package DZ2.Reward;

import DZ2.IGameItem;

public class ManaPotionReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Зелье маны");
    }
}
