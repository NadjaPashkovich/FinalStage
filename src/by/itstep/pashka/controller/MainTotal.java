package by.itstep.pashka.controller;

import by.itstep.pashka.model.logic.TotalDiscDuration;
import by.itstep.pashka.model.entity.Track;

public class MainTotal {
    public static void main(String[] args) {
        Track[] Tracks = {new Track(3.59), new Track(5.09), new Track(4.39), new Track(5.2)};
                double duration =TotalDisckDuration.calculateTotalDiscDuration(Tracks);
        System.out.printf("Total disc duration  = %.2f ", duration);
    }


}
