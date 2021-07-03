package core.data;

public class User {

    private String login;
    private String password;
    private Case cases;
    private int id;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Case getCases() {
        return cases;
    }

    public void setCases(Case cases) {
        this.cases = cases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
