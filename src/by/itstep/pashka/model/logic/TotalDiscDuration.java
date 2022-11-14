package by.itstep.pashka.model.logic;


public class TotalDiscDuration {
    public static double calculateTotalDiscDuration(int[] Tracks) {
            if (Tracks == null || Tracks.length == 0) {
                throw new RuntimeException();
        }
        double total = 0;
        for (int track : Tracks) {
            total += track.getDuration();
        }
        return total;
    }

}


