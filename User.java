/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private List<String> addedToListMovies;
    private List<String> userWatchRecord;
    
    
//constractors

    public User(int ID, String username, String password, String firstName, String lastName, String email) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    } 
    public User() {
       
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
   public boolean checkPassword(String enteredPassword) {
        return enteredPassword.equals(password);
    }

  
    public void addToWatchList(String movieTitle) {
        addedToListMovies.add(movieTitle);
    }

    public void addToWatched(String movieTitle) {
       userWatchRecord.add(movieTitle);
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", subscription=" + subscription + ", addedToListMovies=" + addedToListMovies + ", userWatchRecord=" + userWatchRecord + '}';
    }

    
}
