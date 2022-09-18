package org.example.lesson3;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class PalindromeTest {
    @Test
    @DisplayName("Метод проверки палиндрома с нечетным количеством символов")
    void givenPalindromeWhenCallIsPalindromeMethodThenTrue() {
        boolean result = Palindrome.isPalindrome("1234321");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Метод проверки палиндрома с пустым значением")
    void emptyStringForPalindromeThenFalse(){
        boolean result = Palindrome.isPalindrome("");
        Assertions.assertTrue(result);
    }

    @Test
    @Disabled("broken")
    @DisplayName("Метод проверки палиндрома с четным количеством символов")
    void palindromeTest() {
        boolean result = Palindrome.isPalindrome("123321");
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @Tag("smoke") //mvn test -D groups=smoke
    @ValueSource(strings = {"123321", "1235321"})
    void isPalindromeTestWithDataProvider(String word) {
        boolean result = Palindrome.isPalindrome(word);
        Assertions.assertTrue(result);
    }
}
