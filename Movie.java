/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

import java.util.Date;
import java.util.List;

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
  private Date releaseDate; //using util.Date
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
        Movie(long id, String title, Date releaseDate, int runningTime, List<String> cast, List<String> genres, List<String> languages, String director, double imdbScore, String country, long budget, long revenue, String poster) {
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

         Movie(long id, String title, Date releaseDate, int runningTime, List<String> cast, List<String> genres, List<String> languages, String director, double imdbScore, String country, long budget, long revenue) {
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
            return "Movie{" + "id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", runningTime=" + runningTime + ", cast=" + cast + ", genres=" + genres + ", languages=" + languages + ", director=" + director + ", imdbScore=" + imdbScore + ", country=" + country + ", budget=" + budget + ", revenue=" + revenue + ", poster=" + poster + '}';
        }
        //unmber of movie
        public int number(){
            return movienum; 
        }
}