package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;

// import java.util.Arrays;

// import static org.junit.jupiter.api.Assertions.*;

class BubbleSorterTest {
    @Test
    @DisplayName("Given a set of jumbled numbers, list should return the array of numbers in order")
    public void GivenArrayOfNumbers_ListReturnsThemInOrder(){
        int[] list = {4, 2, 1, 5, 6, 3};
        int[] expectedList = {1, 2, 3, 4, 5, 6};
        int[] result = BubbleSorter.bubbleSort(list);
        Assertions.assertArrayEquals(expectedList, result);
    }
}