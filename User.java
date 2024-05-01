/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

import java.util.ArrayList;
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
    private List<Movie> addedToListMovies = new ArrayList<>();
    private List<Movie> userWatchRecord= new ArrayList<>();
   
    private static int userCount = 0;  // Class variable to keep track of user count

public User(String username, String password) {
    this.username = username;
    this.password = password;
    this.credentials.put(username, password);
    this.ID = userCount++;
}

   static HashMap<String, String> credentials = new HashMap<>();

  public static boolean isValidUser(String username, String password) {
    return credentials.containsKey(username) && credentials.get(username).equals(password);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Movie> getAddedToListMovies() {
        return addedToListMovies;
    }

    public void setAddedToListMovies(List<Movie> addedToListMovies) {
        this.addedToListMovies = addedToListMovies;
        
    }

    public List<Movie> getUserWatchRecord() {
        return userWatchRecord;
    }

    public void setUserWatchRecord(List<Movie> userWatchRecord) {
        this.userWatchRecord = userWatchRecord;
    }
    

   public void addToWatchList(Movie movie) {
    // Check for null movie (optional)
    if (movie != null) {
      addedToListMovies.add(movie);
    }
  }

    public void addToWatched(Movie movieTitle) {
       if (movieTitle != null) {
       this.userWatchRecord.add(movieTitle);}
    }

    @Override
    public  String toString() {
        return "ID=" + ID +"\n"+ " username=" + username +"\n"+ " password=" + password +"\n"+ " firstName=" + firstName +"\n"+ " lastName=" + lastName +"\n"+ " email=" + email  +"\n"+ "subscription"+subscription+"\n"+" addedToListMovies=" + addedToListMovies +"\n"+ " userWatchRecord=" + userWatchRecord +"\n"+ '}';
    }
    public static String openAcc(String n, String p) {
    if (isValidUser(n, p)) {
      return "Account already exists. User Info:"+ new User(n, p).toString();
    } else {
      
      return "either username or password are wrong";
    }
  }
}
