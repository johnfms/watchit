/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

/**
 *
 * @author john
 */
//======== MOVIE CLASS =========
public class Movie {
//--variables--
  //static movies number
  static int movienum;
  private long id;
  private String title;
  private String releaseDate; //using util.Date
  private int runningTime;
  // using util.list
  private List<String> cast;
  private List<String> genres;
  private List<String> languages;
  private String director;
  private double imdbScore;
  private String country;
  private long budget;
  private long revenue;
  private String poster;
// constructors
    //default constructor
        Movie(){movienum++;}
    //main constructor
        Movie(long id, String title, String releaseDate, int runningTime, List<String> cast, List<String> genres, List<String> languages, String director, double imdbScore, String country, long budget, long revenue, String poster) {
            this.id = id;
            this.title = title;
            this.releaseDate = releaseDate;
            this.runningTime = runningTime;
            this.cast = cast;
            this.genres = genres;
            this.languages = languages;
            this.director = director;
            this.imdbScore = imdbScore;
            this.country = country;
            this.budget = budget;
            this.revenue = revenue;
            this.poster = poster;
            movienum++;
        }
    //without poster

         Movie(long id, String title, String releaseDate, int runningTime, List<String> cast, List<String> genres, List<String> languages, String director, double imdbScore, String country, long budget, long revenue) {
            this.id = id;
            this.title = title;
            this.releaseDate = releaseDate;
            this.runningTime = runningTime;
            this.cast = cast;
            this.genres = genres;
            this.languages = languages;
            this.director = director;
            this.imdbScore = imdbScore;
            this.country = country;
            this.budget = budget;
            this.revenue = revenue;
    }
        
    //functions
        //info
        public String info() {
            return "Movie{" +"\n"+ "id=" + id +"\n"+ "title=" + title + "\n"+" releaseDate= (" + releaseDate + ")\n"+"  runningTime=" + runningTime +"\n"+ " cast=" + cast +"\n"+ " genres=" + genres +"\n"+ " languages=" + languages +"\n"+ "director=" + director +"\n"+ " imdbScore=" + imdbScore + "\n"+"country=" + country +"\n"+ " budget=" + budget + "\n"+" revenue=" + revenue +"\n"+ " poster=" + poster + '}';
        }
        //unmber of movie
        public int number(){
            return movienum; 
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public static int getMovienum() {
        return movienum;
    }

    public static void setMovienum(int movienum) {
        Movie.movienum = movienum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(double imdbScore) {
        this.imdbScore = imdbScore;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
        


}