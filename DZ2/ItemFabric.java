package DZ2;

public abstract class ItemFabric {
    public abstract IGameItem createGameItem();

    public void openReward() {
        IGameItem gameItem = createGameItem();
        gameItem.open();
    }
}
