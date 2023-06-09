import com.knoldus.Person;
import org.junit.jupiter.api.*;

public class PersonTest {

    Person person;
    @BeforeEach
    public void setup(){
        person=new Person();
    }

    @Test
    public void testSetAge_shouldSetInteger_givenIntegerAge() {
        person.setAge(32);
        Assertions.assertEquals(32, person.getAge());
        person.setAge(-76);
        Assertions.assertEquals(-76,person.getAge());
    }

    @Test
    public void testSetAge_shouldSetZero_givenInputZero() {
        person.setAge(0);
        Assertions.assertEquals(0,person.getAge());
    }

    @Test
    public void testGetName_shouldReturnString_givenStringName() {
        person.setName("Anshika");
        Assertions.assertEquals("Anshika", person.getName());
    }

    @Test
    public void testGetName_shouldReturnErrorString_givenEmptyName(){
        person.setName("");
        Assertions.assertEquals("Error! Empty Input.",person.getName());
    }

    @Test
    public void testGetEmail_shouldReturnString_givenStringEmail() {
        person.setEmail("anshika.srivastava@knoldus.com");
        Assertions.assertEquals("anshika.srivastava@knoldus.com", person.getEmail());
    }

    public void testGetEmail_shouldReturnErrorString_givenEmptyEmail(){
        person.setEmail("");
        Assertions.assertEquals("Error! Empty Input.",person.getEmail());
    }

    @Test
    public void testGetAge_shouldReturnInteger_givenIntegerAge() {
        person.setAge(22);
        Assertions.assertEquals(22, person.getAge());
        person.setAge(0);
        Assertions.assertEquals(0,person.getAge());
    }

    @Test
    public void testGetAge_shouldSetZero_givenInputZero() {
        person.setAge(0);
        Assertions.assertEquals(0,person.getAge());
    }

}
