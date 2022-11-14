package by.itstep.pashka.model.logic;

public class SearchTrackForName {
    public static String searchTrackForName(int[] Tracks, String name) {

        if (Tracks == null || Tracks.length == 0) {
            throw new RuntimeException();
        }
        for (int track : Tracks) {
            if (name == name.toString()) {
                return name;
            }
        }
        return "this name is not found";
    }

}