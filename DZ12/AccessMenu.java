package DZ12;

public class AccessMenu {
    private Token token;
    private User user;

    public AccessMenu(Token token, User user) {
        this.token = token;
        this.user = user;
    }

    public Token getToken() {
        return this.token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void removeToken() {
        // Удаление токена
    }

}
