package podstawytestowanie.programowanie.testowanie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    public void init(){
        person = new Person();
    }

    @Test
    public void testPersonGetter(){

        //given
        person.setName("Bartek");

        //when
        String result = person.getName();

        //then
        assertNotNull(result);
        assertEquals("Bartek",result);

    }

    @Test
    public void testPersonFieldName_WhenNull(){

        //given

        //when
        String result = person.getName();

        //then
        assertNull(result);

    }

}