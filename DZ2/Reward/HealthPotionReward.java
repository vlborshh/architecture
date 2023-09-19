package DZ2.Reward;

import DZ2.IGameItem;

public class HealthPotionReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Зелье здоровья");
    }
}
