package Ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ROT13CipherTest extends Cipher{

    @Test
    void encodeShortString() {
        String payload = "java";
        String actual = replaceCharacters(payload, ALPHABET, ROT13Cipher.REPLACEMENT_ALPHABET);
        String expected = "wnin";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        String payload = "";
        String actual = replaceCharacters(payload, ALPHABET, ROT13Cipher.REPLACEMENT_ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void encodeLongWithWhiteSpaceAndNonLetters() {
        String payload = "i like java a lot!";
        String actual = replaceCharacters(payload, ALPHABET, ROT13Cipher.REPLACEMENT_ALPHABET);
        String expected = "v yvxr wnin n ybg!";

        assertEquals(expected, actual);
    }

    @Test
    void decodeShortString() {
        String payload = "wnin";
        String actual = replaceCharacters(payload, ROT13Cipher.REPLACEMENT_ALPHABET, ALPHABET);
        String expected = "java";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        String payload = "";
        String actual = replaceCharacters(payload, ROT13Cipher.REPLACEMENT_ALPHABET, ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void decodeLongWithWhiteSpaceAndNonLetters() {
        String payload = "v yvxr wnin n ybg!";
        String actual = replaceCharacters(payload, ROT13Cipher.REPLACEMENT_ALPHABET, ALPHABET);
        String expected = "i like java a lot!";

        assertEquals(expected, actual);
    }

}