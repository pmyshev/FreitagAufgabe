package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void isPasswordLengthValid() {
        String given = "This is an example of a password with more than 8 characters";
        boolean expected = true;
        boolean actual = Main.isPasswordLengthValid(given);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void isPasswordLengthLessThan8Characters() {
        String given = "1234";
        boolean expected = false;
        boolean actual = Main.isPasswordLengthValid(given);
        assertEquals(expected, actual);

    }

    @Test
    void checkPasswordContainsOneNumber() {
        String given = "This is an example of a password with 1 number";
        boolean expected = true;
        boolean actual = Main.isPasswordContainsNumber(given);
        assertEquals(expected, actual);
    }

    @Test
    void checkPasswordDoesNotContainsNumber() {
        String given = "This password does not contain numbers";
        boolean expected = false;
        boolean actual = Main.isPasswordContainsNumber(given);
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWeakCheckBadPasswordTrue() {
        String given = "bad_password";
        boolean expected = true;
        boolean actual = Main.isPasswordWeak(given);
        assertEquals(expected, actual);
    }

    @Test
    void isPasswordWeakCheckBadPasswordFalse() {
        String given = "hFe86wjefjf";
        boolean expected = false;
        boolean actual = Main.isPasswordWeak(given);
        assertEquals(expected, actual);
    }
}