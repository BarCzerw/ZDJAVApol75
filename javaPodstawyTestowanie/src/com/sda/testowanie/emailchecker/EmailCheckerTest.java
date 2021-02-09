package com.sda.testowanie.emailchecker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EmailCheckerTest {

    EmailChecker emailChecker = new EmailChecker();

    @BeforeEach
    void init(){
        emailChecker = new EmailChecker();
    }

    @ParameterizedTest
    @ValueSource(strings={"abc@gmail.com"})

    @Test
    void testEmailCheckerShouldBeTrue(String email){

        //given


        //when
        boolean result = emailChecker.isValidEmail(email);

        //then
        assertTrue(result);

    }

    @Test
    void testEmailCheckerShouldBeFalse(){

        //given
        String email = "@gmail.com";

        //when


        //then
        assertFalse(emailChecker.isValidEmail(email));

    }

    @Test
    void testEmailCheckerShouldBeFalseSecond(){

        //given
        String email = "abc@gmail";

        //when


        //then
        assertFalse(emailChecker.isValidEmail(email));

    }

    @Test
    void testEmailCheckerShouldBeFalseThird(){

        //given
        String email = "abc@.com";

        //when


        //then
        assertFalse(emailChecker.isValidEmail(email));

    }

}