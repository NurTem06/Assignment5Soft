import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private List<User> users = new ArrayList<>();

    public UserDatabase() {
        users.add(new User("Nurasyl", "nurasyl", "1234"));
        users.add(new User("Amina", "amina", "0000"));
        users.add(new User("Ali", "ali", "9999"));
    }

    public User login(String login, String password) {
        for (User u : users) {
            if (u.login.equals(login) && u.password.equals(password)) {
                return u;
            }
        }
        return null;
    }
}
