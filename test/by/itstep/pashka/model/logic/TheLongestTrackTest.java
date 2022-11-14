package by.itstep.pashka.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheLongestTrackTest {

    @Test
    public void testLongestTrackPositive() {
       int[] Tracks = {3.59, 5.09, 4.39, 5.2};

        double expected = 5.2;

        double actual = TheLongestTrack.findTheLongestTrack(Tracks);
        assertEquals(expected, actual, 0.001);
    }


    @Test
    public void testLongestTrackNegative() {
        int[] Tracks = {3.59, 5.09, 4.39, 5.2};

        double expected =10;

        double actual = TheLongestTrack.findTheLongestTrack(Tracks);
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

