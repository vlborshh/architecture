package DZ2.Generator;

import DZ2.IGameItem;
import DZ2.ItemFabric;
import DZ2.Reward.GoldReward;

public class GoldGenerator extends ItemFabric {
    @Override
    public IGameItem createGameItem() {
        return new GoldReward();
    }
}
