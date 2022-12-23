package MovieBaseApp.StudioLib;

import MovieBaseApp.MovieType;

/*
 * Создаем объект "Жанр фильма"
 */

public class TypeCreator {
    int count = 1;

    public MovieType newType(String name) {
        MovieType type = new MovieType();
        type.name = name;
        type.genreId = count++;
        return type;
    }
}