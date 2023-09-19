package DZ12;

public class User {
    private String fio;
    private String login;
    private String hashPass;
    private String email;

    public User(String fio, String login, String hashPass, String email) {
        this.fio = fio;
        this.login = login;
        this.hashPass = hashPass;
        this.email = email;
    }

    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHashPass() {
        return this.hashPass;
    }

    public void setHashPass(String hashPass) {
        this.hashPass = hashPass;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
