import java.util.UUID;

public class User {

    private String userID;
    private String username;
    private String password;

    public User(String username, String password) {

        this.userID = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
    }

    public String getUserID() {

        return userID;
    }

    public String getUsername() {

        return username;
    }

    public String getPassword() {

        return password;
    }
}