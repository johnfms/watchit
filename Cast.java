/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

import java.util.ArrayList;
import java.util.List;

public class Cast {

  private int id;
  private String firstName;
  private String lastName;
  private int age;
  private String gender;
  private List<Integer> movieIds;
  private String nationality;



  public Cast(int id, String firstName, String lastName, int age, String gender, String nationality) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
    this.movieIds = new ArrayList<>();
    this.nationality = nationality;
  }


  public void addMovie(int movieId) {
    this.movieIds.add(movieId);
  }

}