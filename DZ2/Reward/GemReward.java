package DZ2.Reward;

import DZ2.IGameItem;

public class GemReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Самоцвет");
    }
}
