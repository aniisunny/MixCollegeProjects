import java.util.HashMap;
import java.util.Map;

public class UserAuthenticator implements Authenticator {

    private Map<String, User> users;

    public UserAuthenticator() {

        this.users = new HashMap<String, User>();
    }

    @Override
    public User createUser(String username, String password) {

        User user = new User(username, password);

        users.put(username, user);
        return user;
    }

    @Override
    public User loginUser(String username, String password) {

        User user = users.get(username);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
}