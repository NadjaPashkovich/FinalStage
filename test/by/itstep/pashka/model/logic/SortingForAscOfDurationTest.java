package by.itstep.pashka.model.logic;

import org.junit.Test;

import static  org.junit.Assert.*;

public class SortingForAscOfDurationTest {

    @Test
    public void testSortingPositive() {
        int[] Tracks = {3.59, 5.09, 4.39, 5.2};

        double expected ={3.59, 4.39, 5.09, 5.2} ;

        double actual =  SortingForAscOfDuration.selectedSortingForAscOfDuration(Tracks);
        assertEquals(expected, actual, 0.001);
    }

    @Test(expected = Exception.class)
    public void testSortingWithEmptyObject() {
        int[] Tracks = {};

        SortingForAscOfDuration.selectedSortingForAscOfDuration(Tracks);

    }

    @Test(expected = Exception.class)
    public void testSortingWithNull() {

        SortingForAscOfDuration.selectedSortingForAscOfDuration(null);

    }
}
