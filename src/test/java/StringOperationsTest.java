import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOperationsTest {
    StringOperations stringOperations;
    @Before
    public void setup(){
        stringOperations =new StringOperations();
    }

    @Test
    public void testReverse_shouldReturnString_givenString(){
        assertEquals("cba", stringOperations.reverse("abc"));
        assertEquals("racecar", stringOperations.reverse("racecar"));
    }

    @Test
    public void testReverse_shouldReturnErrorText_givenEmptyString(){
        assertEquals("Invalid Input", stringOperations.reverse(""));
    }

    @Test
    public void testIsEmpty_shouldReturnFalse_givenString(){
        assertFalse(stringOperations.isEmpty("hello"));
    }

    @Test
    public void testIsEmpty_shouldReturnTrue_givenEmptyString(){
        assertTrue(stringOperations.isEmpty(""));
    }

    @Test
    public void testIsPalindrome_shouldReturnBoolean_givenString(){
        assertTrue(stringOperations.isPalindrome("racecar"));
        assertTrue(stringOperations.isPalindrome("madam"));
        assertFalse(stringOperations.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome_shouldReturnFalse_givenEmptyString(){
        assertFalse(stringOperations.isPalindrome(""));
    }
}
