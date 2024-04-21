/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Seline Ayman
 */
public class Diractor { 
    private String dFname;
    private String dLname;
    private int dAge;
    private String dGender;
    private List<Movie>movies;
    private String nationality;
    //default construcor
   public Diractor(){};


    public String getdFname() {
        return dFname;
    }

    public void setdFname(String dFname) {
        this.dFname = dFname;
    }

    public String getdLname() {
        return dLname;
    }

    public void setdLname(String dLname) {
        this.dLname = dLname;
    }

    public int getdAge() {
        return dAge;
    }

    public void setdAge(int dAge) {
        this.dAge = dAge;
    }

    public String getdGender() {
        return dGender;
    }

    public void setdGender(String dGender) {
        this.dGender = dGender;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public String getNationality() {
        return nationality;
    }

    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Diractor(String dFname, String dLname, int dAge, String dGender, List<Movie> movies, String nationality) {
        this.dFname = dFname;
        this.dLname = dLname;
        this.dAge = dAge;
        this.dGender = dGender;
        this.movies=new ArrayList<>();
        this.nationality = nationality;
    }
    /*public void addMovie(movies) {
    if (movies != null) {
      movies.add(movies);
    } else {
      System.out.println("Error: Cannot add null movie to director");
    }
  }

  // Update Movie (by index)
  public void updateMovie(int index, Movie movie) {
    if (movie != null && index >= 0 && index < movies.size()) {
      movies.set(index, movie);
    } else {
      System.out.println("Error: Invalid index or null movie provided");
    }
  }*/

  // Delete Movie (by index)
  public void deleteMovie(int index) {
    if (index >= 0 && index < movies.size()) {
      movies.remove(index);
    } else {
      System.out.println("Error: Invalid index provided");
    }
  }
    public void directorInfo(){
System.out.print("Director name :"+dFname+dLname+"\nAge:"+dAge+"\n Gender:"+dGender+"\n Nationality:"+nationality);
for(Movie a:movies){
System.out.println(a); }
   
    
}
}