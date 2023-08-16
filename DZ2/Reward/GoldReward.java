package DZ2.Reward;

import DZ2.IGameItem;

public class GoldReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Золото");
    }

}
