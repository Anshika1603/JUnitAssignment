import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    StringUtils stringUtils;
    @Before
    public void setup(){
        stringUtils=new StringUtils();
    }

    @Test
    public void testReverse_shouldReturn_String(){
        assertEquals("cba", stringUtils.reverse("abc"));
        assertEquals("Invalid Input", stringUtils.reverse(""));
        assertEquals("racecar", stringUtils.reverse("racecar"));
    }

    @Test
    public void testIsEmpty_shouldReturn_Boolean(){
        assertTrue(stringUtils.isEmpty(""));
        assertFalse(stringUtils.isEmpty("hello"));
    }

    @Test
    public void testIsPalindrome_shouldReturn_Boolean(){
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome(""));
    }
}
