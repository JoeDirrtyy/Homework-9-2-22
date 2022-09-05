package Homework4;

public class Movie {
    String movieTitle;
    String movieGenre;
    int movieRating;

    Movie(String title, String genre, int rating) {
        movieTitle = title;
        movieGenre = genre;
        movieRating = rating;
    }
    void playIt() {
        System.out.println("Playing the Movie " + movieTitle+ movieGenre + movieRating);
    }
}