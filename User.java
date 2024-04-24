/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

import java.util.HashMap;
import java.util.List;


/**
 *
 * @author Accounting
 */
public class User {
    private int ID;
    static private int usernum=1;
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
        ID=usernum;
        usernum++;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public void addToWatchList(Movie movieTitle) {
        addedToListMovies.add(movieTitle);
    }

    public void addToWatched(UserWatchRecord movieTitle) {
        userWatchRecord.add(movieTitle);
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID +"\n"+ " username=" + username +"\n"+ " password=" + password +"\n"+ " firstName=" + firstName +"\n"+ " lastName=" + lastName +"\n"+ " email=" + email  +"\n"+ "subscription"+subscription+"\n"+" addedToListMovies=" + addedToListMovies +"\n"+ " userWatchRecord=" + userWatchRecord +"\n"+ " credentials=" + credentials + '}';
    }
    public String openAcc(String n,String p){
    if(isValidUser(n, p) ==true){
      return toString();
    }
    else{
       String x="either username or password are wrong please try again";
       return x;
    }
    }
}
