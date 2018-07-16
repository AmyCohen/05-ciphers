package Ciphers;

import org.junit.jupiter.api.Test;

import static Ciphers.Cipher.ALPHABET;
import static org.junit.jupiter.api.Assertions.*;

class CipherTest extends Cipher{
    @Test
    void encodeShortWord() {
        String payload = "java";

        String actual = replaceCharacters(payload, ALPHABET, ALPHABET);
        String expected = "java";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        String payload = "";

        String actual = replaceCharacters(payload, ALPHABET, ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void encodeLongWithWhiteSpaceAndNonLetters() {
        String payload = "i like java a lot!";

        String actual = replaceCharacters(payload, ALPHABET, ALPHABET);
        String expected = "i like java a lot!";

        assertEquals(expected, actual);
    }

    @Test
    void decodeShortWord() {
        String payload = "java";

        String actual = replaceCharacters(payload, ALPHABET, ALPHABET);
        String expected = "java";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        String payload = "";

        String actual = replaceCharacters(payload, ALPHABET, ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void decodeLongWithWhiteSpaceAndNonLetters() {
        String payload = "i like java a lot!";

        String actual = replaceCharacters(payload, ALPHABET, ALPHABET);
        String expected = "i like java a lot!";

        assertEquals(expected, actual);
    }
}