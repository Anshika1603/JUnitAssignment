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
        assertEquals("Invalid Input", stringOperations.reverse(""));
        assertEquals("racecar", stringOperations.reverse("racecar"));
    }

    @Test
    public void testIsEmpty_shouldReturnBoolean_givenString(){
        assertTrue(stringOperations.isEmpty(""));
        assertFalse(stringOperations.isEmpty("hello"));
    }

    @Test
    public void testIsPalindrome_shouldReturnBoolean_givenString(){
        assertTrue(stringOperations.isPalindrome("racecar"));
        assertTrue(stringOperations.isPalindrome("madam"));
        assertFalse(stringOperations.isPalindrome("hello"));
        assertFalse(stringOperations.isPalindrome(""));
    }
}
