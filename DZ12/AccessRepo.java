package DZ12;

public class AccessRepo {
    private User user;
    private Token token;

    public AccessRepo(User user, Token token) {
        this.user = user;
        this.token = token;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Token getToken() {
        return this.token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

}
