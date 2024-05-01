/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package watchit;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Accounting
 */
public class WatchIt {

    /**
     * @param args the command line arguments
     */
    
      
    public static void main(String[] args) {
        Scanner In=new Scanner(System.in);
        String uName=In.next() ,Pass=In.next();
        User u1 =new User("A","123");
         User u2 =new User("B","153");
        System.out.println(User.openAcc(uName, Pass));
        
        
        
    Movie[] movies = new Movie[15];
    

    // Movie 1 - The Shawshank Redemption
    movies[0] = new Movie(1, "The Shawshank Redemption", "1994, 1, 14", 142,
        Arrays.asList("Tim Robbins", "Morgan Freeman", "Bob Gunton"),
        Arrays.asList("Drama", "Crime"),
        Arrays.asList("English"), "Frank Darabont", 9.3, "United States", 2500000, 278000000, "https://imdb.com/title/tt0111161/mediaindex?ref_=tt_ov_vi&tv=on");

    // Movie 2 - The Godfather
    movies[1] = new Movie(2, "The Godfather","1972, 1, 14", 175,
        Arrays.asList("Marlon Brando", "Al Pacino", "James Caan"),
        Arrays.asList("Crime", "Drama", "Gangster"),
        Arrays.asList("English", "Italian"), "Francis Ford Coppola", 9.2, "United States", 6800000, 245000000, "https://imdb.com/title/tt0000001/mediaindex?ref_=tt_ov_vi&tv=on");

    // Movie 3 - The Dark Knight
    movies[2] = new Movie(3, "The Dark Knight", "2008, 1, 18", 152,
        Arrays.asList("Christian Bale", "Heath Ledger", "Aaron Eckhart"),
        Arrays.asList("Action", "Crime", "Thriller"),
        Arrays.asList("English"), "Christopher Nolan", 9.0, "United States", 185000000, 1000000000, "https://imdb.com/title/tt0468569/mediaindex?ref_=tt_ov_vi&tv=on");

    // Add more movies to fill the entire array
    movies[3] = new Movie(4, "The Lord of the Rings: The Return of the King", "2003, 11, 17", 201,
        Arrays.asList("Elijah Wood", "Ian McKellen", "Viggo Mortensen"),
        Arrays.asList("Fantasy", "Adventure", "Drama"),
        Arrays.asList("English"), "Peter Jackson", 9.2, "New Zealand", 94000000, 1141780837, "https://imdb.com/title/tt0166122/mediaindex?ref_=tt_ov_vi&tv=on");

    movies[4] = new Movie(5, "Pulp Fiction", "1994, 1, 14", 154,
        Arrays.asList("John Travolta", "Samuel L. Jackson", "Uma Thurman"),
        Arrays.asList("Crime", "Comedy", "Thriller"),
        Arrays.asList("English"), "Quentin Tarantino", 8.9, "United States", 8000000, 213928262, "https://imdb.com/title/tt0110912/mediaindex?ref_=tt_ov_vi&tv=on");

    movies[5] = new Movie(6, "Forrest Gump", "1994, 6, 6", 142,
        Arrays.asList("Tom Hanks", "Robin Wright", "Gary Sinise"),
        Arrays.asList("Drama", "Romance", "War"),
        Arrays.asList("English"), "Robert Zemeckis", 8.8, "United States", 54000000, 677948679, "https://imdb.com/title/tt0109830/mediaindex?ref_=tt_ov_vi&tv=on");
    movies[6] = new Movie(7, "Fight Club", "1999, 10, 15", 139,
        Arrays.asList("Brad Pitt", "Edward Norton", "Helena Bonham Carter"),
        Arrays.asList("Drama", "Thriller", "Cult"),
        Arrays.asList("English"), "David Fincher", 8.6, "United States", 63000000, 100853753, "https://imdb.com/title/tt0137500/mediaindex?ref_=tt_ov_vi&tv=on");

    // Movie 7 - Inception
    movies[7] = new Movie(8, "Inception", "2010, 6, 16", 148,
        Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page"),  // Elliot Page (formerly Ellen Page)
        Arrays.asList("Action", "Thriller", "Sci-Fi"),
        Arrays.asList("English"), "Christopher Nolan", 8.8, "United States", 160000000, 825532761, "https://imdb.com/title/tt1375862/mediaindex?ref_=tt_ov_vi&tv=on");
    movies[8] = new Movie(9, "Interstellar", "2014, 10, 26", 169,
        Arrays.asList("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"),
        Arrays.asList("Sci-Fi", "Drama", "Adventure"),
        Arrays.asList("English"), "Christopher Nolan", 8.6, "United States", 165000000, 773068203, "https://imdb.com/title/tt0816692/mediaindex?ref_=tt_ov_vi&tv=on");
    movies[9] = new Movie(10, "The Matrix", "1999, 3, 31", 136,
        Arrays.asList("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss"),
        Arrays.asList("Sci-Fi", "Action", "Thriller"),
        Arrays.asList("English"), "The Wachowskis", 8.7, "United States", 60000000, 465331517, "https://imdb.com/title/tt0133866/mediaindex?ref_=tt_ov_vi&tv=on");
    movies[10] = new Movie(11, "The Lord of the Rings: The Fellowship of the Ring", "2001, 12, 19", 178,
        Arrays.asList("Elijah Wood", "Ian McKellen", "Orlando Bloom"),
        Arrays.asList("Fantasy", "Adventure", "Drama"),
        Arrays.asList("English"), "Peter Jackson", 8.8, "New Zealand", 93000000, 887000000, "https://imdb.com/title/tt0120737/mediaindex?ref_=tt_ov_vi&tv=on");

    // Movie 12 - Whiplash
    movies[11] = new Movie(12, "Whiplash", "2014, 10, 10", 105,
        Arrays.asList("Miles Teller", "J.K. Simmons", "Melissa Benoist"),
        Arrays.asList("Drama", "Music"),
        Arrays.asList("English"), "Damien Chazelle", 8.3, "United States", 6500000, 49085764, "https://imdb.com/title/tt2588326/mediaindex?ref_=tt_ov_vi&tv=on");
       // Movie 13 - Spirited Away (change from The Shining)
    movies[12] = new Movie(13, "Spirited Away", "2001, 1, 20", 125,
        Arrays.asList("Rumi Hiiragi", "Yumi Tamai", "Mana Nakamura"),
        Arrays.asList("Animation", "Fantasy", "Adventure"),
        Arrays.asList("Japanese"), "Hayao Miyazaki", 8.9, "Japan", 19000000, 355499587, "https://imdb.com/title/tt0241441/mediaindex?ref_=tt_ov_vi&tv=on");

    // Movie 14 - The Princess Bride (change from Good Will Hunting)
    movies[13] = new Movie(14, "The Princess Bride", "1987, 1, 9", 98,
        Arrays.asList("Cary Elwes", "Robin Wright", "Mandy Patinkin"),
        Arrays.asList("Adventure", "Comedy", "Fantasy"),
        Arrays.asList("English"), "Rob Reiner", 8.1, "United States", 98700000, 197398063, "https://imdb.com/title/tt00937796/mediaindex?ref_=tt_ov_vi&tv=on");

    // Movie 15 - Parasite (new movie)
    movies[14] = new Movie(15, "Parasite","2019, 5, 30", 132,
        Arrays.asList("Song Kang-ho", "Lee Sun-kyun", "Cho Yeo-jeong"),
        Arrays.asList("Thriller", "Comedy", "Drama"),
        Arrays.asList("Korean"), "Bong Joon-ho", 8.6, "South Korea", 11400000, 258898815, "https://imdb.com/title/tt1186632/mediaindex?ref_=tt_ov_vi&tv=on"); 
       
    }

}
    

