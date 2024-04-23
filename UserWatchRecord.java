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

    public UserWatchRecord(int userID, Movie movie) {
        this.userID = userID;
        this.movie = movie;
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
