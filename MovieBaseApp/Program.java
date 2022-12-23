package MovieBaseApp;

import MovieBaseApp.DataBase;

public class Program {
    public static void main(String[] args) {
        DataBase db1 = new DataBase();
        MovieFinder finder = new MovieFinder(db1);

        System.out.println(finder.findMovie("Аватар"));
        // System.out.println(finder.getMovieId(3));
        // DataBase.printListMovies();
    }
}