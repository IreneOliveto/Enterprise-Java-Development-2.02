package Exercise2Test;

import Exercise1.OddNumbers;
import Exercise2.JavaKeywords;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaKeywordsTest {

    @Test
    public void whenJavaKeyIsInString_shouldReturnTrue() {
        boolean expected = true;

        JavaKeywords javaKeywords = new JavaKeywords();

        boolean result = javaKeywords.hasJavaKeyword("Don't break my heart");

        assertEquals(expected, result);

    }

    @Test
    public void whenJavaKeyIsNotInString_shouldReturnFalse() {
        boolean expected = false;

        JavaKeywords javaKeywords = new JavaKeywords();

        boolean result = javaKeywords.hasJavaKeyword("I love to breakdance");

        assertEquals(expected, result);

    }


}
