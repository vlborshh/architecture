package DZ2.Generator;

import DZ2.IGameItem;
import DZ2.ItemFabric;
import DZ2.Reward.FoodReward;

public class FoodGenerator extends ItemFabric {
    @Override
    public IGameItem createGameItem() {
        return new FoodReward();
    }
}
