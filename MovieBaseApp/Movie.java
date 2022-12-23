package MovieBaseApp;

/*
 * Описываем объект Movie и его свойства.
 */

public class Movie {
    int movieId;
    String name;
    int typeId;
    int studioId;

    public Movie(int movieId, String name, int typeId, int studioId) {
        this.movieId = movieId;
        this.studioId = studioId;
        this.name = name;
        this.typeId = typeId;
    }

    public String getMoveName() {
        return name;
    }

}