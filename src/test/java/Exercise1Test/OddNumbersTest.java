package Exercise1Test;

import Exercise1.OddNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddNumbersTest {

    @Test
    @DisplayName("When n is greater than one, should return all odd numbers")
    public void whenNIsGreaterThanOne_shouldReturnAllOddNumbers() {

        int[] expected = {1, 3, 5, 7, 9};

        OddNumbers oddNumbers = new OddNumbers();
        int[] result = oddNumbers.oddInteger(10);

        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("When n is smaller than one, should return an empty array")
    public void whenNIsSmallerThanOne_shouldReturnEmptyArray() {

        int[] expected = {};

        OddNumbers oddNumbers = new OddNumbers();
        int[] result = oddNumbers.oddInteger(0);

        assertArrayEquals(expected, result);
    }
}