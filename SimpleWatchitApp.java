/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SimpleWatchitApp extends JFrame {

    private     JPanel mainPanel;
    private     JLabel titleLabel;
    private     JTextField searchField;
    private     JButton searchButton;
    private     JScrollPane scrollPane;
    private     JPanel moviePanel;

    public void SimpleWatchitApp() {
       
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main Panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        setContentPane(mainPanel);

        // Title Label
        titleLabel = new JLabel("Welcome to Simple Watch it!", SwingConstants.CENTER);
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Search Panel
        JPanel searchPanel = new JPanel();
        searchPanel.add(new JLabel("Search: "));
        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        mainPanel.add(searchPanel, BorderLayout.SOUTH);

        // Movie Panel
        moviePanel = new JPanel();
        moviePanel.setLayout(new GridLayout(0, 3)); // Grid for displaying movies
        scrollPane = new JScrollPane(moviePanel);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Sample Movie Data (replace with actual data fetching)
        ArrayList<String> movies = new ArrayList<>();
        movies.add("The Shawshank Redemption");
        movies.add("The Godfather");
        movies.add ("The Dark Knight");
        movies.add( "The Lord of the Rings: The Return of the King");
        movies.add( "Pulp Fiction");
        movies.add( "Forrest Gump");
        movies.add( "Fight Club"); 
        movies.add( "Inception");
        movies.add( "Interstellar");
        movies.add( "The Matrix");
        movies.add( "The Lord of the Rings: The Fellowship of the Ring");
        movies.add( "Whiplash");
        movies.add( "Spirited Away");
        movies.add( "The Princess Bride");
        movies.add( "Parasite");
        addMovieCards(movies);

        setVisible(true);
    }

    private void addMovieCards(ArrayList<String> movies) {
    for (String movieTitle : movies) {
        JPanel movieCard = new JPanel();
        movieCard.setLayout(new BorderLayout());
        movieCard.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // 1. Create a JLabel for the movie title
        JLabel titleLabel = new JLabel(movieTitle, SwingConstants.CENTER);

        // 2. (Optional) Load the image (replace with your actual path)
        ImageIcon movieImage = null;
        try {
            movieImage = new ImageIcon(getClass().getResource("download.png.jpg"));
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
            // Optional: Add a placeholder image or handle the missing image gracefully
        }

        // 3. Create a container for the image (optional)
        JPanel imagePanel = null;
        if (movieImage != null) {
            imagePanel = new JPanel();
            imagePanel.add(new JLabel(movieImage));  // Add the image to the panel
        }

        // 4. Add title and image (or image panel) to the movie card
        movieCard.add(titleLabel, BorderLayout.CENTER);
        if (imagePanel != null) {
            movieCard.add(imagePanel, BorderLayout.WEST); // Adjust position as needed
        }

        moviePanel.add(movieCard);
    }
}

           
        }