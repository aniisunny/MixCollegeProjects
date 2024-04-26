public interface Authenticator {

    User createUser(String username, String password);
    User loginUser(String username, String password);
}