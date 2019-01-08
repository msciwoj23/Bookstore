package Model;

public class User {

    private boolean amITheAdmin;
    private String password = "mama";

    public User(boolean amITheAdmin) {
        this.amITheAdmin = amITheAdmin;
    }
}
