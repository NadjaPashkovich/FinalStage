package by.itstep.pashka.model.logic;

public class Disc {
    public static final int DEFAULT_SIZE = 10;

    private Track[] list;
    private int cursor;

    public Disc() {
        list = new Track[DEFAULT_SIZE];
        cursor = 0;
    }

    public void addTrack(Track tracks) {
        if (cursor < list.length) {
            list[cursor] = tracks;
            cursor++;
        }
    }

    public void deleteTrack(Track tracks) {
        if (cursor < list.length) {
            list[cursor] = tracks;
            cursor--;
        }
    }

    public Track get(int index) {
        return list[index];
    }

    public int size() {
        return cursor;
    }


    public String getInfo(Track[] list) {
        return new String();

    }

    public record Track() {
    }
}


