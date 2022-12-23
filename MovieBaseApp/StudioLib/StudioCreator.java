package MovieBaseApp.StudioLib;

import MovieBaseApp.Studio;;

/*
 * Создаем объект "Студия"
 */

public class StudioCreator {
    int count = 1;

    public Studio newStudio(String name) {
        Studio studio = new Studio();
        studio.studioId = count++;
        studio.name = name;
        return studio;
    }
}