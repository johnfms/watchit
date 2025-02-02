/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

import java.util.ArrayList;
import java.util.List;

public class Cast {


  private String firstName;
  private String lastName;
  private int age;
  private String gender;
  private List<Integer> movieIds;
  private String nationality;

    public Cast() {
    }
  public Cast( String firstName, String lastName, int age, String gender, String nationality) {
  
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
    this.movieIds = new ArrayList<>();
    this.nationality = nationality;
  }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public List<Integer> getMovieIds() {
        return movieIds;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Cast{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", movieIds=" + movieIds + ", nationality=" + nationality + '}';
    }
//method to add actor movie id to list
  public void addMovie(int movieId) {
    this.movieIds.add(movieId);
  }

}