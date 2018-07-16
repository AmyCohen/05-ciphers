package Ciphers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeywordCipherTest extends Cipher{

    @Test
    void encodeShortWord() {
        String payload = "java";
        String keyword = "yellow";

        String modifiedKeyword = "";
        for (int i = 0; i < keyword.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(keyword.charAt(i)))) {
                modifiedKeyword += String.valueOf(keyword.charAt(i));
            }
        }

        String holdingAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(ALPHABET.charAt(i)))) {
                holdingAlphabet += String.valueOf(ALPHABET.charAt(i));
            }
        }

        KeywordCipher.REPLACEMENT_ALPHABET = modifiedKeyword + holdingAlphabet;

        String actual = replaceCharacters(payload, ALPHABET, KeywordCipher.REPLACEMENT_ALPHABET);
        String expected = "fyty";

        assertEquals(expected, actual);
    }

    @Test
    void encodeEmptyString() {
        String payload = "";
        String keyword = "yellow";

        String modifiedKeyword = "";
        for (int i = 0; i < keyword.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(keyword.charAt(i)))) {
                modifiedKeyword += String.valueOf(keyword.charAt(i));
            }
        }

        String holdingAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(ALPHABET.charAt(i)))) {
                holdingAlphabet += String.valueOf(ALPHABET.charAt(i));
            }
        }

        KeywordCipher.REPLACEMENT_ALPHABET = modifiedKeyword + holdingAlphabet;

        String actual = replaceCharacters(payload, ALPHABET, KeywordCipher.REPLACEMENT_ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void encodeLongWithWhiteSpaceAndNonLetters() {
        String payload = "i like java a lot!";
        String keyword = "yellow";

        String modifiedKeyword = "";
        for (int i = 0; i < keyword.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(keyword.charAt(i)))) {
                modifiedKeyword += String.valueOf(keyword.charAt(i));
            }
        }

        String holdingAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(ALPHABET.charAt(i)))) {
                holdingAlphabet += String.valueOf(ALPHABET.charAt(i));
            }
        }

        KeywordCipher.REPLACEMENT_ALPHABET = modifiedKeyword + holdingAlphabet;

        String actual = replaceCharacters(payload, ALPHABET, KeywordCipher.REPLACEMENT_ALPHABET);
        String expected = "d hdgw fyty y hkr!";

        assertEquals(expected, actual);
    }


    @Test
    void decodeShortWord() {
        String payload = "fyty";
        String keyword = "yellow";

        String modifiedKeyword = "";
        for (int i = 0; i < keyword.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(keyword.charAt(i)))) {
                modifiedKeyword += String.valueOf(keyword.charAt(i));
            }
        }

        String holdingAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(ALPHABET.charAt(i)))) {
                holdingAlphabet += String.valueOf(ALPHABET.charAt(i));
            }
        }

        KeywordCipher.REPLACEMENT_ALPHABET = modifiedKeyword + holdingAlphabet;

        String actual = replaceCharacters(payload, KeywordCipher.REPLACEMENT_ALPHABET, ALPHABET);
        String expected = "java";

        assertEquals(expected, actual);
    }

    @Test
    void decodeEmptyString() {
        String payload = "";
        String keyword = "yellow";

        String modifiedKeyword = "";
        for (int i = 0; i < keyword.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(keyword.charAt(i)))) {
                modifiedKeyword += String.valueOf(keyword.charAt(i));
            }
        }

        String holdingAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(ALPHABET.charAt(i)))) {
                holdingAlphabet += String.valueOf(ALPHABET.charAt(i));
            }
        }

        KeywordCipher.REPLACEMENT_ALPHABET = modifiedKeyword + holdingAlphabet;

        String actual = replaceCharacters(payload, KeywordCipher.REPLACEMENT_ALPHABET, ALPHABET);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    void decodeLongWithWhiteSpaceAndNonLetters() {
        String payload = "d hdgw fyty y hkr!";
        String keyword = "yellow";

        String modifiedKeyword = "";
        for (int i = 0; i < keyword.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(keyword.charAt(i)))) {
                modifiedKeyword += String.valueOf(keyword.charAt(i));
            }
        }

        String holdingAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(ALPHABET.charAt(i)))) {
                holdingAlphabet += String.valueOf(ALPHABET.charAt(i));
            }
        }

        KeywordCipher.REPLACEMENT_ALPHABET = modifiedKeyword + holdingAlphabet;

        String actual = replaceCharacters(payload, KeywordCipher.REPLACEMENT_ALPHABET, ALPHABET);
        String expected = "i like java a lot!";

        assertEquals(expected, actual);
    }
}