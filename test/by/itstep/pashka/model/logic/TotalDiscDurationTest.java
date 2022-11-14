package by.itstep.pashka.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class TotalDiscDurationTest {

    @Test
    public void testCalculateTotalDiscDurationPositive() {

        int[] Tracks = {3.59, 4.39, 5.09, 5.2};

        double expected = 18.27;

        double actual =  TotalDiscDuration.calculateTotalDiscDuration(Tracks);
        assertEquals(expected, actual, 0.001);
    }

    @Test(expected = Exception.class)
    public void testLongestWithEmptyObject() {
        int[] Tracks = {};

        TheLongestTrack.findTheLongestTrack(Tracks);

    }

    @Test(expected = Exception.class)
    public void testLongestWithNull() {

        TheLongestTrack.findTheLongestTrack(null);

    }
}
