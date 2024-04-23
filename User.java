package watchit;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Accounting
 */
public class User {
    private int ID;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Subscription subscription;
    private List<Movie> addedToListMovies;
    private List<UserWatchRecord> userWatchRecord;
    private ArrayList<String> userIds;
    private ArrayList<String> passwords;

    
    
//constractors

    public User() {
        this.userIds = new ArrayList<>();
        this.passwords = new ArrayList<>();
    }
    
//method to add new user accont        
    public void addUser(String userId, String password) {
        this.userIds.add(userId);
        this.passwords.add(password);
    }
 //check methods
    public boolean isValidUser(String userId, String password) {
        int index = this.userIds.indexOf(userId);
        if (index == -1) {
            return false; // User ID not found
        }
        return this.passwords.get(index).equals(password);
    }
     //  getters and setters for all fields 


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   //method to check if password is correct
   

  
    public void addToWatchList(Movie movieTitle) {
        addedToListMovies.add(movieTitle);
    }

    public void addToWatched(UserWatchRecord movieTitle) {
       userWatchRecord.add(movieTitle);
    }
    
}



