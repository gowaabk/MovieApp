package MovieBaseApp;

import java.util.ArrayList;

/*
 * Поиск фильма по названию.
 */

public class MovieFinder {
    DataBase db;

    public MovieFinder(DataBase db) {
        this.db = db;
    }

    public String getMovieId(int id) {
        Movie movie = db.movies.get(id - 1);

        return String.format("ID: %d, Название: %s, Тип: %s, Студия: %s",
                movie.movieId,
                movie.name,
                db.typeMovie.get(movie.typeId - 1).name,
                db.studios.get(movie.studioId - 1).name);
    }

    public String findMovie(String name) {
        ArrayList<Movie> movies = db.movies;

        for (Movie movie : movies) {
            if (name.equals(movie.getMoveName())) {
                return String.format("Фильм %s найден в базе. ID: %d,Тип: %s, Студия: %s",
                        name,
                        movie.movieId,
                        db.typeMovie.get(movie.typeId - 1).name,
                        db.studios.get(movie.studioId - 1).name);
            }
        }
        return String.format("Фильм %s в базе не найден.", name);
    }
}