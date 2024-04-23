package watchit;

import java.util.HashMap;
import java.util.List;


/**
 *
 * @author Accounting
 */
public class User {
    private int ID;
    private  String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Subscription subscription;
    private List<Movie> addedToListMovies;
    private List<UserWatchRecord> userWatchRecord;
    private final HashMap<String, String> credentials; // Username (key) - Password (value)

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.credentials = new HashMap<>();
        this.credentials.put(username, password); // Add initial credentials
    }

    public boolean isValidUser(String username, String password) {
        if (!this.credentials.containsKey(username)) {
            return false;
        }
        return this.credentials.get(username).equals(password);
    }

    // Getters and setters for remaining fields (ID, firstName, etc.)

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

    public void addToWatchList(Movie movieTitle) {
        addedToListMovies.add(movieTitle);
    }

    public void addToWatched(UserWatchRecord movieTitle) {
        userWatchRecord.add(movieTitle);
    }
}
