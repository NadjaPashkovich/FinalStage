package by.itstep.pashka.model.logic;

public class SortingForAscOfDuration {
    public static void selectedSortingForAscOfDuration(int[] Tracks) {
        if (Tracks == null || Tracks.length == 0) {
            throw new RuntimeException();
        }
        for (int j = 0; j < Tracks.length - 1; j++) {
            for (int i = 0; i < Tracks.length - 1 - j; i++) {

                if (Tracks[i] > Tracks[i + 1]) {
                    int t = Tracks[i];
                    Tracks[i] = Tracks[i + 1];
                    Tracks[i + 1] = t;
                }
            }
        }
    }
}


