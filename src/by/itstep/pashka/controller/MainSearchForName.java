package by.itstep.pashka.controller;

import by.itstep.pashka.model.logic.SearchTrackForName;


public class MainSearchForName {
    public static void main(String[] args) throws NullPointerException,
            ArrayIndexOutOfBoundsException {

        Track track1 = new Track{"Morning"};

        boolean result = SearchTrackForName.checkTrackForName(" ");
        System.out.println(SearchTrackForName.checkTrackForName(" "));
    }
}