package podstawytestowanie.programowanie.testowanie.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account ac;

    @BeforeEach
    void init(){
        ac = new Account("Me","00-1234-5678-9012-3456-7890-1234");
    }

    @Test
    void testAccountCreation(){

        //given
        Account ac = new Account("Me","00 1489-8978-6928-4879-9154-5982");
        String expected = "00148989786928487991545982";

        //when
        String result = ac.getNumber();

        //then
        assertEquals(expected,result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"00-1245-1584-2695-5849-3621-0051", "00154896325194758316944875", "00 4917 3157 6954 1482 2258 3621"})
    void testIsValidShouldBeTrue(String number) {

        //given

        //when
        boolean result = Account.isNumberValid(number);

        //then
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"00-1245-1584-2695-5849-3621-00", "001548963251758316944875", "00 4917 3157 6954 1482 2258 3621 aa", ""})
    void testIsValidShouldBeFalse(String number) {

        //given

        //when
        boolean result = Account.isNumberValid(number);

        //then
        assertFalse(result);

    }

    @ParameterizedTest
    @ValueSource(doubles = {154.89,75.98,0.01,489.78})
    void testIsTransferValidShouldBePositive(double ammount){

        //given
        ac.receiveAmount(489.78);

        //when
        boolean result = ac.isTransferValid(ammount);

        //then
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(doubles = {521.98,-0.01,-489.78})
    void testIsTransferValidShouldBeNegative(double ammount){

        //given
        ac.receiveAmount(489.78);

        //when
        boolean result = ac.isTransferValid(ammount);

        //then
        assertFalse(result);

    }

    @ParameterizedTest
    @ValueSource(doubles = {148.97,14.87,89.99})
    void testSendAmountShouldReturnProperBalance(double amount){

        //given
        ac.receiveAmount(489.78);
        double expected = ac.getBalance()-amount;

        //when
        double result = ac.sendAmount(amount);

        //then
        assertEquals(expected,result);

    }

    @ParameterizedTest
    @ValueSource(doubles = {-148.97,589.87,489.79})
    void testSendAmountShouldNotSendAndNotChangeBalance(double amount){

        //given
        ac.receiveAmount(489.78);
        double expected = ac.getBalance();

        //when
        double result = ac.sendAmount(amount);

        //then
        assertEquals(expected,result);

    }

}