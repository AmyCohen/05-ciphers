package Ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarShiftCipherTest extends Cipher{

    @Test
    void encodeShortWord() {
        String payload = "java";
        int shiftedAmount = 10;

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);
        CaesarShiftCipher.REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        String actual = replaceCharacters(payload, ALPHABET, CaesarShiftCipher.REPLACEMENT_ALPHABET);
        String expected ="tkfk";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        String payload = "";
        int shiftedAmount = 10;

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);
        CaesarShiftCipher.REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        String actual = replaceCharacters(payload, ALPHABET, CaesarShiftCipher.REPLACEMENT_ALPHABET);
        String expected ="";

        assertEquals(expected, actual);
    }

    @Test
    void encodeLongWithWhiteSpaceAndNonLetters() {
        String payload = "i like java a lot!";
        int shiftedAmount = 10;

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);
        CaesarShiftCipher.REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        String actual = replaceCharacters(payload, ALPHABET, CaesarShiftCipher.REPLACEMENT_ALPHABET);
        String expected ="s vsuo tkfk k vyd!";

        assertEquals(expected, actual);
    }

    @Test
    void decodeShortWord() {
        String payload = "tkfk";
        int shiftedAmount = 10;

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);
        CaesarShiftCipher.REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        String actual = replaceCharacters(payload, CaesarShiftCipher.REPLACEMENT_ALPHABET, ALPHABET);
        String expected ="java";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        String payload = "";
        int shiftedAmount = 10;

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);
        CaesarShiftCipher.REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        String actual = replaceCharacters(payload, CaesarShiftCipher.REPLACEMENT_ALPHABET, ALPHABET);
        String expected ="";

        assertEquals(expected, actual);
    }

    @Test
    void decodeLongWithWhiteSpaceAndNonLetters() {
        String payload = "s vsuo tkfk k vyd!";
        int shiftedAmount = 10;

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);
        CaesarShiftCipher.REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        String actual = replaceCharacters(payload, CaesarShiftCipher.REPLACEMENT_ALPHABET, ALPHABET);
        String expected ="i like java a lot!";

        assertEquals(expected, actual);
    }
}