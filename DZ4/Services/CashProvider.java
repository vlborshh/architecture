package DZ4.Services;

public class CashProvider {
    private long card;
    private long hashCard;
    private boolean isAuthorization;

    public CashProvider(long card, long hashCard) {
        this.card = card;
        this.hashCard = hashCard;
        this.isAuthorization = false;
    }

    public long getCard() {
        return this.card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public long getHashCard() {
        return this.hashCard;
    }

    public void setHashCard(long hashCard) {
        this.hashCard = hashCard;
    }

    public boolean isIsAuthorization() {
        return this.isAuthorization;
    }

    public boolean getIsAuthorization() {
        return this.isAuthorization;
    }

    public void setIsAuthorization(boolean isAuthorization) {
        this.isAuthorization = isAuthorization;
    }

    public void buy(double price) {

        if (isAuthorization) {
            // реализация продажи
        } else {
            // реализация сообщения пользователю об возникшей ошибке ...
        }

    }

    public void authorization(Customer customer) {
        // если авторизация пройдена возвращаем true, иначе false
        setIsAuthorization(true);
    }
}
