package by.itstep.pashka.controller;

import by.itstep.pashka.model.entity.Track;


public class Main {
    public static void main(String[] args) throws Exception {

        Track track1 = new Track(3.59, "Sunshine", "blues", "loudly");
        Track track2 = new Track(5.09, "Sunset", "blues", "quiet");
        Track track3 = new Track(4.39, "Night", "juzz", "loudly");
        Track track4 = new Track(5.2, "Morning", "folk", "quiet");

        System.out.println(track1.getInfo(track1));
        System.out.println(track2.getInfo(track2));
        System.out.println(track3.getInfo(track3));
        System.out.println(track4.getInfo(track4));
    }

}
