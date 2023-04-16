package test.main.java;

import java.time.LocalDate;

// import org.junit.Test;
import main.java.Person;

public class PersonTest {
    // @Test
    public void personTest() {
        LocalDate bday = LocalDate.parse("2007-01-08");
        Person one = new Person("John", bday, Person.Sex.OTHER, "nobody@nowhere.com");
        assert 1 == 1;

    }
}
