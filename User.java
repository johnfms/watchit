/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

import java.util.ArrayList;
import java.util.HashMap;



/**
 *
 * @author Accounting
 */
public class User {

    // Class variable to keep track of user count
    private int ID;
    private  String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Subscription subscription;
    private ArrayList<String> addToListMovies = new ArrayList<>();
    private ArrayList<String> userWatchRecord= new ArrayList<>();

    public User() {
    }
   
   //constractor

public User(String username, String password) {
    this.username = username;
    this.password = password;
    this.credentials.put(username, password);
    User.users.put(username, this);
    this.ID = ID;
}
 private static HashMap<String, String> credentials = new HashMap<>();

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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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

    public ArrayList<String> getAddToListMovies() {
        return addToListMovies;
        
    }

    public Subscription getSubscription() {
       
        return subscription;
           
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public ArrayList<String> getUserWatchRecord() {
        return userWatchRecord;
    }

    public void setUserWatchRecord(ArrayList<String> userWatchRecord) {
        this.userWatchRecord = userWatchRecord;
    }
    
  //method to add a movie to  watched list 
   public void addToWatched(String movieTitle) {
  if (movieTitle != null) {
    if (!isWatchlistFull()) {
      this.userWatchRecord.add(movieTitle);
     
    } else {
      System.out.println("Oops! Your watchlist has reached the limit for your current subscription.");
      System.out.println("Consider upgrading to a plan with a higher watchlist limit.");
    }
  } else {
    System.out.println("Invalid movie title. Please try again.");
  }
}
 //method to check if watched list is in limit
public boolean isWatchlistFull() {
  if (subscription == null) {
    return false; // Handle case where subscription is not set
  }
  return userWatchRecord.size() >= subscription.getWatchingLimit();
}

// add and delete to fovourite
    public void addToFavourite(String movieTitle) {
       if (movieTitle != null) {
       this.addToListMovies.add(movieTitle);}
    }
    public void removeFromFavourite(String movieTitle) {
  if (movieTitle != null && this.addToListMovies.contains(movieTitle)) {
    this.addToListMovies.remove(movieTitle);
  }
}

   @Override
    public  String toString() {
        return "ID=" + ID +"\n"+ " username=" + username +"\n"+ " password=" + password +"\n"+ " firstName=" + firstName +"\n"+ " lastName=" + lastName +"\n"+ " email=" + email  +"\n"+ "subscription\""+subscription.toString()+"\""+"\n"+" addToListMovies=" + this.getAddToListMovies() +"\n"+ " userWatchRecord=" + userWatchRecord +"\n"+ '}';
    }
    
    private static HashMap<String, User> users = new HashMap<>();

    //method to return this user
public static User getUserbyusername(String username) {
    User U = null;
  for (User user : users.values()) {
    if (user.getUsername().equals(username)) {
     U = user;
    }
  }
  return U; // User not found
}


    //method to open user account if the user name and password is correct
    
    public static String openAcc(String n, String p) {
    if (isValidUser(n, p)) {
      return "Account already exists.\n User Info:"+ getUserbyusername(n).toString();
    } else {
      
      return "either username or password are wrong";
    }
  }
}