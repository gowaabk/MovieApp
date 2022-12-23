package MovieBaseApp;

import MovieBaseApp.StudioLib.TypeCreator;
import MovieBaseApp.StudioLib.StudioCreator;
import MovieBaseApp.Movie;
import MovieBaseApp.MovieFinder;

import java.util.ArrayList;

/*
 * Создание и заполнение БД
 */

public class DataBase {
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Studio> studios = new ArrayList<>();
    ArrayList<MovieType> typeMovie = new ArrayList<>();

    public DataBase() {
        Movie movie1 = new Movie(1, "Аватар", 2, 1);
        Movie movie2 = new Movie(2, "Не шутите с Зоханом", 2, 2);
        Movie movie3 = new Movie(3, "Поезд в Пуссан", 1, 3);
        Movie movie4 = new Movie(5, "Периферийные устройства", 2, 4);
        Movie movie5 = new Movie(6, "София", 2, 4);
        Movie movie6 = new Movie(7, "Трасса 60", 2, 4);

        this.addMovie(movie1);
        this.addMovie(movie2);
        this.addMovie(movie3);
        this.addMovie(movie4);
        this.addMovie(movie5);
        this.addMovie(movie6);

        TypeCreator tc = new TypeCreator();
        this.addType(tc.newType("Ужасы"));
        this.addType(tc.newType("Фантастика"));
        this.addType(tc.newType("Драма"));

        StudioCreator scf = new StudioCreator();
        this.addStudio(scf.newStudio("GoldStar"));
        this.addStudio(scf.newStudio("20th Century Fox"));
        this.addStudio(scf.newStudio("Columbia Pictures"));
        this.addStudio(scf.newStudio("Paramount Pictures"));
    }

    public void addStudio(Studio studio) {
        studios.add(studio);
    }

    public void addType(MovieType movieType) {
        typeMovie.add(movieType);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // static void printListMovies() {
    // // for (Movie movie : movies) {
    // System.out.println(movie.getFilmName());
    // // }
    // }
}