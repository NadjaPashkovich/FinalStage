package by.itstep.pashka.model.logic;


public class TheLongestTrack {
    public static double findTheLongestTrack(int[] Tracks) {

        if (Tracks == null || Tracks.length == 0) {
            throw new RuntimeException();

        }
        double max = Tracks[0];
        for (int i = 1; i < Tracks.length; i++) {
            if (Tracks[i] > max) {
                max = Tracks[i];
            }
        }
        return max;
    }
}


