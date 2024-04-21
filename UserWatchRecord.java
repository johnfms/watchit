/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

import java.time.LocalDate;

/**
 *
 * @author Accounting
 */
public class UserWatchRecord {
    private int userID;
    private Movie movie;
    private LocalDate dateOfWatching;
    private int rating;

    public UserWatchRecord(int userID) {
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDate getDateOfWatching() {
        return dateOfWatching;
    }

    public void setDateOfWatching(LocalDate dateOfWatching) {
        this.dateOfWatching = dateOfWatching;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
}
