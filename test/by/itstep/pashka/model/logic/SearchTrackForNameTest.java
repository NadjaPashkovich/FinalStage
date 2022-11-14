package by.itstep.pashka.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchTrackForNameTest {

    @Test
    public void testSearchForNamePositive() {
        int[] Tracks = {"Sunshine", "Sunset", "Night", "Morning"};

        Track track1 = new Track{"Morning"};
        String expected = "Morning ";

        String actual = SearchTrackForName.searchTrackForName(Tracks);
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void testSearchForNameWithEmptyObject() {
        int[] Tracks = {};

        SearchTrackForName.searchTrackForName(Tracks);

    }

    @Test(expected = Exception.class)
    public void testSearchForNameWithNull() {

        SearchTrackForName.searchTrackForName(null);

    }
}
