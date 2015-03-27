package catalyst.catalyst.models;

/**
 * Created by Brent Satterwhite on 3/27/2015.
 */
public abstract class User {

    private String username;
    private int password;

    public User(String username, int password) {
        this.username = username;
        this.password = password;
    }

}
